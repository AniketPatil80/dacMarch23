// 12.Write a program to perform below operations on short type to 
// get:
// a. The number of bits used to represent a short value
// b. The number of bytes used to represent a short value
// c. The minimum value a short
// d. The maximum value a short
class Question12
{
    public static void main(String args[])
    {
        int x = Short.SIZE;
        int y = Short.BYTES;
        int z = Short.MIN_VALUE;
        int a = Short.MAX_VALUE;

        System.out.println("The number of bits : "+x);
        System.out.println("The number of bytes : "+y);
        System.out.println("The minimum value : "+z);
        System.out.println("The maximum value : "+a);
    }
}
