// 7.Write a program to perform below operations on byte type to 
// get:
// a. The number of bits used to represent a byte value
// b. The number of bytes used to represent a byte value
// c. The minimum value a byte
// d. The maximum value a byte

class Question7
{
    public static void main(String args[])
    {
        int x = Byte.SIZE;
        int y = Byte.BYTES;
        int z = Byte.MIN_VALUE;
        int a = Byte.MAX_VALUE;
        System.out.println("no of bits : "+x);
        System.out.println("no of bytes : "+y);
        System.out.println("min value of byte: "+z);
        System.out.println("max value of byte : "+a);
    }
    }
    
    