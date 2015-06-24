// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
    	int totalNumberOfRows = (int)(1 + (length - 2*radius)/(radius*Math.sqrt(3)));
    	int oddRowNumber = totalNumberOfRows/2 + totalNumberOfRows%2;
    	int evenRowNumber = totalNumberOfRows/2;
    	int colNumberOddRow = width/(2*radius);
    	int coNumberEvenRow = (width-radius)/(2*radius);
    	return oddRowNumber*colNumberOddRow+evenRowNumber*coNumberEvenRow;
    	
    }
}
