// 20.Write a program to convert:
// a. long value into String
// b. long value into Long instance.
// c. String instance into Long instance.
// d. long value into binary, octal and hexadecimal string.

// class Question20
// {
//     public static void main(String args[])
//     {
//         long l = 4524;
//         String str = Long.toString(l);
//         System.out.println("value is : "+str);

//     }
// }

// class Question20
// {
//     public static void main(String args[])
//     {
//         long l = 4524;
//         Long l1 = new Long(l);
//         System.out.println("value is : "+l1);

//     }
// }

// class Question20
// {
//     public static void main(String args[])
//     {
//         String str = new String("52454");
//         long l = Long.parseLong(str);
//         Long l1 = new Long(l);
//         System.out.println("value is : "+l1);

//     }
// }

class Question20
{
    public static void main(String args[])
    {
        long l = 123;

        String by = Long.toBinaryString(l);
        System.out.println("Binary value is "+by);

        String hexa = Long.toHexString(l);
        System.out.println("Hexa value is "+hexa);

        String oct = Long.toOctalString(l);
        System.out.println("Octal value is "+oct);
    }
}