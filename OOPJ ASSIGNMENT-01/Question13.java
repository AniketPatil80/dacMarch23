// 13.Write a program to convert:
// a. short value into String
// b. short value into Short instance.
// c. String instance into Short instance.


// class Question13
// {
//     public static void main(String args[])
//     {
//         short sh = 100;
//         String str = Short.toString(sh);
//         System.out.println(str);
// }
// }


// class Question13
// {
//     public static void main(String args[])
//     {
//         short sh = 100;
//         short sh1 = Short.valueOf(sh);
//         System.out.println(sh1);
// }
// }

class Question13
{
    public static void main(String args[])
    {
        String str = new String("123");
        short sh = Short.parseShort(str);
        System.out.println(sh);
    }
}