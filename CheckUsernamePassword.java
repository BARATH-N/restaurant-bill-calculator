package resta;

public class CheckUsernamePassword implements Login{
 
 private static String name = "Barath";
 private static String password = "1234";
 @Override
 public boolean checkdetails(String na,String pass) {
	// System.out.println(name+" "+password);
	 
  if( name.equals(na) && this.password.equals(pass)) {
	  
   return false;
  }
  else {
   return true;
  }
 }
}