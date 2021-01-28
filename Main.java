import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner n= new Scanner(System.in);
    System.out.println("Enter the year you want to check: ");
    int year= n.nextInt();
    System.out.println("Is the given year a leap year?");
    System.out.println(leapYear(year));
  }
  public static boolean leapYear(int year){
    if (year%4!=0){
      return false;
    }
    else{
      if (year%100==0){
        return false;
      }
      else{
        if (year%400!=0){
          return false;
        }
        else{
          return true;
        }
      }
    }
  }
}