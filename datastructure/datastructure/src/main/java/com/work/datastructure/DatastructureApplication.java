package com.work.datastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

@SpringBootApplication
public class DatastructureApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DatastructureApplication.class, args);
        System.out.println("Welcome to use our System...");
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to know?");
        char out = 0;
        String path = "src\\main\\resources\\static\\";
        do {
            System.out.println("You can enter 'array' 'graph' 'LinearTable' 'LinkedList'" +
                    " 'queue' 'stack' 'tree' ");
            System.out.print("Please enter : ");
            String wanted = input.next();
            switch (wanted) {
                case "array":
                    getResult(path + "array.txt");
                    break;
                case "graph":
                    getResult(path + "graph.txt");
                    break;
                case "LinearTable":
                    getResult(path + "LinearTable.txt");
                    break;
                case "LinkedList":
                    getResult(path + "LinkedList.txt");
                    break;
                case "queue":
                    getResult(path + "queue.txt");
                    break;
                case "stack":
                    getResult(path + "stack.txt");
                    break;
                case "tree":
                    getResult(path + "tree.txt");
                    break;
                default:
                    break;
            }
            System.out.println("enter any character (but 'n')if you want again: ");
            out = input.next().charAt(0);
        } while (out != 'n');
        System.out.println("Welcome to use this system again.");
    }

    public static void getResult(String path) throws Exception {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
    }

}
