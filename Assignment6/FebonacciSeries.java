import java.util.Scanner;

public class FebonacciSeries {
   static void Febonacci(int N ){
       int num1 = 0;
       int num2 = 1;
       int counter = 0;
       while(counter < N){
          System.out.println(num1 + "  ");
          int num3 = num1 + num2;
          num1 = num2;
          num2 = num3;
          counter = counter + 1;
       }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number: " );
      int N = sc.nextInt();

      Febonacci(N);  //Function call
   }
}
