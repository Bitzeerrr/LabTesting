public class main {
    public static int maxValue(int[] arr) {
        int item = Integer.MIN_VALUE;
        if (arr.length <= 0) {
            throw new IllegalArgumentException("ERROR:The array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > item) {
                item = arr[i];
            }
        }
        return item;
    }
    public static int minValue(int[] arr) {
        int item = Integer.MAX_VALUE;
        if (arr.length <= 0) {
            throw new IllegalArgumentException("ERROR:The array is empty");
        }
        for (int start=0; start < arr.length; start++) {
            if (arr[start] < item) {
                item = arr[start];
            }
        }
        return item;
    }
} 