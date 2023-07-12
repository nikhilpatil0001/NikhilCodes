import java.util.*;

public class Calculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int value1= sc.nextInt();
int value2= sc.nextInt();
char parameter = sc.next().charAt(0);

switch(parameter){

case '+' : System.out.println("Addition is " + (value1 + value2));  
          break;

case '-' : System.out.println("Subtraction  is " + (value1 - value2));  
          break;

case '*' : System.out.println("Multiplication is " + (value1 * value2));  
          break;

case '/' : System.out.println("Division is " + (value1 / value2));  
          break;

case '%' : System.out.println("Remainder is " + (value1 % value2));  
          break;

default : System.out.println("Wrong operator");  
          




}





}




} 