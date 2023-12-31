public class number_of_digits {
    public static void main(String args[])
    {
     int num=1234;
     int count=0;
     while(num>0){
        num=num/10;
        count+=1;
     }
     System.out.println("the number of digit is"+count);

    }

    
}
