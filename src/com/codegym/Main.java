package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Human> list = new ArrayList<>();
    static File human = new File("human.txt");

    public static void main(String[] args) throws IOException {
        readFile();
        for (Human nv : list) {
            System.out.println(nv);
        }
        list.add(new Human("Tuấn","18","Nam","0347183456"));
        writeFile();
    }

    public static void writeFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(human);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Human nv : list) {
                bufferedWriter.write(nv.write());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    public static void readFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(human);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 4) {
                    list.add(new Human(str[0], str[1], str[2], str[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

    }


}
