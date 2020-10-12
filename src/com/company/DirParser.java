package com.company;

import java.io.*;

public class DirParser {

    private String extension;
    private String path;

    DirParser(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    public void setNewDir(String path) {
        this.path = path;

    }

    public String getCurrentDir() {
        return this.path;

    }

    public void setFilter(String extension) {
        this.extension = extension;
    }


    public String[] sortFiles() {

        File file = new File(path);
        FilenameFilter ff = new FileType(extension);
        return file.list(ff);

    }


    public void printFiles() {
        File dir = new File(this.path);
        String[] files = dir.list();

        for (String file : files) {
            System.out.println(file);
        }
    }

    public void printParsedTxtFiles() {

        if (this.extension != ".txt") {
            System.out.println("Sorry!" +
                    "Can parse only txt files!" +
                    "Set extension to txt!");

        } else {

            String[] tempArray = sortFiles();
            String pass = "";

            for (int i = 0; i < tempArray.length; i++) {

                if (tempArray[i].startsWith("logins") ||
                        tempArray[i].startsWith("Pass")) {
                    continue;
                } else {

                    try {
                        FileReader fr = new FileReader(tempArray[i]);
                        int sym = 0;
                        while (sym != -1) {
                            sym = fr.read();
                            pass += (char) sym;

                        }
                        fr.close();
                        if (pass.length() > 5) {
                            System.out.println(tempArray[i]);
                            pass = "";
                        } else {
                            continue;
                        }


                    } catch (FileNotFoundException e) {
                        System.out.println("Sorry file not found.");
                        System.out.println("Check file directory.");
                        e.printStackTrace();
                    } catch (IOException e) {
                        System.out.println("I/O exception.Sorry!");
                    }
                }
            }



        }


    }


}
