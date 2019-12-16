package com.company;

import javafx.beans.binding.ObjectBinding;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> data = new HashMap<>();
        data.put("zein", 20.23);
        data.put("lol", 30.23);
        data.put("moza", 500.23);
       // Object x = data.get("zein");
        //System.out.println(x);
        System.out.println("Masukkan key = ");
        String sd = sc.nextLine();

        System.out.println("nilai = " + data.get(sd));

        if (sd == "zein"){

            System.out.println("Ini Nama Orang");
        }
        else {
            System.out.println("Bukan nama orang");
        }
    }
}
