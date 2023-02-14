/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package richard.neewwwclass;

/**
 *
 * @author CSXRP
 */
public class NEEWWWCLASS {

    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0;
        int iterate2 = 0;
        int largest = 0;
        int count = 0;
        while (iterate1 < sz - 1) {
            System.out.println(iterate1 + " "+ iterate2);
            iterate2++;
            count ++;
         // iterate 2 becomes whatever iterate1 is at
            if (iterate2 == sz) {
                iterate1++;
                
                iterate2 = iterate1;
                
                continue;
            }
            
            int product = arr[iterate1] * arr[iterate2];
            if (product > largest) {
                largest = product;
            }
        }
        System.out.println(count);
        
        return largest;
        
    }

    public static void main(String[] args) {
        // size is N and calculates the big O of N
        for (int size = 100; size < 101; size *= 10) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = 10;
            }
            getLargest(arr, size);
        }
    }
}
