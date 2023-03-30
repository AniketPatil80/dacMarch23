// 28.Write a program to convert:
// a. double value into String
// b. double value into Double instance.
// c. String instance into Double instance.
// d. double value into binary, octal and hexadecimal 
// string(Note: Here you can use doubleToLongBits() method 
// along with methods of Long class).

// class Question28
// {
//     public static void main(String args[])
//     {
//         double d = 10.23;
//         String str = Double.toString(d);
//         System.out.println(str);
//     }
// }

// class Question28
// {
//     public static void main(String args[])
//     {
//         double d = 10.23;
//         double d1 = new Double(d);
//         System.out.println(d1);
//     }
// }

// class Question28
// {
//     public static void main(String args[])
//     {
//       String str = new String("154");
//       double d = Double.parseDouble(str);
//       System.out.println(d);
//     }
// }


class Question28

{
    public static void main(String args[])
    {
        double d = 123.23;

        String by = Long.toBinaryString(Double.doubleToLongBits(d));
        System.out.println("Binary value is "+by);

        String hexa = Double.toHexString(d);
        System.out.println("Hexa value is "+hexa);

         String oct = Long.toOctalString(Double.doubleToLongBits(d));
        System.out.println("Octal value is "+oct);

       
    }
}