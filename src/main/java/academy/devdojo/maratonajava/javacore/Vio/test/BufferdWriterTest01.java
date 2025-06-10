package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file, true);
              BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Dev dojo melhor curso de Java do brasil ");
            bw.newLine();
            bw.flush();
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}