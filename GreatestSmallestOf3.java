import java.util.Scanner;
public class GreatestSmallestOf3{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        if(x>y)
        {
            if(x>z)
            System.out.println("The greatest number is "+x);
            else
            System.out.println("The greatest number is "+z);
        }
        else if(y>x)
        {
            if(y>z)
            System.out.println("The greatest number is "+y);
            else
            System.out.println("The greatest number is "+z);
        }
        /*else if(x==y && x<z)
        System.out.println("The greatest number is "+z);
        System.out.println("The smallest number is "+x);
         else if(x==y && x>z)
        System.out.println("The greatest number is "+z);
        System.out.println("The smallest number is "+x);*/
        if(x<y)
        {
            if(x<z)
            System.out.println("The smallest number is "+x);
            else
            System.out.println("The smallest number is "+z);
        }
        else if(y<x)
        {
            if(y<z)
            System.out.println("The smallest number is "+y);
            else
            System.out.println("The smallest number is "+z);
        }
        
        //System.out.println(x+y);
    }
}