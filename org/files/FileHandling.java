package org.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        //creating the object of file and giving path in ur location
        // give the path and give file name with extension
        File f = new File("C:\\Users\\mdurgaprasa3\\OneDrive - DXC Production\\Desktop\\New folder\\demo.txt");

        //calling createNewFile method for creating and throws exception and returns the boolean
        //System.out.println(f.createNewFile());


        //deleting the file and returns the boolean
        // System.out.println(f.delete());

        //for checking whether the file exists or not and returns the boolean
        // System.out.println(f.exists());

        //if file exists delete then create the file
        if(f.exists())
            f.delete();
        System.out.println(f.createNewFile());

    }
}
