// input three numers a ,b, c and show the output the average of these numbers
/*import java.util.*;

public class practicevariablesanddatatypes{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();

 int average = (a + b + c)/3;

 System.out.println("average is : " + average);

}

}*/

// find the area of square 

/*import java.util.*;

public class practicevariablesanddatatypes{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int side = sc.nextInt();
  
  int area = side*side;
  System.out.println(area);

 }

}*/

// enter cost of three items from the user (using float data type ) - a pencil ,a pen and a eraser .
// you have to output the total cost of their item as  the bill (add 18 % gst tax to the items)

import java.util.*;

public class practicevariablesanddatatypes{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 float pencil = sc.nextFloat();
 float pen = sc.nextFloat();
 float eraser = sc.nextFloat();

 float bill = (pencil + pen + eraser);
 float gst = bill*18/100;
 float finalbill = bill + gst;

 System.out.print(finalbill);
 
 }

}

// what will be the result of java code 
