
package com.thailand.dti;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class WowWow {
    public static void main(String[] args)throws IOException {
         String yourName;
         int YourAge;
        double yourSalary;
         InputStreamReader input = new InputStreamReader(System.in);
         BufferedReader reader = new BufferedReader(input);
         System.out.println("Enter your name: ");
         yourName =reader.readLine();
         System.out.println("Enter youe age:");
         YourAge =Integer.parseInt(reader.readLine());
         System.out.println("Enter youe salary:");
         yourSalary = Double.parseDouble(reader.readLine());
         System.out.println("-----------------");
         System.out.println("Hi...."+yourName);
         System.out.println("your are"+YourAge+"years old");
         System.out.println("Your salary is" + yourSalary +"Bath" );
}
}
    
   
