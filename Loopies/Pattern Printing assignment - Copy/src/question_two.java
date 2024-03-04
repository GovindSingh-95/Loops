import java.util.Scanner;
public class question_two {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int num=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j+" ");
            }
            num--;
            System.out.println();
        }
    }
}
