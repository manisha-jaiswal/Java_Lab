import java.util.*; 
   
interface one 
{ 
    public void print_one(); 
} 
   
interface two 
{ 
    public void print_two(); 
} 
   
interface three extends one,two 
{ 
    public void print_three(); 
} 

class child implements three 
{ 
    public void print_one() { 
        System.out.println("Super class 1"); 
    } 
   
    public void print_two() 
    { 
        System.out.println("Super class 2"); 
    } 
    public void print_three() 
    { 
        System.out.println("child class "); 
    } 
}  
public class MultipleEx 
{ 
    public static void main(String[] args) 
    { 
        child c = new child(); 
        c.print_one(); 
        c.print_two(); 
        c.print_three(); 
    } 
} 