import java.util.Arrays;
import java.util.Scanner;

public class program8 {

    public int solution3(int[] A,int n){
        int aa[] = new int[n];
        aa=A;
        int sum = 0;
        sum = (n+1)*(n+2)/2; //sum of n numbers
        Arrays.sort(aa);
        for(int i=0;i<n;i++){
            sum = sum - aa[i];
        }
        return sum;
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
        program8 p3 = new program8();
        System.out.println(p3.solution3(array,n));
    }
}
