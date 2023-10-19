import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("-------- Binary To Decimal --------");
        System.out.print("Enter a Binary NUmber :");
        int n =num.nextInt();
        int pow=1, ans=0,m=n;
        while(n>0){
            int ud=n%10;
            ans+=(ud*pow);
            n/=10;
            pow*=2;
        }
        System.out.println("Binary Number : "+m+" to Decimal Number : "+ans);
        num.close();
    }
}