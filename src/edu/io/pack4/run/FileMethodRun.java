package edu.io.pack4.run;

import edu.io.pack4.service.FileMethodService;

public class FileMethodRun {
    public static void main(String[] args){

        FileMethodService fileMethodService = new FileMethodService();
        // fileMethodService.createDirMethod();
        fileMethodService.createFileMethod();

    }
}
