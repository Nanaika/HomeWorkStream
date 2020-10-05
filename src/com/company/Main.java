package com.company;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class Main {


    public static void main(String[] args)  {






        FiledataRecord fileDataRecord = new FiledataRecord(args[0]);




            fileDataRecord.recordLogin();
            fileDataRecord.recordPass();

            fileDataRecord.recordPassFiles();

        DirParser dirParser = new DirParser("C:\\Users\\Nanaec\\IdeaProjects\\HOMEWORKS",".txt");
        dirParser.printFiles();

    }


}
