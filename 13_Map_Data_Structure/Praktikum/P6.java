import java.util.Scanner;

public class P6 {
    public static int maxSum(int arr[], int n, int k) {
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        int res = 0;
        for (int i = 0; i < k; i++)
            res += arr[i];

        int curr_sum = res;
        for (int i = k; i < n; i++) {
            curr_sum += arr[i] - arr[i - k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int target = 0;
        input = input.replace(" ", "");
        input = input.replace("[", "");
        input = input.replace("]", "");
        input = input.replace(",k=", ",");
        String[] strArray = input.split(",");
        int[] nums = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            if (i + 1 == strArray.length) {
                target = Integer.parseInt(strArray[i]);
            } else {
                nums[i] = Integer.parseInt(strArray[i]);
            }
        }

        System.out.println(maxSum(nums, nums.length, target));
    }
}
