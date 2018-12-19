import java.util.Scanner;

public class program7 {

    public int[] solution(int A[], int N, int K){
        int array2[] = new int[N];
        for(int l=0;l<K;K--){
            int j=0;
            for(int i=0;i<N;i++){
                if(i==0){
                    array2[j] = A[N-1];
                    j++;
                }
                else{
                    array2[j] = A[i-1];
                    j++;
                }
            }

            for(int p=0;p<N;p++){
                A[p]=array2[p];
            }

        }
        return array2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n1 = scanner.nextInt();
        int array[] = new int[n1];
        System.out.println("Enter the number values:");
        for(int i=0;i<n1;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter the number to shift:");
        int k = scanner.nextInt();
        program7 pp = new program7();
        int s[] = pp.solution(array,n1,k);
        for(int a=0;a<n1;a++){
            System.out.println(s[a]);
        }


    }
}
