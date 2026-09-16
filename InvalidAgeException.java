class InvalidAgeException extends
Exception{
public InvalidAgeException(String message){
super(message);
}
}
public class ExceptionHandlingDemo{
public static void validateAge(int age)
throws InvalidAgeException{
if(age<18){
throw new
InvalidAgeException("Access denied:You must be atleast 18 year old.");
}else{
System.Out.println("Access granted.Age verified.");
}
}
public static void main(String[]args){
int[]userAges={21,15};
for(int age:userAges){
System.Out.println("\nChecking age:"+age);
try{
validateAge(age);
if(age==21){
int result=10/0;//Will trigger ArithmeticException
}
}
catch(InvalidAgeException e){
System.out.println("Custom Exception Caught:"+e.getMessage());
}
catch(ArithmeticException e){
System.out.println("Runtime Exception Caught:Cannot divide by zero.");
}
catch(Exeption e){
System.out.println("General Exception Caught:"+e.getMessage());
}
finally{
System.out.println("Cleanup: Age check processing completed.");
}
}
}
}



