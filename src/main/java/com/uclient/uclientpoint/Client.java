// language: java
package com.uclient.uclientpoint;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private Long id;
    private String CPF;
    private String CEP;
    private String user;
    private String password;
    private static Map<Long, String> cliUsernames = new HashMap<>();
    private static Map<Long, String> cliPasswords = new HashMap<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // Como username e senha utiliza hashma estático, não já necessidade de getters e setters para esses atributos individuais


    public static Map<Long, String> getCliUsernames() {
        return cliUsernames;
    }

    public static Map<Long, String> getCliPasswords() {
        return cliPasswords;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", CPF='" + CPF + '\'' +
                ", CEP='" + CEP + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
