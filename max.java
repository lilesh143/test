public class max {
    public static void main(String[] args) {
        int[] arr = {4, 6, 23, 12 ,7 ,66, 50};
        int answer = maximum(arr);  // answer ko yaha store kar rhe hai
        System.out.println("The maximum in this array = " + answer); // answer print krne k liye
    }

    static int maximum(int[] arr){
        int max = arr[0]; // Starting me.... arrqy ke 0th number ko maximum man rahe hai. (4)

        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        
        return max; // pura loop hone k bad maximum value yaha store hogi
    }

  
}
