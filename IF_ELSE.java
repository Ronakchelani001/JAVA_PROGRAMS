import java.util.Scanner;

public class IF_ELSE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double j= scan.nextDouble();
        String k=scan.nextLine();
        System.out.println("String:"+i);
        System.out.println("Double:"+j);
        System.out.println("Int:"+k); 
        scan.close();
    }
}
