// 16. Write a program to convert:
// a. int value into String
// b. int value into Integer instance.
// c. String instance into Integer instance.
// d. int value into binary, octal and hexadecimal string.


// class Question16
// {
//     public static void main(String args[])
//     {
//         int a = 100;
//         String str = Integer.toString(a);
//         System.out.println(str);
//     }
// }

// class Question16
// {
//     public static void main(String args[])
//     {
//         int a = 100;
//         int b = Integer.valueOf(a);
//         System.out.println(b);
//     }
// }


// class Question16
// {
//     public static void main(String args[])
//     {
//         String str = new String("123");
//         int a = Integer.parseInt(str);
//         System.out.println(a);
//     }
// }
import java.util.Scanner;
class Question16
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int a = sc.nextInt();

    String by = Integer.toBinaryString(a);
    System.out.println("Binary value of "+a+" is "+by);

    String hexa = Integer.toHexString(a);
    System.out.println("HexaDecimal value of "+a+" is "+hexa);

    String octal = Integer.toOctalString(a);
    System.out.println("Octal value of "+a+" is "+octal);

}
}