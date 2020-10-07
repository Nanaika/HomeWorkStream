package com.company;


public class Main {


    public static void main(String[] args)  {






        FiledataRecord fileDataRecord = new FiledataRecord(args[0]);




            fileDataRecord.recordLogin();
            fileDataRecord.recordPass();

            fileDataRecord.recordPassFiles();

        DirParser dirParser = new DirParser(args[1],".txt");
        dirParser.printFiles();
//        System.out.println(dirParser.getCurrentDir());
//        dirParser.setNewDir("C:\\AMD\\");
//        System.out.println(dirParser.getCurrentDir());
//        dirParser.setNewDir(args[1]);
//        dirParser.setFilter(".jpg");
//        dirParser.printFiles();
    }


}
