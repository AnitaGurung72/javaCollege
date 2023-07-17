public class StringMethod{
    public static void main(String[]args){
        String s="HelloWorld";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        String s1="Hello";
        String s2="World";
        System.out.println(s1.concat(s2));
        
        String a="Eat sleep Code";
        System.out.println(a.indexOf("Sleep"));
        String b="Learn Share Learn";
        System.out.println(b.indexOf("ea",3));
        System.out.println(b.lastIndexOf("a"));
        Boolean f =s1.equals(s2);
        System.out.println(f);
        String s3="hello world";
        Boolean c=s1.equalsIgnoreCase(s3);
        System.out.println(c);
        int out=s1.compareTo(s2);
        System.out.println(out);
        int out1=s1.compareToIgnoreCase(s3);
        System.out.println(out1);
        String s4=s1.toLowerCase();
        System.out.println(s4);
        String s5=s3.toUpperCase();
        String s6="Learn Share Learn";
        String s7=s6.trim();
        String s8="Hellocorld";
        String s9=s8.replace('c','w');
        String s10="";
        System.out.println(s10.isEmpty());
        
    }
}