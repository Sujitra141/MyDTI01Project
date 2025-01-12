
package com.dti.operator;

import java.util.Scanner;

public class Km2OPT {
    public static void main(String[] args) {
        //Ternary Opt.__?__:___
        //เงื่อนไขที่ต้องพอสูจน์?ทำเมื่อเป็นจริง:ทำเมื่อเป็นเท็จ
        int score;
        Scanner sc = new Scanner(System.in);
        String result;
        System.out.println("..........................................");
        System.out.println(" Prodram Check Result Score");
        System.out.println("..........................................");
        System.out.println("Input your score: ");
        score = sc.nextInt();
        result = score >=50?"Pass....":"NOT Pass.....";
        System.out.println("Result is"+result);
        
    }
}
