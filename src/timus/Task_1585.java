package timus;

import java.util.Scanner;

public class Task_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int i = 0;
        int emperor = 0;
        int little = 0;
        int macaroni = 0;

        while(i < n) {
            String penguin = in.nextLine();
            if (penguin.equals("Emperor Penguin")) {
                emperor++;
            } else if (penguin.equals("Little Penguin")) {
                little++;
            } else if (penguin.equals("Macaroni Penguin")) {
                macaroni++;
            }
            i++;
        }
        in.close();

        if (emperor > little && emperor > macaroni) {
            System.out.println("Emperor Penguin");
        } else if (little > emperor && little > macaroni) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}


