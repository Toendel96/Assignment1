package assignment;

import fileConnection.FileConnection;

import java.io.*;
import java.util.Scanner;

public class OpenFile {
    Scanner scanner = new Scanner(System.in);
    ReadClass readClass = new ReadClass();

    public void read() {
        try {
            ReadClass readClass = new ReadClass();
            readClass.setFilnavn("assignment1/SalesRecords3.csv");
            readClass.readEverything();
            readClass.printEverythingInObjects();
            readClass.readOnlySpecificColumns();
        } catch (NullPointerException exception) {
            System.out.println("Not able to open file - wrong filename");
        }
    }

    public void openFile() {
        try {
            System.out.println("Please enter filename:");
            String filename = scanner.nextLine();
            BufferedReader file = FileConnection.readConnection("assignment1/" + filename);
            System.out.println(filename + " file exists and is opened");
            getFileInfo(filename);
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        } catch (FileNotFoundException exception) { //FileNotFoundException extends IOException
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getFileInfo(String filename) throws IOException {
        //try {
            //System.out.println("Please enter filename:");
            //String filnavn = scanner.nextLine();
            BufferedReader file = FileConnection.readConnection("assignment1/" + filename);

            long lines = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader("assignment1/" + filename))) {
                while (reader.readLine() != null) lines++;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Number of lines: " + lines);

        }
    }
