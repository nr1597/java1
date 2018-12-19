import java.util.Arrays;
import java.util.Scanner;

public class progrm10 {

    public int solution(int a[],int n){
        int s[] = new int[n];
        s=a;
        Arrays.sort(s);
        int a1 =1;
        for(int i=0;i<n-1;i++){
            if(s[i+1]!= s[i]+1){
                a1=0;
                return a1;
            }

        }
        return a1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the number values:");
        for(int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }
        progrm10 p1 = new progrm10();
        System.out.println(p1.solution(array,n));

    }
}
