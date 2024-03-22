import java.util.Arrays;

public class Sum{
    public static void main(String[] args) {
        int[] arr = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(arr);
	int n = arr.length;
        int large2 = arr[n - 2];
        int large3 = arr[n - 3];
        int sum = large2 + large3;
        System.out.println("The sum of second and third largest numbers is: " + sum);
    }
}
