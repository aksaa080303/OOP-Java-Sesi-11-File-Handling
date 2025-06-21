package Tugas11;
import java.io.*;
import java.util.Scanner;

public class bacaFile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\PBO SESI 10\\Tugas11\\file.txt");    
            Scanner r = new Scanner(f);
            while (r.hasNextLine()) {
                String data = r.nextLine();
                System.out.println(data);
            }
            r.close();
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan");
            e.printStackTrace();
            
    }
}
}