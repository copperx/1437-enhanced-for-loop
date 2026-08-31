public class EnhForDemo
{
    public static void main(String[] args)
    {
        int[] array = {-7, 11, 42, 80};
        int sum = 0;
        for(int element : array)
        {
            sum += element;
        }
        System.out.println("The sum is " + sum);

        //---- Example: Changing the element variable doesn't change
        // the array

        String[] devices = {"Printer", "Pen", "Projector"};
        // Try to make each element uppercase
        for(String s : devices)
        {
            s = s.toUpperCase(); // Error: will not change the array!
        }
        // Print the array to show that the array wasn't modified
        for(String s : devices)
        {
            System.out.println(s);
        }
    }
}