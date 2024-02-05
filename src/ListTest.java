import java.util.Scanner;
import java.util.Arrays;

public class ListTest{

  static Scanner sc = new Scanner(System.in);
  static int month;
  static int year;
 

  public static void main(String[] args){
    typeMonth();
    typeYear();
    output();
   
   
  }


  static void typeMonth(){
      System.out.print("Input a month number : ");
      month = sc.nextInt();
  }

  static void typeYear(){
      System.out.print("Input a year : ");
      year = sc.nextInt();
  }

  static void output(){
    System.out.println("Expected Output : ");
    int daysAndMonth = calculate(month,year);

    if (daysAndMonth != -1) {
      System.out.print(getMonthName(month) + " has " + daysAndMonth + " days.");
    }else{
      System.out.println("This Input is invalid!");
    }
  }

 
  public static int calculate(int month,int year){

    if (month < 1 || month > 12) {
      return -1;
    }

    int[] arrayInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

      if (month == 2 && leapYear(year)) {
        return 29;
      }else{
        return arrayInMonth[month];
      }
  }


  static boolean leapYear(int year){

      return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }

  static String getMonthName(int month){
    String[] monthNames = {" ","Januray","February","March","April","May","June","July","August","September"
    ,"October","November","December"};

    return monthNames[month];
  }

  



}
 
