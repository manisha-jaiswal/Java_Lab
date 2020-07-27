import java.util.*;   
class one 
{ 
    public void print_one() 
    { 
        System.out.println("Base class"); 
    } 
} 
  
class two extends one 
{ 
    public void print_two() 
    { 
        System.out.println("Intermediate class"); 
    } 
} 
  
class three extends two 
{ 
    public void print_three() 
    { 
        System.out.println("Child class"); 
    } 
} 
  
public class MultilevelEx 
{ 
    public static void main(String[] args) 
    { 
        three obj = new three(); 
        obj.print_one(); 
        obj.print_two(); 
        obj.print_three(); 
    } 
} 