package fileIo;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {


        File file = new File("Java.txt");
        System.out.println(file.exists());

        file.createNewFile();

        System.out.println(file.exists());

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("abc");
        fileWriter.flush();

        FileReader fileReader = new FileReader(file);
       int i = fileReader.read();

       while(i != -1){
           System.out.println((char) i);
           i = fileReader.read();
       }


        //write something in this file  - FileWriter -class
        //read the file  - FileReader class

        //TODO READ THROUGH BufferedReader


    }
}
