import java.util.*;
public class percentage {
    public static void main(String args[])

    {
        Scanner sc= new Scanner(System.in);
        System.out.println("marks of subject1");
        int S1=sc.nextInt();
        System.out.println("marks of subject2");
        int S2=sc.nextInt();
        System.out.println("marks of subject3");
        int S3=sc.nextInt();
        System.out.println("marks of subject4");
        int S4=sc.nextInt();
        System.out.println("marks of subject5");
        int S5=sc.nextInt();
        int percentage=(S1+S2+S3+S4+S5)*100/500;
        System.out.println("percentage of Student is:  "+ percentage);
        sc.close();
    }
    
}

