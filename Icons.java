import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Icons extends Test2{

	public static ImageIcon Green16() {
		Color[][] green=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					green[i][j]=new Color(0, 255, 0);
				}
			}
			BufferedImage buffered= image.convertToBufferedFrom2D(green);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Red16() {
		Color[][] red=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					red[i][j]=new Color(255, 0, 0);
				}
			}
			BufferedImage buffered= image.convertToBufferedFrom2D(red);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Blue16() {
		Color[][] blue=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					blue[i][j]=new Color(255, 0, 0);
				}
			}
			BufferedImage buffered= image.convertToBufferedFrom2D(blue);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Yellow16() {
		Color[][] yellow=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					yellow[i][j]=new Color(255, 255, 0);
				}
			}
			BufferedImage buffered= image.convertToBufferedFrom2D(yellow);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
}
