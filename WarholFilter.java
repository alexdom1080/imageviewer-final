import java.awt.Color;
/**
 * Duplicates the original image 4 times in a smaller fashion and applies
 * three filters to the other three images.
 *
 * @author Alexis Dominguez
 * @version 4/29/19
 */
public class WarholFilter extends Filter
{
    // instance variables - replace the example below with your own
    private OFImage original;
    private int width;
    private int height;

    /**
     * Constructor for objects of class WarholFilter
     * @param name - takes in the string name of the filter
     */
    public WarholFilter(String name)
    {
        super(name);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void apply(OFImage image)
    {
        original = new OFImage(image);
        width = original.getWidth();
        height = original.getHeight();
    }
}
