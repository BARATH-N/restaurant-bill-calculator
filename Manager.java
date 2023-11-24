package resta;
import java.util.ArrayList;
import java.util.Scanner;
public class Manager {
 
 
 public static void main(String[] args) {
  
 CheckUsernamePassword obj = new CheckUsernamePassword();
 
 Scanner input = new Scanner(System.in);
 
 String name;
 
 String password;

 do {
  
     
  System.out.println("Please Enter name and password:");
  
  System.out.println("Enter User id :");
     
  name = input.next();
 
  System.out.println("Enter Password:");
  
  password = input.next();
  
 
 }while(obj.checkdetails(name,password));
 
 System.out.println("\t------You're Successfully login----" );
 
 int total = 0;
 boolean loop = false;
 do {
 MenuList.display();
 System.out.println("Enter the option:");
 int option,itemcost=0;
 try {
    option = input.nextInt();
    itemcost = MenuList.cost(option);
 }
 catch(Exception e) {
	 System.out.println(e);
    System.out.println("Enter the option upto 5");
    option = input.nextInt();
    itemcost = MenuList.cost(option);
 }
   
    System.out.println("Enter the quantity:");
    int weight = input.nextInt();
    total+= weight*itemcost;
    
    System.out.println("for printbill enter 1 else 0");
    
    int forbill = input.nextInt();
    
    if(forbill == 1) {
     loop = false;
    }
    else {
     loop = true;
    }
 
 
 
 }while(loop);
 System.out.println("Bill amount is "+ total);
 input.close();
 }
 


}