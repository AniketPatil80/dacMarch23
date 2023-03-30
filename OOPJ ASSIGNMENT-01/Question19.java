// 19.Write a program to perform below operations on long type to 
// get: 
// a. The number of bits used to represent a long value
// b. The number of bytes used to represent a long value
// c. The minimum value a long
// d. The maximum value a long

class Question19
{
    public static void main(String args[])
    {
        long x = Long.SIZE;
        long y = Long.BYTES;
        long z = Long.MIN_VALUE;
        long a = Long.MAX_VALUE;

        System.out.println("The number of bits : "+x);
        System.out.println("The number of bytes : "+y);
        System.out.println("min value : "+z);
        System.out.println("max value : "+a);

    }
}
