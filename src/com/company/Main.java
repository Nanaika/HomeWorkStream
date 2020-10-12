package com.company;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

//        File dataFile = new File(args[0]);

        String dirPath = args[1];

        DirParser dirParser = new DirParser(dirPath,".txt");

        dirParser.printParsedTxtFiles();

//        dirParser.printFiles();
//        dirParser.printParsedFiles();

//        File file = new File(args[3]);
//        FiledataRecord fileDataRecord = new FiledataRecord(args[0]);
//        fileDataRecord.recordLogin();
//        fileDataRecord.recordPass();
//        fileDataRecord.recordPassFiles();
//        DirParser dirParser = new DirParser(file.getAbsolutePath(), ".txt");
//        dirParser.printFiles();
//        System.out.println(dirParser.getCurrentDir());
//        System.out.println(dirParser.getCurrentDir());
//        dirParser.setNewDir(args[1]);
//        dirParser.setFilter(".jpg");
//        dirParser.printFiles();
//        File file2 = new File("D:\\games\\Agony Unrated\\");
//        String[] list = file2.list();
//        System.out.println(Arrays.toString(list));
//        File file3 = new File(list[list.length - 5]);
//        System.out.println(file2.getPath());
//        System.out.println(file3.getPath());
//        FileInputStream fi = new FileInputStream(file3.getAbsolutePath());
//
//        int sym = 0;
//        String value = "";
//        while (sym != -1) {
//            sym = fi.read();
//            value += (char) sym;
//        }
//        System.out.println(value);

    }


}
