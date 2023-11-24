package resta;
import java.util.ArrayList;
public class MenuList {

 
 public static void display() {
  
   System.out.println("********************************");
   System.out.println("1. ChickenBiriyani........Rs.100");
   System.out.println("2. ButterChicken..........Rs.160");
   System.out.println("3. ChickenChilli..........Rs.150");
   System.out.println("4. ButterNan.............. Rs.40");
   System.out.println("5. WaterBottle.............Rs.25");
   System.out.println("*********************************");
  
  
 }

 public static int cost(int n) {
  
  ArrayList<Integer> costs = new ArrayList<Integer>(5);
     costs.add(100);
     costs.add(160); 
     costs.add(150);
     costs.add(40);
     costs.add(25);
  
  return costs.get(n-1);
 }
 
 
 
}