import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,c;
        System.out.println("The fibonacci series of "+n+" is:");
        System.out.print("0 1 ");
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}