package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Student extends Person{
    private String email;
    private String studentID;

    Student(String address, Date dob, String name, String email, String studentID){
        super(address,dob,name);
        this.email = email;
        this.studentID = studentID;
    }
}
