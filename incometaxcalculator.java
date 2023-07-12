import java.util.*;
public class incometaxcalculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int income = sc.nextInt();

if(income < 500000){  // Dont write 5 lacs in coma , java is not take it
    System.out.println("you dont have to pay any tax");
} 

else if(income > 500000 && income <= 1000000){
    System.out.println("Your income tax is  " + income*(0.2));
}

else{
    System.out.println("Your income tax is  " + income*(0.3));
}


}












}

 





