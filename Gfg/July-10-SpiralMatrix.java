//note this code can be optimize in O(n) time see gfg solution


//find kth elemnt in spiral matrix



class Solution {
    /* You are required to complete this method */
    int findK(int A[][], int n, int m, int k) {
        int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = m - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int j = leftCol; j <= rightCol; j++) {
                if (--k == 0) {
                    return A[topRow][j];
                }
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                if (--k == 0) {
                    return A[i][rightCol];
                }
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    if (--k == 0) {
                        return A[bottomRow][j];
                    }
                }
                bottomRow--;
            }

            // Traverse left column
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    if (--k == 0) {
                        return A[i][leftCol];
                    }
                }
                leftCol++;
            }
        }

        return -1; // Kth element not found
    }
}
