package edu.estu;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("myfile.txt"), StandardCharsets.UTF_8);
            System.out.println(lines.size());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
