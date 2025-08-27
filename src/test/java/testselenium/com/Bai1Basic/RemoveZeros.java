package testselenium.com.Bai1Basic;

import java.util.Arrays;

public class RemoveZeros {
    // Array {1; 7; 0; 0; 8; 12; 10; 0; 0; 4}. Method to remove “0” from the given Array.
    // => dem so phan tu khac 0 va tao mang moi

    public static int[] removeZeroes(int[] nums) {
            // count element # 0
        int count = 0;
        for (int num : nums) {
            if(num != 0) count++;
        }
        // tao mang moi ko chua so 0
        int[] result = new int[count];
        int index = 0;
        for(int num : nums) {
            if (num != 0){
                result[index++] = num;
            }
        }
        // sx tang dan
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
         int[] nums = {1, 7, 0, 0, 8, 12, 10, 0, 0, 4};
         int[] result = removeZeroes(nums);
        System.out.println(Arrays.toString(result));
    }
    // them do kho: [sau khi loai bo 0 hoac trung nhau thi sx tang dan]

    /*
    loai 1: loai bo so giong nhau va sx tang dan
     */

}
