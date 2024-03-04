import java.util.Scanner;

public class question_eleven {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int term=1;
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=space;s++){
                System.out.print("  ");
            }
            space--;
            for(int j=1;j<=term;j++){
                System.out.print(j+" ");
            }
            term+=2;
            System.out.println();
        }
    }
}
