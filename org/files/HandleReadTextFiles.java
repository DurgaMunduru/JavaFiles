package org.files;

import java.io.*;

public class HandleReadTextFiles {
    public static void main(String[] args) throws IOException {

        //creating instance of file
        File file = new File("./sample.txt");

        if (!file.exists())
            file.createNewFile();


        //Different ways to read the data from text files
        //      1.FileInputStream
        //      2.Scanner
        //      3.FileReader
        //      4.BufferedReader

        //  1.FileInputStream

       // FileInputStream fis = new FileInputStream(file);

        //read() method will read text char by char return -1 if nothing to read
        //it will read the text of first character only that too in ASCii value. So,iterate the looping till reading
        //System.out.println(fis.read());

//        int AsciiCode;
//        while ((AsciiCode=fis.read()) != -1){
//            System.out.print((char) AsciiCode);
//        }
//        fis.close();


        //2.Scanner

            //using scanner it will read  word by word
            //hasNextLine: see if there any next line
            //hasNext: see if another word or token is there
//        Scanner sc = new Scanner(file);
//
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
//
//        sc.close();


        //3. FileReader
            //In FileReader Also we read only char by char
//        FileReader fr = new FileReader(file);
//
//       int AsciiCode;
//       while ((AsciiCode= fr.read())!=-1){
//           System.out.print((char) AsciiCode);
//       }
//        fr.close();


        //4. BufferReader
            //it will read line by line
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int AsciiCode;
        while ((AsciiCode=br.read())!=-1){
            System.out.print((char)AsciiCode);
        }

        fr.close();
        br.close();

    }

}
