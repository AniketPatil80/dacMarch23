// 27.Write a program to perform below operations on Double type to 
// get: 
// a. The number of bits used to represent a double value
// b. The number of bytes used to represent a double value
// c. The minimum value a double
// d. The maximum value a double

class Question27
{
    public static void main(String args[])
    {
        double x = Double.SIZE;
        double y = Double.BYTES;
        double z = Double.MIN_VALUE;
        double a = Double.MAX_VALUE;

        System.out.println("The number of bits : "+x);
        System.out.println("The number of bytes : "+y);
        System.out.println("min value : "+z);
        System.out.println("max value : "+a);

    }
}
