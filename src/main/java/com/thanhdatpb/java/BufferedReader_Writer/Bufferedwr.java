package com.thanhdatpb.java.BufferedReader_Writer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Bufferedwr {
    public void writeToFile(List<Student> list){
        try {
            FileWriter fl = new FileWriter("data.txt");
            BufferedWriter bf = new BufferedWriter(fl);
            for (Student st : list){
                bf.write(st.toString());
                bf.newLine();
            }

            bf.close();
            fl.close();
        }catch (Exception e){

        }
    }

    public List<Student> readFromFile(){
        List<Student> list = new ArrayList<>();
        try {
            FileReader rd = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(rd);
            String line = "";
//            line = br.readLine();
            while (true){
                line = br.readLine();
                if (line == null){
                    break;
                }
                String[] txt = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name, age, mark));

//                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
//        String txt = "Tran Thanh Dat";
//        String arr[] = {"Dat", "Huy", "Chung"};

//        Student s = new Student("Tran Thanh Dat", 21, 8.5);
//        Student s1 = new Student("Tran Van A", 21, 8.5);
//        Student s2 = new Student("Tran Van B", 21, 8.5);
//        Student s3 = new Student("Tran Van C", 21, 8.5);
//        Student s4 = new Student("Tran Van D", 21, 8.5);
        Bufferedwr bff = new Bufferedwr();

        List<Student> list = bff.readFromFile();
        for (Student ss : list){
            System.out.println(ss);
        }

//        list.add(s);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        try {
//            FileWriter fl = new FileWriter("data.txt");
//            BufferedWriter bf = new BufferedWriter(fl);
////            bf.write(s4.toString());
////            bf.write(txt);
////            for (String s : arr){
////                bf.write(s);
////                bf.newLine();
////            }
//            for (Student st : list){
//                bf.write(st.toString());
//                bf.newLine();
//            }
//
//            bf.close();
//            fl.close();
//        }catch (Exception e){
//        }
    }
}
