import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to check :" );
        int n=sc.nextInt();
        System.out.println("Given number "+n+" is Strong number: "+ detectStrong(n));

    }
    static int facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    static boolean detectStrong(int n ){
        int sumOfDigits=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            sumOfDigits=sumOfDigits+facto(digit);
            temp=temp/10;
        }

        if(n==sumOfDigits)
            return true;
        return false;
    }
}
