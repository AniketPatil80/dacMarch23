// 15. Write a program to perform below operations on int type to 
// get:
// a. The number of bits used to represent a integer value
// b. The number of bytes used to represent a integer value
// c. The minimum value a integer
// d. The maximum value a integer


class Question15
{
    public static void main(String args[])
    {
        int x = Integer.SIZE;
        int y = Integer.BYTES;
        int z = Integer.MIN_VALUE;
        int a = Integer.MAX_VALUE;
        System.out.println("no of bits : "+x);
        System.out.println("no of bytes : "+y);
        System.out.println("min value of integer: "+z);
        System.out.println("max value of integer : "+a);

    }
}