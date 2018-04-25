import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class Test2 extends JFrame implements ActionListener, MouseListener, MouseMotionListener{
	int x1=0;
	int y1=0;
	static Color[][] original;
	static Color[][] manipulate;
	static boolean gray=false;
	static boolean cyan=false;
	static boolean green=false;
	static boolean sephia=false;
	static boolean Rotate90=false;
	static boolean Rotate180=false;
	static boolean Rotate270=false;
	static boolean Paint=false;
	static boolean save=false;
	static JLabel label=new JLabel();
	static JFrame frame= new JFrame();
	static Test2 test2=new Test2();
	static ImageUtils image=new ImageUtils();
	static Editor edit=new Editor();
	static Recolor mose=new Recolor();
	static Frames frames=new Frames();
	static Icons icons=new Icons();
	public void display() {
		JMenuBar jMenuBar = new JMenuBar();
		JMenu ImageOptions = new JMenu("Options");
		  		JMenuItem ItemGray = new JCheckBoxMenuItem("Gray");
		  			ItemGray.addActionListener(this);
		  				ImageOptions.add(ItemGray);
		  		JMenuItem ItemCyan = new JCheckBoxMenuItem("Cyanotype");
		  			ItemCyan.addActionListener(this);
		  				ImageOptions.add(ItemCyan);
		  		JMenuItem ItemSephia = new JCheckBoxMenuItem("Sephia");
		  			ItemSephia.addActionListener(this);
		  				ImageOptions.add(ItemSephia);
		  		JMenuItem ItemGreen = new JCheckBoxMenuItem("Green");
		  			ItemGreen.addActionListener(this);
		  				ImageOptions.add(ItemGreen);
		  		JMenuItem Item90 = new JCheckBoxMenuItem("Rotate90");
			  		Item90.addActionListener(this);
			  			ImageOptions.add(Item90);
			  	JMenuItem Item180 = new JCheckBoxMenuItem("Rotate180");
			  		Item180.addActionListener(this);
			  			ImageOptions.add(Item180);
			  	JMenuItem Item270 = new JCheckBoxMenuItem("Rotate270");
			  		Item270.addActionListener(this);
			  			ImageOptions.add(Item270);
		JMenu PaintMenu= new JMenu("Paint");
			  	JMenuItem Paint = new JCheckBoxMenuItem("Paint");
			  		Paint.addActionListener(this);
			  			PaintMenu.add(Paint);
			
		JMenu SaveMenu = new JMenu("Save");
				JMenuItem save= new JMenuItem("Save Image");
					save.addActionListener(this);
  						SaveMenu.add(save);
		  jMenuBar.add(SaveMenu);
		  jMenuBar.add(PaintMenu);
		  jMenuBar.add(ImageOptions);
		  frame.setJMenuBar(jMenuBar);
		}
	
	public void actionPerformed(ActionEvent e) {
	      JMenuItem source = (JMenuItem)(e.getSource());
	      String item=source.getText();
	      System.out.println(item);
	      	if(item.equals("Gray")){
	      		gray = !gray;
	      	}if(item.equals("Cyanotype")){
	      		cyan = !cyan;
	      	}if(item.equals("Sephia")){
	      		sephia = !sephia;
	      	}if(item.equals("Green")){
	      		green = !green;
	      	}if(item.equals("Rotate90")){
	      		Rotate90 = !Rotate90;
	      	}if(item.equals("Rotate180")){
	      		Rotate180 = !Rotate180;
	      	}if(item.equals("Rotate270")){
	      		Rotate270 = !Rotate270;
	      	}if(item.equals("Save Image")) {
	      		save=!save;
	      	}if(item.equals("Paint")) {
	      		Paint=!Paint;
	      		System.out.println(Paint);
	      	}
	  }
	public void main(String filename) {
		original = image.loadImage(filename);
		BufferedImage output=ImageUtils.convertToBufferedFrom2D(original);
		ImageIcon icon=new ImageIcon(
		        output.getScaledInstance(8, 8, Image.SCALE_SMOOTH));
	    label=new JLabel(new ImageIcon(output));
	    test2.display();
		frame.pack();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(label);
	    frame.addMouseListener(this);
	    frame.addMouseMotionListener(this);
	    frame.setSize(frame.getPreferredSize());
	    frame.setVisible(true);
		}
	public void mouseDragged(MouseEvent e) {
		
		x1 = e.getX()-8;
	    y1 = e.getY()-55;
	    if(Paint==true) {
	    manipulate[x1][y1]=Color.black;
	    }
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
