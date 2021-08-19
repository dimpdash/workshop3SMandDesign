package com.unimelb.swen30006.workshops;

import java.util.Date;

import javax.annotation.processing.ProcessingEnvironment;

public class Staff extends Person {
    private String[] roles;
    private String staffID;

    Staff(String address, Date dob, String name, String[] roles, String staffId){
        super(address, dob, name);
        this.roles = roles;
        this.staffID = staffId;
    }
}
