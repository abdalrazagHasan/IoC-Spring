package com.bambino.IoC;

import com.bambino.IoC.services.FakeDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDatasource {

    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;

    @Bean
    public FakeDatasource fakeDatasource(){
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUsername(username);
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        return fakeDatasource;
    }

    @Bean
    public PropertyPlaceholderAutoConfiguration properties(){
        PropertyPlaceholderAutoConfiguration properties = new PropertyPlaceholderAutoConfiguration();
        return properties;
    }
}
