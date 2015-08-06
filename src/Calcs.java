import java.util.Scanner;
public class Calcs
{

    static int op = 0;
    static Scanner scan=new Scanner(System.in);
    static double num1;
    static double num2;
    static double ans;
          //this is a sample pgm
    //this is a sample pgm
    public static void main(String[] args) {
    do{
    System.out.println("1 . Addition 2.Substraction 3.Multiplication 4.Division");
    op = scan.nextInt();
    }  while(op<1 && op>4);
    
    if(op==1)
    {
        System.out.println("Enter your first num");
        num1=scan.nextDouble();
        System.out.println("Enter your second num");
        num2 = scan.nextDouble();
        ans  = num1 + num2;
        System.out.println(ans);
        
    }

      if(op==2)
    {
        System.out.println("Enter your first num");
        num1=scan.nextDouble();
        System.out.println("Enter your second num");
        num2=scan.nextDouble();
        ans = num1-num2;
        System.out.println(ans);
        
    }      
            
       if(op==3)
    {
        System.out.println("Enter your first num");
        num1=scan.nextDouble();
        System.out.println("Enter your second num");
        num2=scan.nextDouble();
        ans = num1*num2;
        System.out.println(ans);
        
    }           
            
      if(op==4)
    {
        System.out.println("Enter your first num");
        num1=scan.nextDouble();
        System.out.println("Enter your second num");
        num2=scan.nextDouble();
        ans = num1/num2;
        System.out.println(ans);
        
    }            
  
         }
}