package com.example.javaeehelloworld;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingDirectory {

    public void CreatingNewLocalDirectory(String newPath){

        newPath = "\\" + newPath;
        Path path = Paths.get(System.getProperty("user.dir") + newPath);
        File f = new File(System.getProperty("user.dir") + newPath);

        if(!f.exists()) {
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                System.err.println("Failed to create directory!" + e.getMessage());
            }
        }
    }
}
