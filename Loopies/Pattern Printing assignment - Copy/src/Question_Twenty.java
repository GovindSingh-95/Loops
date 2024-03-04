import java.util.Scanner;
public class Question_Twenty {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int star=1,stars=1;
        int space=2*(n-1);
        for(int i=1;i<=n*2;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n){
                star++;
                stars++;
                space-=2;
            }
            if(i>=n+1){star--;
            stars--;
            space+=2;
            }
            System.out.println();
            }
        }
    }
