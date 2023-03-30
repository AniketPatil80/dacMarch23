// 30.Write a program to find minimum and maximum number as well as 
// to add two double numbers using methods of Double.

class Question30
{
    public static void main(String args[])
    {
        double a = 20.15;
        double b = 30.12;

        double sum = Double.sum(a,b);
        System.out.println("The sum is : "+sum);

        double max = Double.max(a,b);
        System.out.println("The max value is : "+max);

        double min = Double.min(a,b);
        System.out.println("The min value is : "+min);

        
    }
}
