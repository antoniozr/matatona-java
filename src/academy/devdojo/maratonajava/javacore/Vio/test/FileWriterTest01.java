package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file, true)){
                fw.write("Dev dojo melhor curso de Java do\nbrasil ");
                fw.flush();

            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
    }
