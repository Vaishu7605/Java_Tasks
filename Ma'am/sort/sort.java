
import java.util.Arrays;
import java.util.Collections;

public class sort {

    public static void main(String[] args) {

        // -----------A. Sorting array in Ascending Order------------------//
        int[] array = new int[]{12, 22, 3, 6, 90, 88, 5};
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: " + Arrays.toString(array));

        // -----------B. Sorting array in Decending Order------------------//
        Integer[] ar = {22, 32, 36, 45, 66, 67, 76, 77, 87, 99};
        // sorts array[] in descending order   
        Arrays.sort(ar, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(ar));

        // -----------C. Sorting array in Decending Order------------------//
        String[] S1 = {"Tripura", "Manipur", "Tamilnadu", "Gujarat", "Kerala", "Jharkhand", "Mizoram", " Nagaland", "Odissa", "Delhi", "Rajasthan", "Jammu and Kashmir", "Chattisgarh", "Arunachal Pradesh"};
        Arrays.sort(S1, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(S1));

        // -----------D. Sorting array in Decending Order------------------//
        String[] S2 = {"Trapti", "Manorama", "Vaishnavi", "Jyoti", "Anjali", "Sakshi", "Atul", "Pushpanjali", "Annpurna", "Ashish", "Piyush", "Hanuman", "Pratibha", "Ambika", "Sugandha", "Richa", "Saksham"};
        Arrays.sort(S2);
        System.out.println("Elements of array sorted in ascending order; " + Arrays.toString(S2));
    }
}
