package com.company;

import java.io.File;
import java.io.FilenameFilter;


public class FileType implements FilenameFilter {

    private String extension;

    FileType(String extension){
        this.extension = extension;
    }


    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extension);
    }
}
