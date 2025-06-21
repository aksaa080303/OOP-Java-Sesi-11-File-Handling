package Tugas11;
import java.io.*;

public class TulisFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\PBO SESI 10\\Tugas11\\file.txt");
            f.write("Belajar Perograman File Handling");
            f.close();
            System.out.println("Proses berhasil");
        } catch(IOException e) {
            System.out.println("Terjadi Kesalahan dalam penulisan file.");
            e.printStackTrace();
        }
    }
}
