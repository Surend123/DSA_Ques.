import java.util.*;
import java.util.Random;
public class oneBitErrorditection{
  public static int oneBitErrorditection(String str1,StringBuilder str2){
    int n=str1.length();
    for(int i=0;i<n;i++)
    {
      if(str1.charAt(i)!=str2.charAt(i)){
        return i;
      }
    }

       return -1;
  }
  public static void main(String args[]){
    String str1="101011";
    
    Random str2=new Random();

    int x=str2.nextInt(0,str1.length());
    StringBuilder str3=new StringBuilder(str1);
    
    str3.setCharAt(x,(str1.charAt(x)=='0')?'1':'0');
    System.out.println(str1);
    System.out.println(str3);
      int i= oneBitErrorditection(str1,str3);
      System.out.println(i);
  }
}