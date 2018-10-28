import java.util.*;
  public class Bisiesto{
  /* Author:Pedro Ramírez
  Date: 05/10/18
  Descr:Exercise made in class */
  public static void main(String[] args) {
    //Variables start here
    int year = 0;
    boolean state = false;
    Scanner kb = new Scanner (System.in);
    //Variables end here
      System.out.println("Input the year you would like to analyze");
      year = kb.nextInt();

      if(year % 4 == 0)//If start
        if( year % 100 == 0){
          if ( year % 400 == 0)
          state = true;
          else
            state = false;}
          else
            state = true;}//If end
          else
            state = false;

      if(state)//Last statement
        System.out.println("Your year is a leap year");
      else
        System.out.println("This is not a leap year");
}
}
