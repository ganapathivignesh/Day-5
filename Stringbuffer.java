package string;

public class Stringbuffer {

public static void main(String[] args) {
        
        StringBuffer sb=new StringBuffer("praju");
        StringBuffer sb1=new StringBuffer("employee");
        
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(2));
        System.out.println(sb.codePointAt(3));
        System.out.println(sb.codePointBefore(4));
        System.out.println(sb.codePointCount(2, 4));
        System.out.println(sb.equals(null));
        System.out.println(sb.hashCode());
        System.out.println(sb.indexOf("aju"));
        System.out.println(sb.indexOf("aj", 1));
        System.out.println(sb.lastIndexOf("ju"));
        System.out.println(sb.lastIndexOf("aju", 2));
        System.out.println(sb.length());
        System.out.println(sb.substring(2));
        System.out.println(sb.substring(2, 4));
        System.out.println(sb.toString());
        System.out.println(sb.append(true));
        System.out.println(sb.append("r"));
        System.out.println(sb.append(sb));
        System.out.println(sb.append(45.6));
        System.out.println(sb.append(107));
        System.out.println(sb.append(sb1));
        System.out.println(sb.chars());
        System.out.println(sb.codePoints());
        System.out.println(sb.delete(2, 5));
        System.out.println(sb1.getClass());
        System.out.println(sb1.insert(2, 't'));
        System.out.println(sb1.insert(3, 35));
        System.out.println(sb1.insert(2, sb));
        System.out.println(sb.replace(1,3 , "ai"));
        System.out.println(sb.reverse());

        
        

    }

}
