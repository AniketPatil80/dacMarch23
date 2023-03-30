// 11.Accept character from command line and perform below 
// operations. Here you can use charAt() method to extract 
// character:
// a. Check whether entered character is letter or digit. If it 
// is digit then print its values as well as code point.
// b. If it is character then check whether it is in lowercase? 
// If it is in lowercase then convert it into upper case and 
// print it well as its code point. If it is in uppercase 
// then convert it into lower case and print it well as its 
// code point.

import java.util.Scanner;
class Question11
{
    public static void main(String args[])
    {
        String b = args[0];
        char ch = b.charAt(0);
        System.out.println((int)ch);

        if((int)ch>=48 && (int)ch<=57)
        {
            System.out.println((int)ch);
        }
        else if((int)ch>=97 && (int)ch<=122)
        {
            char c1 = Character.toUpperCase(ch);
            System.out.println("UPPERCASE : "+c1);
            System.out.println((int)c1);
        }
        else if((int)ch>=65 && (int)ch<=90)
        {
            char c2 = Character.toLowerCase(ch);
            System.out.println("LOWERCASE : "+c2);
            System.out.println((int)c2);
        }

    }
}
