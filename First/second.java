package First;

//import java.util.Scanner;

public class second {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String Content = sc.nextLine();
    // System.out.println(Content);
    // }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, 0, nums2.length);

        for (int i = 0; i < nums3.length - 1; i++) {
            for (int j = i + 1; j < nums3.length - i - 1; j++) {
                if (nums3[j] > nums3[j + 1]) {
                    int temp = nums3[j];
                    nums3[j] = nums3[j + 1];
                    nums3[j + 1] = temp;
                }
            }
        }
        System.out.print(nums3);
    }
}
