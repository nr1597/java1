import java.util.Scanner;

public class program4 {

    public String repeatFront(String n,int n1){
        String newLine = " ";
        while(n1>0){
            for(int i = 0;i<n1;){
                newLine += n.substring(i,n1);
                n1--;
            }
        }
        return newLine;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String n = scanner.nextLine();
        System.out.println("Enter the number:");
        int n1 = scanner.nextInt();
        program4 p = new program4();
        System.out.println(p.repeatFront(n,n1));

    }
}
