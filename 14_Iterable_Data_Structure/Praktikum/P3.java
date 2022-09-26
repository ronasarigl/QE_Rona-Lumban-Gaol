import java.util.Scanner;

public class P3 {
    // Naive method to find a pair in an array with a given sum
    public static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.printf("[%d, %d]", i, j);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int target = 0;
        input = input.replace("[", "");
        input = input.replace("]", "");
        input = input.replace(" ", "");
        input = input.replace(",target=", ",");
        String[] strArray = input.split(",");
        int[] nums = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            if (i + 1 == strArray.length) {
                target = Integer.parseInt(strArray[i]);
            } else {
                nums[i] = Integer.parseInt(strArray[i]);
            }
        }

        findPair(nums, target);
    }
}
