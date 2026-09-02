import java.util.Scanner;

public class ArraySearch
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

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = scnr.nextLine();
        
        boolean found = false;
        // Search for the given month in the first column of the 2D array
        for(String[] row : seasons)   // For each row in the seasons matrix ...
        {
            // Compare the first column to the month that the user typed
            if(row[0].equalsIgnoreCase(month)) {
                // Match! Print the second column
                System.out.println("The season for " + row[0] + " is " + row[1]);
                found = true;
            }
        }
        if(!found) {
            System.out.println(month + " is not a month!");
        }
    }
}