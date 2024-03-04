import java.util.Scanner;
public class Question_fifteen {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int space=1,store=n,stores=n;
        for(int i=1;i<=2*n+1;i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            int term=1;
            for(int j=1;j<=stores;j++){
                System.out.print(term);
            term++;}
            stores--;
            for(int k=1;k<=space;k++){
                System.out.print(" ");
                term++;}
            space+=2;
            for(int l=1;l<=store;l++){
                System.out.print(term);
                term++;}
            store--;
            System.out.println();
        }
    }
}
