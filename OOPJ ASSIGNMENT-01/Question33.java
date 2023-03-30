// 33. Pass integer, float and double value from command line. Parse 
// it appropriately and perform arithmetic operations (+,-,*,/)
// on it. Here you can you switch case. 

import java.util.Scanner;
class Question33
{
    public static void main(String args[])
    {
        String s = args[0];
       

        System.out.println("enter 1 for integer 2 for float and 3 for double :");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            int x = Integer.parseInt(s);
            System.out.println(x);
            System.out.println("Addition : "+(x+x));
            System.out.println("Multiplication : "+(x*x));
            break;

            case 2:
            float y = Float.parseFloat(s);
            System.out.println(y);
            System.out.println("Addition : "+(y+y));
            System.out.println("Multiplication : "+(y*y));
            break;

            case 3:
            double z = Double.parseDouble(s);
            System.out.println(z);
            System.out.println("Addition : "+(z+z));
            System.out.println("Multiplication : "+(z*z));
            break;

            default :
            System.out.println("Invalid Imput!!!");
            break;
        }
    }
    
}