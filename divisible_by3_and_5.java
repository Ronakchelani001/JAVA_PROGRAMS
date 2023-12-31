public class divisible_by3_and_5 {
    public static void main(String args[]){
        int arr[]=new int[100];
        for(int i=0;i<100;i++)
        {
             arr[i]=i;
        }
        
        for(int i=0;i<100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
                
            }


        }

    }
    
}
