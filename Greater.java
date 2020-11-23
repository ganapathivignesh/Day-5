package com.relation;

import java.util.Scanner;

public class Greater {
    
    
    int a=20,b=10,ch;

    Scanner sc=new Scanner(System.in);
    
    public void display1()
    {
    do{
        System.out.println("1)greater than");
        System.out.println("2)less than");
        System.out.println("3)greater than or equal");
        System.out.println("4)less than or equal");
        System.out.println("5)equal to");
        System.out.println("6)not equal to");
        System.out.println("7)exit");
        
        
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1: 
                if(a>b)
                System.out.println(a+"greater");
                break;
        case 2: if(a<b)
                System.out.println(a+"lesser");
                break;
                
        case 3: if(a>=b)
                System.out.println(a+"greater than");
                break;
        case 4: if(a<=b)
                System.out.println(a+"lesser than");
                break;
        case 5: if(a==b)
                System.out.println(a+"equal");
                break;
        case 6: if(a!=b)
                System.out.println(a+"not equal to");
               break;
        case 7:
                 break;
        default:
              System.out.println("invalid");
        
        
        }
        
        
    }while(ch!=7);
    

}
}
