package com.mruruc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> line=new ArrayList<>();
        File file=new File("data-source.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNext()){
            line.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(line);


//        for (String str:line) {
//            System.out.println(str);
//        }

        FileWriter rt=new FileWriter("data-destination.txt");
        for (String str:line) {
            rt.write(str+"\n");
        }
        rt.close();
    }
}
