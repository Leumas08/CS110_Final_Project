import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tester extends Substructure{
	public static void main(String[] arg) {
		JFrame inputname= new JFrame();
		JFrame outputFrame= new JFrame();
		
		String filename= (String)JOptionPane.showInputDialog(
	            inputname,
	            "Please enter the filename of the picture you/n wish to manipulate (include .png(jpg) etc..",
	            "Input File Name",
	            JOptionPane.PLAIN_MESSAGE);
		//Asks for output name
		String outputname= (String)JOptionPane.showInputDialog(
	            outputFrame,
	            "Please Enter your desired output File name (do not include a .png(jpg ect)",
	            "Output File Name",
	            JOptionPane.PLAIN_MESSAGE)+".png";
		frame.setTitle(outputname);
		base=image.loadImage(filename);
		Color[][] logo=image.loadImage("LOGO.PNG");
		BufferedImage logoI=ImageUtils.convertToBufferedFrom2D(logo);
		ImageIcon IconLogo=new ImageIcon(
		        logoI.getScaledInstance(2, 2, Image.SCALE_SMOOTH));
		frame.setIconImage(logoI);
		Substructure.main(filename);
		manipulate=image.cloneArray(base);
		
	while(save==false) {
		if((Paint==false)) {
		 manipulate=ImageUtils.cloneArray(base);
			if(gray==true) {
				manipulate=edit.Grayscale(manipulate);
			}if(cyan==true) {
				manipulate=edit.Cyanotype(manipulate);
			}if(GreenFilter==true) {
				manipulate=edit.Green(manipulate);
			}if(sephia==true) {
				manipulate=edit.Sephia(manipulate);
			}if(Rotate90==true) {
				manipulate=edit.Rotate90Right(manipulate);
			}if(Rotate180==true) {
				manipulate=edit.Rotate180(manipulate);
			}if(Rotate270==true) {
				manipulate=edit.Rotate270Right(manipulate);
			}}if(crop==false) {
			BufferedImage output=ImageUtils.convertToBufferedFrom2D(manipulate);
			label.setIcon(new ImageIcon(output));
			frame.setSize(frame.getPreferredSize());
			}if(repaint==true) {
				frame.setVisible(false);
				base=Recolor.ReplaceColor(manipulate);
				frame.setVisible(true);
				repaint=false;
			}
			}try {
				// retrieve image
				File outputfile = new File(outputname);
				BufferedImage output=ImageUtils.convertToBufferedFrom2D(manipulate);
				ImageIO.write(output, "png", outputfile);
				JFrame saved=frames.Saved();
				saved.setVisible(true);
			} catch (Exception b) {
				System.out.println("Could not save the image, please ensure the filepath"
	    				+ " was properly specified.");
	    		System.exit(1);
			}
		}
	}