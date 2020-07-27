class BaseEx {
 public void display() {
  System.out.println("This is Base class");
 }
}
class ChildEx extends BaseEx {
 public void display() {
  System.out.println("This is Child class");
 }
}
public class OverrideEx {
 public static void main(String args[]) {
  BaseEx a = new BaseEx();
  BaseEx b = new ChildEx();
  a.display();
  b.display();
 }
}