package JavaProgramingAdvanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;


public class P01ReadFile {
    public static void main(String[] args) {


        String path = "C:\\Users\\Miloslav\\Desktop\\Streams\\input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int bytes = fileInputStream.read();

            while (bytes != -1) {

                System.out.print(Integer.toBinaryString(bytes) + " ");

                bytes = fileInputStream.read();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
