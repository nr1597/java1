import java.util.Scanner;

public class program3 {

    static boolean array1(int[] num){
        for(int i=0;i<num.length-2;i++){
            if(num[i]==1 && num[i+1]==2 && num[i+2]==3){
                return true;
            }

            }
        return false;
        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n1 = scanner.nextInt();
        int array[] = new int[n1];
        System.out.println("Enter the n values:");
        for(int i=0;i<n1;i++){
            array[i]= scanner.nextInt();

        }
        System.out.println(array1(array));



    }
}
