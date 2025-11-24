import java.util.Scanner;
class stringReverse{
    public static void main (String [] args){
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       StringBuilder res=new StringBuilder();
       for(int i=s.length()-1;i>=0;i--){
           res.append(s.charAt(i));
       }
       System.out.println(res.toString());
    }
    
} 