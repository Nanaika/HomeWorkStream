package com.company;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class Main {


    public static void main(String[] args)  {




        FileParser fileParser = new FileParser();
        fileParser.setPath(args[0]);

        FiledataRecord fileDataRecord = new FiledataRecord();




            fileDataRecord.recordLogin();
            fileDataRecord.recordPass();




    }


}
