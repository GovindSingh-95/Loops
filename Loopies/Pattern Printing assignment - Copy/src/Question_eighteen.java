import java.util.Scanner;

public class Question_eighteen {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= Sc.nextInt();
        int term=1,space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=term;k++){
                if(k==1||k==term) System.out.print(i);
                else System.out.print(" ");
            }
            space--;
            term+=2;
            System.out.println();
        }
    }
}
