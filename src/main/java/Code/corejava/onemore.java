public class onemore {
    public static void main(String[] args) {
        int[] arr = new int[5];  // Array to store unique random numbers
        int arrayCount = 0;  // To keep track of how many unique numbers are added
        int count=0;
        while (arrayCount < 5) {
            count++;
            int ran = (int) (Math.random() * 5);  // Generate a random number between 0 and 4
            System.out.println("Generated random number: " + ran);
            
            boolean alreadyExists = false;

            // Check if the random number already exists in the array
            for (int i = 0; i < arrayCount; i++) {
                if (arr[i] == ran) {
                    alreadyExists = true;
                    break;  // Exit the loop if the number already exists
                }
            }

            // If the number does not exist, add it to the array
            if (!alreadyExists) {
                arr[arrayCount] = ran;  // Add the new unique number to the array
                System.out.println("Adding unique number: " + ran);
                arrayCount++;  // Increment the count of unique numbers added
            }
        }

        // Display the unique numbers in the array
        System.out.println("Unique random numbers in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("number of turns are: "+count);
    }
}
 