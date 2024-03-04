import java.util.*;
public class question_one {
    public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int term=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(term+" ");
            }
            term++;
            System.out.println();
        }
    }
}
