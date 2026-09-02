public class FindMax
{
    public static void main(String[] args)
    {
        double[][] values = {
            {-0.01, 0.06, 0.098},
            {0.087, 0.15, 0.099, 0.76},
            {0.099, 0.01}
        };

        // EXERCISE: Convert the following nested loop into
        // two enhanced for loops (see board for example)
        // Find the max
        double max = values[0][0];
        for(double[] row : values) {
            for(double element : row) {
                if(element > max) {
                    max = element;
                }
            }
        }
        System.out.println("The max is " + max);

    }
}