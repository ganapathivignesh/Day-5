package com.arith;
import java.util.Scanner;
public class Add {
  
    int a=10,b=10,ch;

    Scanner sc=new Scanner(System.in);
    public void display()
    {
    do{
        System.out.println("1)addition");
        System.out.println("2)subtraction");
        System.out.println("3)multiplication");
        System.out.println("4)division");
        System.out.println("5)modulo");
        System.out.println("6)exit");
        
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1: 
                System.out.println(a+b);
                break;
        case 2:
                System.out.println(a-b);
                break;
                
        case 3:
                System.out.println(a*b);
                break;
        case 4:
                System.out.println(a/b);
                break;
        case 5:
                System.out.println(a/b);
                break;
        case 6:
               break;
        default:
              System.out.println("invalid");
        
        
        }
        
        
    }while(ch!=6);
    
    
}
}

