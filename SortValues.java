/**
 *
 * Find Sorted Indexes [20 points]
 * Implement a Java method that sorts your list/array and returns the sorted 
 * array and the original positions of the unsorted array.
 * Example:
 * Unsorted Array = {10, 30, 2, 3, 63}
 * Sorted Array = {2, 3, 10, 30, 63}
 * Sorted Indexes = [2,3,0,1,4] 
 * 
 * @author Fabian_Cuero
 */
public class SortValues {
    
    public static void main(String[] args){
        // create local variables
        int sort[] = { 10, 30, 2, 3, 63, 15, 22, 44, 50};
        int clone[] = new int[sort.length];
        
        System.out.print("Unsorted Array: \t");
        // loop thru the array, load the clone and print the unsorted values
        for(int i =0; i < sort.length; i++){
            clone[i] = sort[i]; // assign the values
            System.out.print(sort[i] + "   \t");
        }
        System.out.println();
        
        // variable for the sorted indexes
        int index[] = new int[sort.length];
        // loop thru the array to apply bubble sort algorithm
        for(int i = 0; i < sort.length -1; i++){
            for (int j = 0; j < sort.length - 1; j++){
                if (sort[j] > sort[j+1]){
                    int tmp = sort[j];
                    sort[j] = sort[j+1];
                    index[j] = j+1;
                    sort[j+1] = tmp;
                } // end if
            } // end for j
        } // end for i
        
        System.out.print("Sorted Array:   \t");
        // loop thru the array and print the nw sorted values
        for (int i = 0; i < sort.length; i++){
            System.out.print(sort[i] + "   \t");
        } // end i
        System.out.println();
        
        System.out.print("Sorted Indexes: \t");
        // loop thru the array and print the indexes
        for (int i = 0; i < sort.length; i++){
            for(int j = 0; j < clone.length; j++){
                if(clone[j] == sort[i]){
                    System.out.print(j + "   \t");
                    break;
                } // end if
            } // end j
        } // end i
        
        System.out.println();
    }
}
