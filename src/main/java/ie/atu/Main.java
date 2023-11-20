package ie.atu;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        //specify the file name
        String fileName = "File.txt";


        // Create a file object
        File myFile = new File(fileName);
        String fileName1 = "file2.txt";


        try {
            // Create a new file on the disk
            if (myFile.createNewFile()) {
                System.out.println("File created sucessfully at " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        }
        catch(IOException e){
            System.out.println("An error occured while creating this file. ");
            e.printStackTrace();
        }



        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName1,true))){
            // Create a new file on the disk

        writer.println("need to go for breakfast");
        writer.printf("appended formatted content ");

        }
        catch(IOException e){
            System.out.println("An error occured while creating this file. ");
            e.printStackTrace();
        }
    }


}