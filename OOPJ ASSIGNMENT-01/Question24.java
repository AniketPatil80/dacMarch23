// 24.Write a program to convert:
// a. float value into String
// b. float value into Float instance.
// c. String instance into Float instance.
// d. float value into hexadecimal string.

// class Question24
// {
//     public static void main(String args[])
//     {
//         float f = 145f;
//         String str = Float.toString(f);
//         System.out.println(str);
//     }
// }

// class Question24
// {
//     public static void main(String args[])
//     {
//         float f = 145f;
//         Float f1 = new Float(f);
//         System.out.println(f1);
//     }
// }


// class Question24
// {
//     public static void main(String args[])
//     {
//        String str = new String("451");
//        float f = Float.parseFloat(str);
//        Float f1 = new Float(f);
//        System.out.println(f1);
//     }
// }


class Question24
{
    public static void main(String args[])
    {
       float f = 123;

       String hexa = Float.toHexString(f);
       System.out.println("The hexa decimal value is : "+hexa);
    }
}