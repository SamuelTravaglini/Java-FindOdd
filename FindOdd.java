/** CodeWars Coding Exercise
 ** Tasks was to find element in an array that appears an odd number of times.
 ** Not optimal solution. Time complexity O(N^2).
 */
public class FindOdd {
  
  public static int findIt(int[] a) {
    int n = a.length;
    int odd = 0;

    for (int ii=0; ii < n; ii++) {   
        int count = 0;
        for (int jj = 0; jj < n; jj++) {  
          if (a[ii] == a[jj]) {
            count++;
          }
        }
        
        if (count % 2 != 0) {
          odd = a[ii];
        }
      }
    
    return odd;
  }
}