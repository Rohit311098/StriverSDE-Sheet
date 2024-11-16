Seeding
Example:
Input: ‘N’ = 3

Output: 
* * *
* *
*


public class Solution {
    public static void seeding(int n) {
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}