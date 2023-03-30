// 10.Write a program to perform below operations on char type to 
// get:
// a. The number of bits used to represent a char value
// b. The number of bytes used to represent a char value
// c. The minimum value a char
// d. The maximum value a char
class Question10
{
    public static void main(String args[])
    {
        int x = Character.SIZE;
        int y = Character.BYTES;
        int z = Character.MIN_VALUE;
        int a = Character.MAX_VALUE;

        System.out.println("The number of bits : "+x);
        System.out.println("The number of Bytes : "+y);
        System.out.println("Minimum value : "+z);
        System.out.println("Minimum value : "+a);

    }
}