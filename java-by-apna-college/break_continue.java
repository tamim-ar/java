import java.util.Scanner;

public class break_continue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("For Loop:");
        int i = 0;
        int num = scan.nextInt();

        for (i = 0; i < num; i++) {
            if(i == 5){
                break;
            }
            else if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
