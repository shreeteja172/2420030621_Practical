package MyProject;

public class formatspecifier {
     public static void main(String[] args) {
       int a=2;
       char b='A';
       double c=3.6;
       float d= 5.6f;
       String s="hello this is cse";
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(s);
       System.out.println(s+""+a+""+b+""+c+""+d);
       System.out.printf("integer%d%ncharacter%c%ndouble%f%nstring%s",a,b,c,s);
     }
}