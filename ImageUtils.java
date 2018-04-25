import java.awt.Color;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * All necessary utilities for displaying images, and converting between
 * 2D arrays and BufferedImages.
 * 
 * 
 * @author Benjamin Smith
 * @coauthor Samuel Price
 * @since 2018-03-18
 */
public class ImageUtils{

  public Color[][] loadImage(String filepath) {
    // Load in the image.
    BufferedImage buffImg = loadBufferedImage(filepath);
    // Convert that image to the 2D array of colors and return it.
    Color[][] colorImg = convertTo2DFromBuffered(buffImg);
    return colorImg;
  }
  public static Color[][] cloneArray(Color[][] orig) {
    // Create array that is the copy
    Color[][] copy = new Color[orig.length][orig[0].length];
    // Go through each value copying it over.
    for (int i = 0; i < orig.length; i++) {
      for (int j = 0; j < orig[i].length; j++) {
        copy[i][j] = orig[i][j];
      }
    }
    // Return the copy.
    return copy;
  }

  private static BufferedImage loadBufferedImage(String filepath) {
    // A BufferedImage initialization.
    BufferedImage img = null;

    // Try to read an image from the specified path.
    try {
      // Read the (image) File the path directs to.
      img = ImageIO.read(new File(filepath));
    	} catch (IOException e) {
    		System.out.println("Could not load the image, please ensure the filepath"
    				+ " was properly specified.");
    		e.printStackTrace();
    		System.exit(1);
    }
    // Return the BufferedImage. If nothing was read, img contains NULL.
    return img;
  }
  /**
   * Converts a 2D array of Colors into a BufferedImage to display
   * @param img the 2d array of Colors
   * @return the BufferedImage capable of being displayed
   */
  public static BufferedImage convertToBufferedFrom2D(Color[][] img) {
    // Create new BufferedImage of specified width and height
    int width = img.length;
    int height = img[0].length;
    BufferedImage bufImg = new BufferedImage(width, height, 1);

    // Set the RGB value of each pixel in the BufferedImage
    for (int x = 0; x < width; x++) {
      for(int y = 0; y < height; y++) {
        bufImg.setRGB(x,  y, img[x][y].getRGB());
      }
    }
    // Return the BufferedImage
    return bufImg;
  }
  private static Color[][] convertTo2DFromBuffered(BufferedImage img) {
    // Get width and height to make new 2d array
    int width = img.getWidth();
    int height = img.getHeight();
    Color[][] result = new Color[width][height];

    // Iterate through the array, adding new Colors from the intRGB values.
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        // Get the integer RGB, and separate it into individual components.
        // (BufferedImage saves RGB as a single integer value).
        int intRGB = img.getRGB(col, row);
        int red = (intRGB >> 16)&255;
        int green = (intRGB >> 8)&255;
        int blue = intRGB&255;
        // Set the pixel to the Color.
        result[col][row] = new Color(red, green, blue);
      }
    }
    // Return array
    return result;
  }
}