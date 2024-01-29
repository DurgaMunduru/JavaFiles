package org.files;

import java.io.*;

//  Different ways to write the data into text files
//          1.FileOutputStream
//          2.FileWriter
//          3.BufferedWriter
public class HandleWriteTextFiles {
    public static void main(String[] args) throws IOException {
        //creating instance of file
        File file = new File("./sample1.txt");

        if(file.exists())
            file.delete();
        file.createNewFile();


        //1.FileOutputStream

//        FileOutputStream fos = new FileOutputStream(file);
//
//        String s = "Hello, Pandu";
//
//        for (char ch: s.toCharArray()){
//            fos.write((int)ch);
//        }
//
//        fos.close();


        //2. FileWriter

//        FileWriter fw = new FileWriter(file);
//
//        String s = "Good Morning..";
//
//        fw.write(s);
//        fw.close();


        //3.BufferWriter

        BufferedWriter bwr = new BufferedWriter(new FileWriter(file));

        String s ="Good Night..";

        bwr.write(s);
        bwr.close();


    }






}
