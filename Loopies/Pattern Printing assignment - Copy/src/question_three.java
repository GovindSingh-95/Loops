import java.util.Scanner;
public class question_three {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int alpha=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=alpha;j++){
                char ch=(char)(j+64);
                System.out.print(ch+" ");
            }
            alpha++;
            System.out.println();
        }
    }
}
