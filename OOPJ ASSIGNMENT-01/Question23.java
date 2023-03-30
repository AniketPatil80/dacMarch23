// 23.Write a program to perform below operations on float type to 
// get: 
// a. The number of bits used to represent a float value
// b. The number of bytes used to represent a float value
// c. The minimum value a float
// d. The maximum value a float


class Question23
{
    public static void main(String args[])
    {
        float x = Float.SIZE;
        float y = Float.BYTES;
        float z = Float.MIN_VALUE;
        float a = Float.MAX_VALUE;

        System.out.println("The number of bits : "+x);
        System.out.println("The number of bytes : "+y);
        System.out.println("min value : "+z);
        System.out.println("max value : "+a);

    }
}
