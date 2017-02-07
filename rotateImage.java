*ROTATE IMAGE
You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).*/

//CODE//
public class Solution {
    public void rotate(int[][] matrix) {
        
        int a[][]=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                a[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0,k=matrix.length-1;j<matrix.length;j++,k--)
            {
                matrix[i][j]=a[i][k];
            }
            
        }
        
    }
}