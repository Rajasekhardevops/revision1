package sample3;

public class code {
	String webName;
	   int webAge;

	   // constructor
	   code(String name, int age){
	      this.webName = name;
	      this.webAge = age;
	   }
	   public static void main(String args[]){
	      //Creating objects
		   code obj1 = new code("beginnersbook", 5);
		   code obj2 = new code("google", 18);

	     //Accessing object data through reference
	     System.out.println(obj1.webName+" "+obj1.webAge);
	     System.out.println(obj2.webName+" "+obj2.webAge);
	   }
}
