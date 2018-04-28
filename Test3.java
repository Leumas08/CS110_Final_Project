import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 extends Test2{
	public static void main(String[] arg) {
		Test2 test2=new Test2();
		ImageUtils image=new ImageUtils();
		Editor edit=new Editor();
		String filename="Colors.png";
		original=image.loadImage(filename);
		test2.main(filename);
		manipulate=image.cloneArray(original);
		
	while(save==false) {
		if((Paint==false)) {
		 manipulate=image.cloneArray(original);
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
			}
			}
		}
	}