package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args)  {


        File myfile=new File("Learning_File_Handling.txt");

        /*
          Code for creating a file in java
         */
        try {
            myfile.createNewFile();
            System.out.println("File created");
        }
        catch(IOException e){
            System.out.println("Cannot create file");
            e.printStackTrace();
        }


        /*
          Code for writing a file in java
         */
        try {
            FileWriter fileWriter = new FileWriter("Learning_File_Handling.txt");
            fileWriter.write("I will crack Google and be a Noogler\n");
            fileWriter.write("I will crack Google and be a Noogler");
            System.out.println("Successfully wrote to the file.");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot write to this file");
            e.printStackTrace();
        }


        /*
          Code for reading a file in java
         */
        try {
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !! ");
            e.printStackTrace();
        }


        /*
          Code for reading any sample file in java
         */
        File my_Sample_file = new File("Sample_File_for_Learning_File_Handling.txt");
        try {
            Scanner sc1=new Scanner(my_Sample_file);
            while(sc1.hasNextLine())
            {
                String line=sc1.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !! ");
            e.printStackTrace();
        }
    }
}
