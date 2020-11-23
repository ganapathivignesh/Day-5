package com.assign;

import java.util.Scanner;

public class Assign {
    
    int a=5,b=6,ch;


    Scanner sc=new Scanner(System.in);
    public void display3()
    {
    do{
        System.out.println("1)plus equal to");
        System.out.println("2)minurs equal to");
        System.out.println("3)multiply equal to");
        System.out.println("4)divide equal to");
        System.out.println("5)modulo equal to");
        System.out.println("6)right shift equal to");
        System.out.println("7)left shift equal to");
        System.out.println("8)conditional operator");
        System.out.println("9)exit");
        
        
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1: 
                System.out.println(a+=b);
                break;
        case 2:  
                System.out.println(b-=a);
                break;
                
        case 3: 
                System.out.println(a*=b);
                break;
        case 4: 
                System.out.println(b/=a);
                break;
        case 5:
                System.out.println(a%=b);
                break;
        case 6:
                System.out.println(a>>=2);
                break;
        case 7:
                System.out.println(b<<=2);
                break;
        case 8:  
                boolean c=(a==b)?true:false;
                System.out.println(c);
                break;
        case 9:
                break;
        default:
              System.out.println("invalid");
        
        
        }
        
        
    }while(ch!=9);


}
}

