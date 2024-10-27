import java.util.*;

public class all_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("For Loop:");
        int i = 0;
        int num = scan.nextInt();

        for(i=0; i<num; i++){
            System.out.println(i);
        }

        System.out.println("While Loop:");
        i = 0;
        num = scan.nextInt();

        while(i<num){
            System.out.println(i);
            i++;
        }

        System.out.println("Do While Loop:");
        i = 0;
        num = scan.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<num);
    }
}
