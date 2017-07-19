package review.review_02;

// Create a method that takes in set of numbers in an array, and also has
// the ability to search for a specific number in the array.
// If it finds the number the method should return the index position of the number,
// but, if not found it should return a negative number.

public class Arrays_Assigment {

    public static void main(String[] args) {

        System.out.println(search(new int[]{2, 3, 4, 5, 6, 5}, 5));  // return index position 3
        System.out.println(search(new int[]{2, 3, 4, 5, 6,},   9));  // return -1

    }

    public static int search(int[] nums, int target) {

        // loop through the values of the argument 'nums' and if 'target' is listed return
        // the index positions(s)

        // you can get rid of the first 'Return' statement by creating a variable and replacing it:
        int indexPosition = -1;

        for (int i = 0; i < nums.length; i = i + 1) {
            //System.out.println(nums[i]);

            while (nums[i] == target) {
                //value found
                //return i;
                indexPosition = i;
                //System.out.println(indexPosition);
                break;
            }
        }
        // value not found
        // return -1;
        return indexPosition;
    }

}
