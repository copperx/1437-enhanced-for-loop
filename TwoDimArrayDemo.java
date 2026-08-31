public class TwoDimArrayDemo
{
    public static void main(String[] args)
    {
        // Create a two dimensional array of grades
        int[][] grades = {{7,8}, {10,9}, {9,7}};
        // Print row index 2, column index 1 (should print 7)
        System.out.println(grades[2][1]);
        // Print all values
        // One loop will go through all the rows in the array
        for(int i = 0; i < grades.length; i++)
        {
            // A second loop will go through all the columns in the array
            for(int j = 0; j < grades[0].length; j++)
            {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}