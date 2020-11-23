package string;

public class StringE {

public static void main(String[] args) {
        
        String name="tamilnadu";
        String n2="t a m i l n a d u";
        
        System.out.println(name.charAt(5));
        System.out.println(name.codePointAt(5));
        System.out.println(name.codePointBefore(6));
        System.out.println(name.codePointCount(2, 8));
        System.out.println(name.compareTo("tamilnadu"));
        System.out.println(name.compareToIgnoreCase("TAMILNADU"));
        System.out.println(name.concat("TAMILNADU"));
        System.out.println(name.contains("nadu"));
        System.out.println(name.contentEquals("tamil"));
        System.out.println(name.endsWith("107"));
        System.out.println(name.equalsIgnoreCase("tamilnadu"));
        System.out.println(name.hashCode());
        System.out.println(name.indexOf('n'));
        System.out.println(name.indexOf("tami"));
        System.out.println(name.indexOf('a', 0));
        System.out.println(name.indexOf("tam", 1));
        System.out.println(name.intern());
        System.out.println(name.isEmpty());
        System.out.println(name.lastIndexOf('t'));
        System.out.println(name.lastIndexOf("adu"));
        System.out.println(name.length());
        System.out.println(name.replace('a', 'r'));
        System.out.println(name.replace("adu","rer"));
        System.out.println(name.startsWith("tam"));
        System.out.println(name.substring(3, 7));
        System.out.println(name.toCharArray());
        System.out.println(name.toLowerCase());
        System.out.println(name.toString());
        System.out.println(name.toUpperCase());
        System.out.println(n2.trim());
        System.out.println(name.getBytes());
        System.out.println(name.chars());
        System.out.println(name.split(":"));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(43.8));
        System.out.println(String.valueOf(98.9f));
        System.out.println(String.valueOf(8));
        System.out.println(String.valueOf(89999));
        System.out.println(String.CASE_INSENSITIVE_ORDER);
        System.out.println(String.class);
        
        
        
        
        

    }

}


