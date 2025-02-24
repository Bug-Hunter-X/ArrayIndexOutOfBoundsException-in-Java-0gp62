public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //To avoid ArrayIndexOutOfBoundsException, avoid accessing elements beyond the array bounds.
        //If you need to access a specific element, ensure that the index is within the valid range (0 to arr.length -1)
        //If you try to access arr[5], it will throw ArrayIndexOutOfBoundsException because the valid indices are 0 to 4.
        System.out.println(arr[4]);
    }
}