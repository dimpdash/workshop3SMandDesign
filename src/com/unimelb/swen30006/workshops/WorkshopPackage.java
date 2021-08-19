package com.unimelb.swen30006.workshops;

import java.text.DateFormat;

public class WorkshopPackage {
    
    public static void main(String[] args){
        System.out.println("Creating Staff");
        String[] roles = {"lecture", "research"};
        Staff staff1 = new Staff("Melbourne Australia", new DateFormat().parse("1/1/1999"), "Michael", roles, "1234");
        Student student1 = new Student("Melbourne Australia", new DateFormat().parse("1/1/2015"), "Jenny", "dancer@hotmail.com", "996308");
        Student student2 = new Student("Melbourne Sydney", new DateFormat().parse("1/1/2014"), "Benny", "baker@hotmail.com", "996309");

        Subject subject = Subject("Complex Analysis", "Mast30001");

        //Create assessment
        subject.createAssignment();
        //TODO cannot specify what the assignment is
        
        //Student submit assignment



        //Delete assignment
        // subject.deleteAssignment(assignmentName)
        //TODO cannot deleteAssignment as cannot access 
        

        }
    }
}
