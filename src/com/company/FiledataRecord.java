package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class FiledataRecord {

    private String path = "";

    public FiledataRecord(String path) {
        this.path = path;
    }

    public void recordLogin() {

        FileParser fileparser = new FileParser(path);
        String[] arrayLogin = fileparser.createArrayLogin();


        try {
            try {
                FileWriter fw = new FileWriter("logins.txt");


                for (int i = 0; i < arrayLogin.length; i++) {
                    if (arrayLogin[i].length() < 5) {
                        fw.write("");
                        fw.write("\n");

                    } else {
                        fw.write(arrayLogin[i]);
                        fw.write("\n");
                    }
                }

                fw.flush();
                fw.close();

            } catch (IOException e) {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            System.out.println("Something go wrong!");
        }


    }


    public void recordPass() {

        FileParser fileparser = new FileParser(path);
        String[] arrayPass = fileparser.createArrayPass();


        try {
            try {
                FileWriter fw = new FileWriter("Pass.txt");


                for (int i = 0; i < arrayPass.length; i++) {
                    if (arrayPass[i].length() < 5) {
                        fw.write("");
                        fw.write("\n");

                    } else {
                        fw.write(arrayPass[i]);
                        fw.write("\n");
                    }

                }

                fw.flush();
                fw.close();

            } catch (IOException e) {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            System.out.println("Something go wrong!");
        }


    }

    public void recordPassFiles() {

        FileParser fileParser = new FileParser(path);

        String[] login = fileParser.createArrayLogin();
        String[] pass = fileParser.createArrayPass();

        try {

            int index = 0;

            for (int i = 0; i < login.length; i++) {

                FileWriter fw = new FileWriter(login[i] + ".txt");
                fw.write(pass[index]);
                index++;
                fw.flush();
                fw.close();

            }


        } catch (IOException e) {
            System.out.println("I/O exception.Sorry");
        }

    }
}



