package fileConnection;

import java.io.*; //BufferedReader, BufferedWriter, FileReader, FileWriter, IOException, PrintWriter ...
import java.util.NoSuchElementException;

public class FileConnection {
    public static PrintWriter writeConnection(String filename) throws IOException {
        try {
            FileWriter fileConnection = new FileWriter(filename);
            BufferedWriter skriveBuffer = new BufferedWriter(fileConnection);
            PrintWriter writer = new PrintWriter(skriveBuffer);
            return writer;
        } catch (FileNotFoundException e) {throw new FileNotFoundException();
        } catch(IOException e) {throw new IOException();
        } catch(NoSuchElementException e) { throw new NoSuchElementException();
        } catch(NullPointerException e) { throw new NullPointerException();
        } catch (Exception e) {return null;}

    }

    public static BufferedReader readConnection(String filename) throws IOException {
        try {
            FileReader fileConnection = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileConnection);
            return reader;
        } catch (FileNotFoundException e) {throw new FileNotFoundException();
        } catch(IOException e) { throw new IOException();
        } catch(NoSuchElementException e) { throw new NoSuchElementException();
        } catch(NullPointerException e) { throw new NullPointerException();
        } catch(Exception e){return null;}
    }

}
