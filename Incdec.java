package com.incdec;

import java.util.Scanner;

public class Incdec {
    
    int a=5,b=6,ch;

    Scanner sc=new Scanner(System.in);
    public void display4()
    {
    do{
        System.out.println("1)preincrement");
        System.out.println("2)postincrement");
        System.out.println("3)predecrement");
        System.out.println("4)postdecrement");
        System.out.println("5)increment and decrement");
        System.out.println("6)increment");
        System.out.println("7)decrement");
        System.out.println("8)exit");
        
        
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1: 
                System.out.println(a++ +" "+ b++);
                break;
        case 2: 
                System.out.println(++a +" "+ ++b);
                break;
                
        case 3: 
                System.out.println(a-- +" "+ b--);
                break;
        case 4: 
                System.out.println(--a +" "+ --b);
                break;
        case 5:
                int c=(a++)+(--b)+(++b)+(--a)+(++b)+(a++);
                System.out.println(c);
                break;
        case 6:
                int c1=(a++)+(++b);
                System.out.println(c1);
                break;
        case 7: 
                int c2=(--a)-(b--);
                System.out.println(c2);
                break;
        case 8:  
                break;
    
        default:
              System.out.println("invalid");
        
        
        }
        
        
    }while(ch!=8);

    

}
}
