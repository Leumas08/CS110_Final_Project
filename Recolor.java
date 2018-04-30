import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Recolor extends JFrame implements MouseListener, MouseMotionListener
{
  static int red;
  static int blue;
  static int green;
  static int x1;
  static int y1;
  public Recolor()
  {
    addMouseListener(this);
    addMouseMotionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void mousePressed(MouseEvent e)
  {
    x1 = e.getX();
    y1 = e.getY();
  }
  public static void Locator(Color [][] original){
	BufferedImage im=ImageUtils.convertToBufferedFrom2D(original);
    Recolor picture=new Recolor();
    picture.setContentPane(new JLabel(new ImageIcon(im)));
    picture.setSize(picture.getPreferredSize());
    picture.pack();
    while(x1==0) {
    picture.setVisible(true);
    }
    picture.setVisible(false);
    x1=x1-8;
    y1=y1-52;
    System.out.println(x1+"  "+y1);
    red=original[x1][y1].getRed();
    blue=original[x1][y1].getBlue();
    green=original[x1][y1].getGreen();
  }
  public static Color[][] ReplaceColor(Color[][] original) {
	    Locator(original);
	    ImageUtils image=new ImageUtils();
	    Color[][] colors=image.loadImage("Colors.png");
		BufferedImage imag=ImageUtils.convertToBufferedFrom2D(colors);
		x1=0;
		y1=0;
	  	int height=imag.getHeight();
		int length=imag.getWidth();
	    Recolor colorful=new Recolor();
	    colorful.setContentPane(new JLabel(new ImageIcon(imag)));
	    colorful.setSize(colorful.getPreferredSize());
	    colorful.pack();
	    while(x1==0) {
	    	colorful.setVisible(true);}
	    System.out.println(x1+"   "+y1);
	    x1=x1-8;
        y1=y1-32;
	    	if(height<=y1) {
	        	y1=colors[0].length-1;
	        }else if(length<=x1) {
	        	x1=colors.length-1;
	        }
	    colorful.setVisible(false);
	    int red1=colors[x1][y1].getRed();
	    int blue1=colors[x1][y1].getBlue();
	    int green1=colors[x1][y1].getGreen();
	    for (int i=0; i<original.length; i++) {
	    	for(int j=0; j<original[0].length; j++) {
	    		boolean redless=((red)>=original[i][j].getRed()-2);
	    		boolean redmore=((red)<=original[i][j].getRed()+2);
	    		boolean blueless=((blue)>=original[i][j].getBlue()-2);
	    		boolean bluemore=((blue)<=original[i][j].getBlue()+2);
	    		boolean greenless=((green)>=original[i][j].getGreen()-2);
	    		boolean greenmore=((green)<=original[i][j].getGreen()+2);
	    		if((redless&&redmore)||(blueless&&bluemore)||(greenless&&greenmore)) {
	    				original[i][j]=new Color(red1,green1,blue1);
	    				}
	      }
	    }
	    x1=0;
	    return original;
  }
//Overrides for MouseListener
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
	@Override
	public void mouseDragged(MouseEvent e) {}
}