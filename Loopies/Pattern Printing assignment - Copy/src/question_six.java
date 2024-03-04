import java.util.*;
public class question_six {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int star=1;
        for(int i=1;i<=2*n+1;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<=n)star++;
            if(i>n)star--;
            System.out.println();
        }
    }
}
