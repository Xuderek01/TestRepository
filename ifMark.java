import java.util.Scanner;

public class ifMark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Derek

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        for (int i = 1; i <= N1; i++){
            
            if(N1%i == 0 && N2%i == 0){
                System.out.println(i + " is a factor of " + N1 + " and " + N2);
            }
            
        }

    }
    
}
