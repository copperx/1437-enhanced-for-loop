public class TwoDimArrayDemo2
{
    public static void main(String[] args)
    {
        // Convert this table into a 2D array
        // Month    Season
        // January  Winter
        // February Winter
        // March    Spring
        // April    Spring
        // May      Spring
        // June     Summer
        // July     Summer
        // August   Summer
        // September Autumn
        // October  Autumn
        // November Autumn
        // December Winter
        String[][] seasons = {
            {"January", "Winter"},
            {"February", "Winter"},
            {"March", "Spring"},
            {"April", "Spring"},
            {"May", "Summer"},
            {"June", "Summer"},
            {"July", "Summer"},
            {"August", "Autumn"},
            {"September", "Autumn"},
            {"October", "Autumn"},
            {"November", "Autumn"},
            {"December", "Winter"}
        };

        // Print the entire table to the screen
        for(int i = 0; i < seasons.length; i++)
        {
            for(int j = 0; j < seasons[i].length; j++)
            {
                System.out.printf("%10s", seasons[i][j]);
            }
            
            System.out.println();
        }
    }
}