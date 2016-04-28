package stack;

import java.io.*;

public class findMultiples {

	static void reduceJumps(int[] A) {
        
        for (int i =0; i < A.length; i++) {
         for (int j =0; j < A.length; j++) {
             if (A[j] !=0 && A[i]%A[j] == 0 && i!=j ) {
                 //Here we are deleting those elements from A which are multiples of 
            	 //other elements in A
            	 //Output of this is A={2,0,5}
                  A[i] = 0;
                 break;
              }
         }
            
        }
    }

       
    static boolean isAlreadyEaten(int [] A, int jump, int i) {
        boolean alreadyEaten = false;
          for (int j=0; j<i ;j++) {
             if (A[j] == 0) {
                 continue;
             }
              if (jump % A[j] == 0) {
                  alreadyEaten = true;
                  break;
              }
          }
          
          return alreadyEaten;
    }
    
    static int countUneatenLeaves(int N, int[] A) {
        reduceJumps(A);
        int eatenleaves =0;
        for (int i=0; i< A.length; i++) {
            if (A[i] == 0) {
                continue;
            }
            int k = 1;
            int jump = A[i] * k;
            while(jump <= N) {
              
              if (!isAlreadyEaten(A, jump, i)) {
                 eatenleaves++;
              }
              k++;
              jump = A[i] * k;
              
            }
        }
       
       return N-eatenleaves;

    }

    public static void main(String[] args) throws IOException{
        int res;
        int n = 10;
        int[] _A = {2,4,5};
        res = countUneatenLeaves(n, _A);
        System.out.println(res);
    }
}