package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
public class Submission {
    private static int attemptNum = 0;
    private File[] files;
    private int numFiles;

    Submission()
    // Return two fake files
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }
}

