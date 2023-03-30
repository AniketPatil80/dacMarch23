// 18. Write a program to find minimum and maximum number as well as 
// to add two integer numbers using methods of Integer.

class Question18
{
    public static void main(String args[])
    {
        int a = 10;
        int b =12;
        int sum = Integer.sum(a,b);
        System.out.println("sum : "+sum);
        int max = Integer.max(a,b);
        System.out.println("Max : "+max);
        int min = Integer.min(a,b);
        System.out.println("Min : "+min);
    }
}