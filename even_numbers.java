public class even_numbers {
    public static void main(String[] args) {
        int arr[] = new int[11];

        for (int i = 1; i <= 10; i++) {
            arr[i] = i;

        }
        System.out.println("even numbers are");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

}
