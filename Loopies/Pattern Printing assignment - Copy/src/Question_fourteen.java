import java.util.Scanner;
public class Question_fourteen {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
       System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        for(int i=1;i<=2*n+1;i++){
            char ch=(char)(64+i);
            System.out.print(ch+" ");}
        System.out.println();
        int space=1;
        int store=n,num=n;
        for(int i=1;i<=n;i++){
            int term=1;
            for(int j=1;j<=num;j++){
                char ch=(char)(64+term);
                System.out.print(ch+" ");
            term++;}
            num--;
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            term++;}
            space+=2;
            for(int l=1;l<=store;l++){
                char ch=(char)(64+term);
                System.out.print(ch+" ");
         term++;}
            store--;
            System.out.println();}}}
