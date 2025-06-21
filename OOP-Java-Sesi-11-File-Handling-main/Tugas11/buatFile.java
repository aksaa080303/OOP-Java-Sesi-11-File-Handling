package Tugas11;

import java.io.*;

public class buatFile {
    public static void main(String[] args) {
        try {
           
            File f = new File("C:\\PBO SESI 10\\Tugas11\\file.txt");
            
            if (f.createNewFile()) {
                System.out.println("File Created: " + f.getName());
            } else {
                System.out.println("File already exits.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}   