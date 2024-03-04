import java.util.Scanner;

public class Question_nine {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)(64+j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
