import java.util.Scanner;
public class Question_seven {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        int c=Sc.nextInt();
        System.out.print("Enter number of rows: ");
        int r=Sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
