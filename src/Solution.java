public class Solution {
    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {

        int [] result = new int [A.length+B.length];
        int totalPos = 0 ;
        int aPos = 0;
        int bPos = 0;

        if (A == null && B == null){
            return null;
        }
        else if(A == null){
            return B;
        }
        else if(B == null){
            return A;
        }

        while(aPos < A.length && bPos < B.length){
            if(A[aPos] < B[bPos]){
                result[totalPos++] = A[aPos++];
            }
            else{
                result[totalPos++] = B[bPos++];
            }

        }

        while (aPos < A.length){
            result[totalPos++] = A[aPos++];
        }

        while (bPos < B.length){
            result[totalPos++] = B[bPos++];
        }

        return result;

    }
}