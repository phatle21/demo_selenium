package testselenium.com.Bai1Basic;

public class RemoveDuplicates {
    // Xóa phần tử trùng lặp trong mảng đã sắp xếp

    // writeIndex: chỉ số nơi ghi phần tu khong trung lap
    // i: chi so duyet qua mang de kiem tra cac phan tu
    // một phần tử khác với phần tử trước nó, ghi phần tử đó vào writeIndex và tăng writeIndex.
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int writeIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // so sau khac so truoc
            if(nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4};
        int newLength = removeDuplicates(nums);
        System.out.println(newLength);
        for(int i = 0 ; i < newLength; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
