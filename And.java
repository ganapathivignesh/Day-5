package com.logical;

import java.util.Scanner;

public class And {
    int a=5,b=6,ch;
    boolean c;

    Scanner sc=new Scanner(System.in);
    public void display2()
    {
    do{
        System.out.println("1)and");
        System.out.println("2)or");
        System.out.println("3)negation");
        System.out.println("4)bitwise and");
        System.out.println("5)bitwise or");
        System.out.println("6)exor");
        System.out.println("7)right shift");
        System.out.println("8)left shift");
        System.out.println("9)exit");
        
        
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1: 
                c=(a>b)&&(a<b);
                System.out.println(c);
                break;
        case 2:  c=(a>b)||(a<b);
                System.out.println(a+"lesser");
                break;
                
        case 3: 
                System.out.println(~a);
                break;
        case 4: 
                System.out.println(a&b);
                break;
        case 5:
                System.out.println(a|b);
                break;
        case 6:
                System.out.println(a^b);
                break;
        case 7:
                System.out.println(a>>2);
                break;
        case 8:  
                System.out.println(b<<2);
                break;
        case 9:
                break;
        default:
              System.out.println("invalid");
        
        
        }
        
        
    }while(ch!=9);

}
}

