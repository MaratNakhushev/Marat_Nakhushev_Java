public class Third_task {
    public static void main(String[] args) {
        int arr[] = new int[] {8, 9, 7, 6, 12, 15, 2, 21, 1, 7, 66};
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3) == 0)
             System.out.print(arr[i]);
        }
    }
}
