import java.util.*;
public class Question_four{
    public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=Sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=num;j++){
                if(i%2==0){
                    char ch=(char)(64+j);
                    System.out.print(ch+" ");
                }
                else System.out.print(j+" ");
            }
         num++;
            System.out.println();
        }
    }
}
