
package com.sau.Workshop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class BMIProject {
   
    
    //โปรแกรมคำนวนหาค่า BMI โดยรับค่า ชื่ิอ น้ำหนัก (kg) ส่วนสูง (m) ทางแป้นพิมพ์
    //แล้วแสดงผลค่าBMI ทางหน้าจอ
    //BMI = น้ำหนัก
    public static void main(String[] args) throws IOException{
         String yourName;
    double yourWeight,yourHeight,yourBMI;
        
        InputStreamReader input =new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("#.0000");
        
        System.out.println("++++++++++++++++");
        System.out.println("      BMI Program by DTI-SAU");
        System.out.println("+++++++++++++++++");
        System.out.println("Input your name: ");
        yourName=reader.readLine();
        System.out.println("input your weight: ");
        yourWeight=Double.parseDouble(reader.readLine());
         System.out.println("Input your Height (m) :");
         yourHeight=Double.parseDouble(reader.readLine());
          System.out.println("++++++++++++++++");
         yourBMI=yourWeight/Math.pow(yourHeight,2);
          System.out.println("BMI of "+yourName+"is"+df.format(yourBMI));
          System.out.println("+++++++++++++++++");
        
    }
}
