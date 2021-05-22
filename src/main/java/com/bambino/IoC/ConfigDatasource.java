package com.bambino.IoC;

import com.bambino.IoC.services.FakeDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class ConfigDatasource {

    private final Environment env;

    @Autowired
    public ConfigDatasource(Environment env){
        this.env = env;
    }


    @Value("${DATABASE_USERNAME}")
    private String username;
    @Value("${DATABASE_PASSWORD}")
    private String password;
    @Value("${DATABASE_URL}")
    private String url;

    @Value("${JMS_WHATEVER}")
    private String jmsWhatever;



    @Bean
    public FakeDatasource fakeDatasource(){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUsername(username);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        fakeDatasource.setOperatingEnvironment(env.getProperty("DESKTOP_SESSION"));
        fakeDatasource.setJmsId(jmsWhatever);
        return fakeDatasource;
    }


}
