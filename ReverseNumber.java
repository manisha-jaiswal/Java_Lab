import java.util.*;
class ReverseNumber
{ 
   	 static int reversNum(int num) 
    { 
        int rev = 0; 
        while(num > 0) 
        { 
            rev = rev * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev; 
    } 
      
    public static void main (String[] args)  
    { 
Scanner sc = new Scanner(System.in);
System.out.println("\n Enter the number for Reverse :" );
int  num = sc.nextInt();
        System.out.println("Reverse of no. is " + reversNum(num)); 
    } 
} 