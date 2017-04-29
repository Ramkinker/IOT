package com.exchange.crowd.crowdexchange;

import java.io.Serializable;

/**
 * Created by ramkinkersingh on 4/28/17.
 */

public class AccountDetails implements Serializable {
    private String name;
    private String email;

    AccountDetails(String n,String e){
        name=n;
        email=e;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
