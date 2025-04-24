class BinarySearch {
    static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x) {
                return mid;
            }

            // If the element is smaller than mid, it can only be present in the left subarray
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }

            // Else the element can only be present in the right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // Element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10; // Element to search
        int result = binarySearch(arr, 0, arr.length - 1, x);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
