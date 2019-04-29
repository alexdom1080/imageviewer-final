import java.awt.Color;
/**
 * Display the amount of red within each pixel within an image.
 *
 * @author Alexis Dominguez
 * @version 4/29/19
 */
public class RedFilter extends Filter
{

    /**
     * Constructor for objects of class RedFilter
     */
    public RedFilter(String name)
    {
        super(name);
    }

    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                //int avg = (pix.getRed() + pix.getGreen() + pix.getBlue()) / 3;
                image.setPixel(x, y, new Color(pix.getRed(), pix.getRed(),
                pix.getRed()));
            }
        }
    }
}
