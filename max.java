public class max {
    public static void main(String[] args) {
        int[] arr = {4, 6, 23, 12 ,7 ,66, 50};
        int answer1 = maximum(arr);  // answer ko yaha store kar rhe hai
        System.out.println("The maximum in this array = " + answer1); // answer print krne k liye
        
        int answer2 = minimum(arr);  // answer ko yaha store kar rhe hai
        System.out.println("The minimun in this array = " + answer2); // answer print krne k liye
    }

    static int maximum(int[] arr){
        int max = arr[0]; // Starting me.... array ke 0th number ko maximum man rahe hai. (4)
        
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        
        return max; // pura loop hone k bad maximum value yaha store hogi
    }

      static int minimum(int[] arr){
        int min = arr[0]; // Starting me.... array ke 0th number ko minimum man rahe hai. (4)
        
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        
        return min; // pura loop hone k bad maximum value yaha store hogi
    }

  
}
