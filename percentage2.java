import java.util.Scanner;
public class percentage2 {
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("marks of subject1 = ");
        float S1=Sc.nextFloat();
        System.out.println("marks of subject2");
        float S2=Sc.nextFloat();
        System.out.println("marks of subject3");
        float S3=Sc.nextFloat();
        System.out.println("marks of subject4");
        float S4=Sc.nextFloat();
        System.out.println("marks of subject5");
        float S5=Sc.nextFloat();
        float percentage=(S1+S2+S3+S4+S5)*100/500;
        System.out.println("percentage of Student is:  "+ percentage);
        Sc.close();
    }
    
}
