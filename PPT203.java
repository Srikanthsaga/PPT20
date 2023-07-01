public class PPT203 {
    public static boolean isLevelOrderBST(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }

        int n = arr.length;
        int lower = Integer.MIN_VALUE;
        int upper = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < lower || arr[i] > upper) {
                return false;
            }

            if (arr[i] < upper) {
                upper = arr[i];
            } else {
                lower = arr[i];
            }
        }

        return true;
    }
}
