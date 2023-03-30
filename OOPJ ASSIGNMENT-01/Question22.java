// 22. Write a program to find minimum and maximum number as well as 
// to add two long numbers using methods of Long.

class Question22
{
    public static void main(String args[])
    {
        long a = 20;
        long b = 30;

        long sum = Long.sum(a,b);
        System.out.println("The sum is : "+sum);

        long max = Long.max(a,b);
        System.out.println("The max value is : "+max);

        long min = Long.min(a,b);
        System.out.println("The min value is : "+min);

        
    }
}
