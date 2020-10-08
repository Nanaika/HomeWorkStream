package com.company;


import java.io.File;

public class Main {


    public static void main(String[] args) {


        File file = new File(args[3]);


        FiledataRecord fileDataRecord = new FiledataRecord(args[0]);


        fileDataRecord.recordLogin();
        fileDataRecord.recordPass();
        fileDataRecord.recordPassFiles();

        DirParser dirParser = new DirParser(file.getAbsolutePath(), ".txt");
        dirParser.printFiles();
//        System.out.println(dirParser.getCurrentDir());
//        System.out.println(dirParser.getCurrentDir());
//        dirParser.setNewDir(args[1]);
//        dirParser.setFilter(".jpg");
//        dirParser.printFiles();

    }


}
