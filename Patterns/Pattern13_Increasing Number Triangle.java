Increasing Number Triangle
  
Example:
Input: ‘N’ = 3

Output: 

1
2 3
4 5 6

public class Solution {
    public static void nNumberTriangle(int n) {
        
        int num=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
