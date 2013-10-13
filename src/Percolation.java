/**
 * Created with IntelliJ IDEA.
 * User: SCV
 * Date: 13.10.13
 * Time: 21:58
 * To change this template use File | Settings | File Templates.
 */
public class Percolation {
    int inputSize;
    int connections[];
    boolean open[];
    public Percolation(int N)              // create N-by-N grid, with all sites blocked
    {
            inputSize = N;
            connections = new int[inputSize*inputSize];
            open = new boolean[inputSize*inputSize];

            for(int i = 0; i < inputSize*inputSize;i++)
            {
                connections[i]=i;
                open[i]=false;
            }
    }
    public void open(int i, int j)         // open site (row i, column j) if it is not already
    {

    }
    public boolean isOpen(int i, int j)    // is site (row i, column j) open?
    {
        return open[i+inputSize*j];
    }
    public boolean isFull(int i, int j)    // is site (row i, column j) full?
    {
        return open[i+inputSize*j];
    }
    public boolean percolates()
    {
        return false;
    }
}
