
package com.thailand.dti;

import java.util.Scanner;

public class ByeBye {
   public static void main(String[] args) {
    //รับค่า input
    Scanner sc = new Scanner(System.in);
      
    String yourName;
    int YourAge;
    double yourSalary;
      
    System.out.println("Enter your name: ");
    yourName = sc.next();
    System.out.println("Enter youe age:");
    YourAge = sc.nextInt();
    System.out.println("Enter youe salary:");
    yourSalary = sc.nextDouble();
    System.out.println("-----------------");
    System.out.println("Hi...."+yourName);
    System.out.println("your are"+YourAge+"years old");
    System.out.println("Your salary is" + yourSalary +"Bath" );
    
        
        
    
    }
}
