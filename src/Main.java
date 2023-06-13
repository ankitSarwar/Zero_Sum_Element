import java.util.*;

public class Main {
    public static int[] findSumZeroElements(int[] arr) {
    int n = arr.length;
    int currSum = 0;
    Map<Integer, Integer> sumMap = new HashMap<>();

    for (int i = 0; i < n; i++) {
        currSum += arr[i];

        if (currSum == 0) {
            return getSubarray(arr, 0, i);
        }
        if (sumMap.containsKey(currSum)) {
            return getSubarray(arr, sumMap.get(currSum) + 1, i);
        }

        sumMap.put(currSum, i);
    }

    return new int[]{};
}

    public static int[] getSubarray(int[] arr, int start, int end) {
        int[] subarray = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            subarray[index++] = arr[i];
        }
        return subarray;
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {-4, 1, 3, -2, -1};

//        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        int[] result = findSumZeroElements(arr);
        if (result.length > 0) {
            System.out.print("Subarray with sum zero: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No elements found");
        }
    }
}