public class reverse_a_number {
    public static void main(String args[])
    {
        int num=1234;
        int rev=0;
        while(num>0)
        {
            num=num%10;
            rev=rev*10+num;
        }
        System.out.println("the reverse number is"+rev);
    }
    
} 
