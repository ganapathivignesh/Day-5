package com.main;

import com.arith.Add;
import com.assign.Assign;
import com.logical.And;
import com.relation.Greater;
import com.incdec.Incdec;;

public class Mainclass {

    public static void main(String[] args) {
        
        Add a=new Add();
        a.display();
        
        Assign as=new Assign();
        as.display3();
        
        And l=new And();
        l.display2();
        
        Assign an=new Assign();
        an.display3();
        
        Incdec indec=new Incdec();
        indec.display4();

    }

}
