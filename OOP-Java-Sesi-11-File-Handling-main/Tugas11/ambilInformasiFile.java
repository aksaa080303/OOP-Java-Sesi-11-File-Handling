package Tugas11;

import java.io.*;

public class ambilInformasiFile {
    public static void main(String[] args) {
        File f = new File("C:\\PBO SESI 10\\Tugas11\\file.txt");
        
        if (f.exists()) {
        System.out.println("File Name: " + f.getName());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        System.out.println("Writable: " + f.canWrite());
        System.out.println("Readable: " + f.canRead());
        System.out.println("File Size: " + f.length());
    } else {
        System.out.println("File tidak ada.");
    }
    }
    
}

