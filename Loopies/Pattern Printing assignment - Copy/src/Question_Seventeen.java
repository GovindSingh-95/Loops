import java.util.Scanner;
public class Question_Seventeen{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int star=1,space=n-1;
        for(int i=1;i<=2*n+1;i++){
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=star;k++){
                if(k==1||k==star)System.out.print(" * ");
                else System.out.print("   ");
            }
            if(i<n){
                space--;
                star+=2;
            }
            if(i>=n){
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}
