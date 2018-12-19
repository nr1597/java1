import java.util.Scanner;

public class program9 {
    public int solution1(int[] A,int n){
        int count =0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(A[i] == 0) {
                count1++;
            }
            if(A[i] == 1){
                    count = count+count1;
                }
                if(count > 1000000000){
                return -1;
            }

        }
        return count;

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
        program9 p2 = new program9();
        System.out.println(p2.solution1(array,n));
    }
}
