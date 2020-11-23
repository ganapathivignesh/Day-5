package com.wrap;

public class IntegerW 
{
public static void main(String[] args) {
        
        String st="19";
        String st1="1010";
        
        
        int a=Integer.parseInt(st);
        int b=-7;
        System.out.println(a);
        Integer a1=new Integer(a);
        
        Integer a2=new Integer(34);
        
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.doubleValue());
        System.out.println(a1.equals(a2));
        System.out.println(a1.floatValue());
        System.out.println(a2.hashCode());

        System.out.println(a1.intValue());
        System.out.println(a1.longValue());
        System.out.println(a2.toString());
        System.out.println(a2.byteValue());
        System.out.println(a1.getClass());
        System.out.println(a2.shortValue());
        System.out.println(a2.BYTES);
        System.out.println(a2.MAX_VALUE);
        System.out.println(a2.MIN_VALUE);
        System.out.println(a1.SIZE);
        System.out.println(Integer.bitCount(a));
        System.out.println(Integer.compare(a, b));
        System.out.println(Integer.highestOneBit(a));
        System.out.println(Integer.lowestOneBit(b));
        System.out.println(Integer.numberOfLeadingZeros(a));
        System.out.println(Integer.numberOfTrailingZeros(a));
        
        System.out.println(Integer.parseUnsignedInt(st));
        System.out.println(Integer.remainderUnsigned(a, b));
        System.out.println(Integer.reverse(a));
        System.out.println(Integer.reverseBytes(a));
        System.out.println(Integer.rotateLeft(a, 2));
        System.out.println(Integer.rotateRight(a, 2));
        System.out.println(Integer.signum(a));
        System.out.println(Integer.sum(a, b));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.decode(st));
        System.out.println(Integer.parseInt(st1,2));

    }

}




