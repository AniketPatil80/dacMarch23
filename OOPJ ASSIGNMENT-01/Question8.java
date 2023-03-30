// 8.Write a program to convert:
// a. byte value into String
// b. byte value into Byte instance.
// c. String instance into Byte instance.

// class Question8
// {
//     public static void main(String args[])
//     {
//         byte b = 1;
//         String str = Byte.toString(b);
//         System.out.println(str);
//     }
// }

// class Question8
// {
//     public static void main(String args[])
//     {
//         byte b = 1;
//         byte b1 = Byte.valueOf(b);
//         System.out.println(b1);
//     }
// }

class Question8
{
    public static void main(String args[])
    {
        String str = new String("12");
        byte b = Byte.parseByte(str);
        System.out.println(b);
    }
}