package ie.atu;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //specify the file name
        String fileName = "File.txt";


        // Create a file object
        File myFile = new File(fileName);
        String fileName1 = "file2.txt";
        String fileName2 = "file3.txt";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name ");
        String input = scanner.nextLine();



        try (PrintWriter writer = new PrintWriter(new FileWriter(input,true))){
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