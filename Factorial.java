import java.util.Scanner;
class Factorial{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      
	System.out.println("Enter the number:");
     	 int num = scanner.nextInt();
   
      int factorial = fact(num);
      System.out.println("Factorial of the number using Recursion is: "+factorial);
   }
   static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
}
       else
      {
       return fact(n-1)* n;
}
   }
}