package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
class File {
    private Date createdDate;
    private String fileData;
    private String fileName;



    public File(String fileName, String fileData){
        this(fileName, fileData, new Date());
    }

    File(String fileName, String fileData, Date createdDate){
        this.fileName = fileName;
        this.fileData = fileData;
        this.createdDate = createdDate;
    }

    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }

    public int fileSize(){
        return fileData.length();
    }
    
    public String content(){
        return fileData;
    }
}