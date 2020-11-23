package string;

public class Stringbuilder {

public static void main(String[] args) {
        
        StringBuilder sbu=new StringBuilder("sam");
        StringBuilder sbu1=new StringBuilder("e m p l o y e e");
        
        System.out.println(sbu.capacity());
        System.out.println(sbu.charAt(2));
        System.out.println(sbu.hashCode());
        System.out.println(sbu.equals(null));
        System.out.println(sbu.codePointCount(0, 3));
        System.out.println(sbu.indexOf("mu"));
        System.out.println(sbu.indexOf("am", 1));
        System.out.println(sbu.lastIndexOf("am"));
        System.out.println(sbu.length());
        System.out.println(sbu.substring(2));
        System.out.println(sbu.toString());
        System.out.println(sbu.append(false));
        System.out.println(sbu.append("y"));
        System.out.println(sbu.append(90.7f));
        System.out.println(sbu.append("uuu"));
        System.out.println(sbu.append(sbu1));
        System.out.println(sbu.chars());
        System.out.println(sbu.codePoints());
        System.out.println(sbu1.getClass());
        System.out.println(sbu.delete(1, 3));
        System.out.println(sbu.insert(3, 'e'));
        System.out.println(sbu.insert(3, 4));
        System.out.println(sbu.replace(1, 3, "sam"));
        
        
        
        

    }

}




