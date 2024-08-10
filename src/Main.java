import java.util.Scanner;
/* N = 3
***
**
*
*/
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Number of digit: ");
        int N = inp.nextInt();

        for (int i = 1; i <= N; ++i){
            for(int k = 1; k <= N - i + 1; ++k)
                System.out.print("*");
            System.out.println();
        }
    }
}