
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int t=n;
        int sum=0;
        while(n!=0)
        {
            int x=n%10;
            sum=(sum*10)+x;
            n=n/10;
        }
        if(t==sum)
        System.out.println("The " + t + " is palindrome number");
        else
        System.out.println("The "+ t +" is not palindrome number");
    }
}