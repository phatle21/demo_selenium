package testselenium.com.Bai1Basic;

import java.util.Arrays;

public class removeDuplicatesAndSort {
    public static int[] removeDuplicatesAndSort(int[] arr) {
        // sx mang
        Arrays.sort(arr);

        // dem so phan tu khong trung lap
        int uniqueCount = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                uniqueCount++;
            }
        }

        // tao mang moi chuc cac phan tu khong trung
        int[] result = new int[uniqueCount];
        result[0] = arr[0];
        int index = 1;

        // copy cac phan tu khong trung vao mang moi
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 2, 1, 4, 8, 1};
        System.out.println("mang goc: " + Arrays.toString(arr));
        // xoa phan tu trung sau khi sx
        int[] result = removeDuplicatesAndSort(arr);
        System.out.println("mang sau khi sx: " + Arrays.toString(result));
    }
}
