// 6.Write a program to perform below operations on Boolean type to 
// convert:
// a. boolean value into String
// b. boolean value into Boolean instance.
// c. String value into boolean value
// d. String value into Boolean instance.

// class Question6
// {
//     public static void main(String args[])
//     {
//         boolean b = true;
//         String str = String.valueOf(b);
//         System.out.println(str);
//     }
// }

// class Question6
// {
//     public static void main(String args[])
//     {
//        boolean b = false;
//        boolean c = Boolean.valueOf(b);
//        System.out.println(c);
//     }
// }

// class Question6
// {
//     public static void main(String args[])
//     {
//        String str = new String("true");
//        boolean b = Boolean.parseBoolean(str);
//        System.out.println(b);
//     }
// }

class Question6
{
    public static void main(String args[])
    {
        String str = "false";
        boolean b1 = Boolean.parseBoolean(str);
        boolean b2 = Boolean.valueOf(b1);
        System.out.println(b2);
    }
}