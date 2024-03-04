import java.util.Scanner;

public class Question_thirteen {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            space--;
            for(int k=i;k>=1;k--){
                char ch=(char)(64+k);
                System.out.print(ch+" ");
            }
            for(int l=2;l<=i;l++){
                char ch=(char)(64+l);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
