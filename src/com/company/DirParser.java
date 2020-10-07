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

        String[] arrayFiles = sortFiles();
        String pass = "";

        for (int i = 0; i < arrayFiles.length; i++) {


            if (arrayFiles[i].startsWith("logins") ||
                    arrayFiles[i].startsWith("Pass")) {
                continue;
            } else {

                try {
                    FileReader fr = new FileReader(arrayFiles[i]);
                    int sym = 0;
                    while (sym != -1) {
                        sym = fr.read();
                        pass += (char) sym;

                    }
                    fr.close();
                    if (pass.length() > 5) {
                        System.out.println(arrayFiles[i]);
                        pass = "";
                    } else {
                        continue;
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Sorry file not found.");
                    System.out.println("Check file directory.");

                } catch (IOException e) {
                    System.out.println("I/O exception.Sorry!");
                }
            }
        }


    }


}
