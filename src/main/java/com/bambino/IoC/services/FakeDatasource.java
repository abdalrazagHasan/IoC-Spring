package com.bambino.IoC.services;

public class FakeDatasource {

    private String username;
    private String password;
    private String url;
    private String OperatingEnvironment;

    public FakeDatasource() {
    }

    public String getOperatingEnvironment() {
        return OperatingEnvironment;
    }

    public void setOperatingEnvironment(String operatingEnvironment) {
        OperatingEnvironment = operatingEnvironment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDatasource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", OperatingEnvironment='" + OperatingEnvironment + '\'' +
                '}';
    }
}
