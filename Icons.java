import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Icons extends Substructure{

	public static ImageIcon Green16() {
		Color[][] green=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					green[i][j]=greenpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(green);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Red16() {
		Color[][] red=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					red[i][j]=redpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(red);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Blue16() {
		Color[][] blue=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					blue[i][j]=bluepen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(blue);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Purple16() {
		Color[][] purple=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					purple[i][j]=purplepen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(purple);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Yellow16() {
		Color[][] yellow=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					yellow[i][j]=yellowpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(yellow);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Orange16() {
		Color[][] orange=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					orange[i][j]=orangepen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(orange);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Black16() {
		Color[][] black=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					black[i][j]=blackpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(black);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Black49() {
		Color[][] black=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					black[i][j]=blackpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(black);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Black25() {
		Color[][] black=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					black[i][j]=blackpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(black);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Black9() {
		Color[][] black=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					black[i][j]=blackpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(black);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(9, 9, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Black1() {
		Color[][] black=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					black[i][j]=blackpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(black);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(1, 1, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon White16() {
		Color[][] white=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					white[i][j]=whitepen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(white);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
	public static ImageIcon Pink16() {
		Color[][] pink=new Color[100][100];
			for (int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					pink[i][j]=pinkpen;
				}
			}
			BufferedImage buffered= ImageUtils.convertToBufferedFrom2D(pink);
			ImageIcon icon=new ImageIcon(
			        buffered.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			return icon;
	}
}
