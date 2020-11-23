package com.wrap;

public class CharW {

	public static void main(String[] args) {
	     
        char c='r';
        Character ch=new Character(c);
        Character ch1=new Character('u');
        
        System.out.println(Character.BYTES);
        System.out.println(ch.MAX_CODE_POINT);
        System.out.println(ch.MAX_HIGH_SURROGATE);
        System.out.println(ch.MAX_LOW_SURROGATE);
        System.out.println(ch.MAX_RADIX);
        System.out.println(ch.MAX_SURROGATE);
        System.out.println(ch.MAX_VALUE);
        System.out.println(ch.MIN_SUPPLEMENTARY_CODE_POINT);
        System.out.println(ch1.MIN_VALUE);
        System.out.println(ch.SIZE);
        
        
        System.out.println(ch.charValue());
        System.out.println(ch.compareTo(ch1));
        System.out.println(ch.equals(ch1));
        System.out.println(ch.hashCode());
        System.out.println(ch.toString());
        System.out.println(ch.getClass());
       
        System.out.println(Character.COMBINING_SPACING_MARK);
        System.out.println(Character.CONNECTOR_PUNCTUATION);
        System.out.println(Character.CONTROL);
        System.out.println(Character.CURRENCY_SYMBOL);
        System.out.println(Character.DASH_PUNCTUATION);
        System.out.println(Character.DECIMAL_DIGIT_NUMBER);
        System.out.println(Character.DIRECTIONALITY_ARABIC_NUMBER);
        System.out.println(Character.FINAL_QUOTE_PUNCTUATION);
        System.out.println(Character.DIRECTIONALITY_EUROPEAN_NUMBER);
        System.out.println(Character.LINE_SEPARATOR);
        
        
        

    }

}



