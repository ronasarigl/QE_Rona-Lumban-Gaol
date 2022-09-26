import java.util.Scanner;

public class P5 {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int target = 0;
        input = input.replace(" ", "");
        input = input.replace("[", "");
        input = input.replace("]", "");

        String[] strArray = input.split(",");
        int[] nums = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            nums[i] = Integer.parseInt(strArray[i]);
        }

        int m = nums.length;

        System.out.println(removeDuplicateElements(nums, m));
    }
}
