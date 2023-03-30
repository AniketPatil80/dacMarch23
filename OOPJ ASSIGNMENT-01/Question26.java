// 26.Write a program to find minimum and maximum number as well as 
// to add two float numbers using methods of Float.

class Question26
{
    public static void main(String args[])
    {
        float a = 20f;
        float b = 30f;

        float sum = Float.sum(a,b);
        System.out.println("The sum is : "+sum);

        float max = Float.max(a,b);
        System.out.println("The max value is : "+max);

        float min = Float.min(a,b);
        System.out.println("The min value is : "+min);

        
    }
}

