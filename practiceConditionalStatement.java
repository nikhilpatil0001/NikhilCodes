//Write a Javaprogram to get a number from the user and print whether it is positive or negative
/*import java.util.*;
public class practiceConditionalStatement{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int number = sc.nextInt();

if(number > 0){
    System.out.println("It is a positive number");
}
else{
    System.out.println("It is a negative number");
}

}
}*/
// FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever

/*public class practiceConditionalStatement{
public static void main(String args[]){

double temp = 103.5;

if(temp > 100){
    System.out.println("You have a fever");
}
else{
    System.out.println("You dont have a fever");
}


}

}*/

// WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case

/*import java.util.*;
public class practiceConditionalStatement{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Weekday (1 - 7)");
int weekDay = sc.nextInt();

switch (weekDay){

case 1 :System.out.println("Monday");
        break;
case 2 :System.out.println("Tuesday");
        break;
case 3 :System.out.println("Wednesday");
        break;
case 4 :System.out.println("Thusday");
        break;
case 5 :System.out.println("friday");
        break;
case 6 :System.out.println("Saturday");
        break;
case 7 :System.out.println("Sunday");
        break;
default : System.out.println("Invalid input");        

}

}

}*/

// WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not

import java.util.*;
public class practiceConditionalStatement{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Year");
int Year = sc.nextInt();

if(Year % 4 == 0){
    System.out.println("It is a leap Year");
}
else{
    System.out.println("It is not a leap year");
}


}

}








