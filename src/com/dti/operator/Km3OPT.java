
package com.dti.operator;


public class Km3OPT {
    public static void main(String[] args) {
   //+> ++ --
    int x=10;
    int y = x;
    System.out.println(x);
    x++;
    System.out.println(x);
    ++x;
    System.out.println(x);
    x--;
    System.out.println(x);
    --x;
    System.out.println(x);
    System.out.println("...................");
    y=++x;
    System.out.println(x);
    System.out.println(y);
    System.out.println("...................");
    y = x++;
    System.out.println(x);
    System.out.println(y);
    
    int num = 20;
    //num = num+50;
    num +=50;
    //num=num*2;
    num*=2;
    num=num+5/9*x-y;
    num+=5/9*x-y;
    System.out.println(num);
    
    
        
     
    
    
        
 
    
    
    
   
    
}
}