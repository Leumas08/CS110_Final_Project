import java.awt.Color;
import java.awt.Point;
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

public class Substructure extends JFrame implements ActionListener, MouseListener, MouseMotionListener{
	int xpaint=0;
	int ypaint=0;
	int x=0;
	int y=0;
	int xtop=0;
	int ytop=0;
	int xbottom=0;
	int ybottom=0;
	int paintsize=0;
	Point test=new Point(0, 0);
	static Color[][] original;
	static Color[][] base;
	static Color[][] manipulate;
	static Color[][] temp1;
	
	//Filter Boolean Variables
	static boolean outofbounds=false;
	static boolean gray=false;
	static boolean cyan=false;
	static boolean GreenFilter=false;
	static boolean sephia=false;
	static boolean Rotate90=false;
	static boolean Rotate180=false;
	static boolean Rotate270=false;
	static boolean Paint=false;
	static boolean save=false;
	static boolean undo=false;
	static boolean crop=false;
	static boolean repaint=false;
	static boolean erase=false;
	static JLabel label=new JLabel();
	static JFrame frame= new JFrame();
	static Substructure Substructure=new Substructure();
	static ImageUtils image=new ImageUtils();
	static Editor edit=new Editor();
	static Recolor replaceColor=new Recolor();
	static Frames frames=new Frames();
	static Icons icons=new Icons();
	static Color blackpen=new Color(0, 0, 0);
	static Color greenpen=new Color(0, 255, 0);
	static Color redpen=new Color(255, 0, 0);
	static Color bluepen=new Color(0, 0, 255);
	static Color purplepen=new Color(128, 0, 128);
	static Color yellowpen=new Color(255, 255, 0);
	static Color orangepen=new Color(255,165,0);
	static Color whitepen=new Color(255, 255, 255);
	static Color pinkpen=new Color(255,192,203);
	static Color penColor=new Color(0, 0, 0);
	
	public void display() {
		JMenuBar jMenuBar = new JMenuBar();
			jMenuBar.setBackground(Color.white);
		//Full Image Filter Option (Menu)
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
			  			
		//Repainting Options	  			
		JMenu PaintMenu= new JMenu("Paint");
			JMenuItem Paint = new JCheckBoxMenuItem("Paint");
			  	Paint.addActionListener(this);
			  		PaintMenu.add(Paint);
			JMenuItem Black= new JMenuItem("Black Pen");
				Black.addActionListener(this);
					Black.setIcon(Icons.Black16());
						PaintMenu.add(Black);
			JMenuItem White= new JMenuItem("White Pen");
				White.addActionListener(this);
					White.setIcon(Icons.White16());
						PaintMenu.add(White);		
			JMenuItem Red= new JMenuItem("Red Pen");
				Red.addActionListener(this);
					Red.setIcon(Icons.Red16());
						PaintMenu.add(Red);
			JMenuItem Pink= new JMenuItem("Pink Pen");
				Pink.addActionListener(this);
					Pink.setIcon(Icons.Pink16());
						PaintMenu.add(Pink);	
			JMenuItem Orange= new JMenuItem("Orange Pen");
				Orange.addActionListener(this);
					Orange.setIcon(Icons.Orange16());
						PaintMenu.add(Orange);		
			JMenuItem Yellow= new JMenuItem("Yellow Pen");
				Yellow.addActionListener(this);
					Yellow.setIcon(Icons.Yellow16());
						PaintMenu.add(Yellow);			
			JMenuItem Blue= new JMenuItem("Blue Pen");
				Blue.addActionListener(this);
					Blue.setIcon(Icons.Blue16());
						PaintMenu.add(Blue);
			JMenuItem Purple= new JMenuItem("Purple Pen");
				Purple.addActionListener(this);
					Purple.setIcon(Icons.Purple16());
						PaintMenu.add(Purple);
			JMenuItem Green= new JMenuItem("Green Pen");
				Green.addActionListener(this);
					Green.setIcon(Icons.Green16());
						PaintMenu.add(Green);  
			JMenuItem Eraser= new JMenuItem("Eraser");
				Eraser.addActionListener(this);
					PaintMenu.add(Eraser);  			
	
						
			JMenuItem Pensize= new JMenuItem("Pen Sizes");
				PaintMenu.add(Pensize);
				JMenuItem Size49=new JMenuItem("49");
					Size49.setIcon(Icons.Black49());
						Size49.addActionListener(this);
							PaintMenu.add(Size49);
				JMenuItem Size25=new JMenuItem("25");
					Size25.setIcon(Icons.Black25());
						Size25.addActionListener(this);
							PaintMenu.add(Size25);
				JMenuItem Size9=new JMenuItem("9");
					Size9.addActionListener(this);
						Size9.setIcon(Icons.Black9());
							PaintMenu.add(Size9);
				JMenuItem Size1=new JMenuItem("1");
					Size1.addActionListener(this);
						Size1.setIcon(Icons.Black1());
							PaintMenu.add(Size1);
				
		JMenu FileMenu = new JMenu("File");
				JMenuItem ReturnOriginal= new JMenuItem("Load Original");
					ReturnOriginal.addActionListener(this);
						FileMenu.add(ReturnOriginal);
				JMenuItem save= new JMenuItem("Save Image");
					save.addActionListener(this);
	  					FileMenu.add(save);
				JMenuItem export= new JMenuItem("Export Image");
					export.addActionListener(this);
  						FileMenu.add(export);
  						
  						
  						
  		JMenu CropMenu= new JMenu("Crop");
  				JMenuItem cropping = new JMenuItem("Crop On");
  					cropping.addActionListener(this);
  						 CropMenu.add(cropping);				
  						
  						 
  						 
  		JMenu Repaint = new JMenu("Recolor");
  				JMenuItem recolor= new JMenuItem("Replace Color");
  					recolor.addActionListener(this);
  		  				Repaint.add(recolor);	
  		
  		  				
  		  				
  		  				
  	  	jMenuBar.add(FileMenu); 
  	  	jMenuBar.add(ImageOptions);
		jMenuBar.add(CropMenu);
		jMenuBar.add(PaintMenu);
		jMenuBar.add(Repaint);
		 
		  frame.setJMenuBar(jMenuBar);
		}
	
	public void actionPerformed(ActionEvent e) {
	      JMenuItem source = (JMenuItem)(e.getSource());
	      String item=source.getText();
	       	 if(item.equals("Gray")){
	      		gray = !gray;
	      	}if(item.equals("Cyanotype")){
	      		cyan = !cyan;
	      	}if(item.equals("Sephia")){
	      		sephia = !sephia;
	      	}if(item.equals("Green")){
	      		GreenFilter = !GreenFilter;
	      	}if(item.equals("Rotate90")){
	      		Rotate90 = !Rotate90;
	      	}if(item.equals("Rotate180")){
	      		Rotate180 = !Rotate180;
	      	}if(item.equals("Rotate270")){
	      		Rotate270 = !Rotate270;
	      	}if(item.equals("Save Image")) {
	      		base=ImageUtils.cloneArray(manipulate);
	      	}if(item.equals("Export Image")) {
	      		save=!save;
	      	}if(item.equals("Paint")) {
	      		Paint=!Paint;
	      	}if(item.equals("Black Pen")){
	      		penColor = blackpen;
	      	}if(item.equals("White Pen")){
	      		penColor = whitepen;
	      	}if(item.equals("Red Pen")){
	      		penColor = redpen;
	      	}if(item.equals("Pink Pen")){
	      		penColor = pinkpen;
	      	}if(item.equals("Orange Pen")){
	      		penColor = orangepen;
	      	}if(item.equals("Yellow Pen")){
	      		penColor  = yellowpen;
	      	}if(item.equals("Blue Pen")){
	      		penColor = bluepen;
	      	}if(item.equals("Purple Pen")) {
	      		penColor =purplepen;
	      	}if(item.equals("Green Pen")) {
	      		penColor =greenpen;
	      	}if(item.equals("Eraser")) {
	      		erase=true;
	      	}if(item.equals("Crop On")) {
	      		crop=true;
	      	}if(item.equals("Replace Color")) {
	      		repaint=true;
	      	}if(item.equals("Load Original")) {
	      		base=ImageUtils.cloneArray(original);
	      	}if(item.equals("49")){
	      		paintsize  = 7;
	      	}if(item.equals("25")){
	      		paintsize = 5;
	      	}if(item.equals("9")) {
	      		paintsize =3;
	      	}if(item.equals("1")) {
	      		paintsize =0;
	      	}
	      	
	  }
	public void main(String filename) {
		base = image.loadImage(filename);
		original=ImageUtils.cloneArray(base);
		BufferedImage output=ImageUtils.convertToBufferedFrom2D(base);
	    label=new JLabel(new ImageIcon(output));
	    Substructure.display();
		frame.pack();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(label);
	    frame.addMouseListener(this);
	    frame.addMouseMotionListener(this);
	    frame.setSize(frame.getPreferredSize());
	    frame.setVisible(true);
	    temp1=ImageUtils.cloneArray(base);
		}
	public void mouseDragged(MouseEvent e) {		
		if(Paint==true) {
			xpaint = e.getX()-8;
			ypaint = e.getY()-32;
			System.out.println(xpaint+"  "+ypaint);
			int length=base.length;
			int height=base[0].length;
			outofbounds=false;
			if((xpaint>length)||(xpaint<0)) {
				outofbounds=true;
			}if((ypaint>height)||(ypaint<0)) {
				outofbounds=true;
			}
			if(outofbounds==false) {
			if(erase==false) {
				for(int a=-paintsize; a<=paintsize; a++) {
					for(int b=-paintsize; b<=paintsize; b++) {
						manipulate[xpaint+a][ypaint+b]=penColor;
					}
				}
			}if(erase==true) {
				for(int a=-paintsize; a<=paintsize; a++) {
					for(int b=-paintsize; b<=paintsize; b++) {
						manipulate[xpaint+a][ypaint+b]=base[xpaint+a][ypaint+b];
					}
				}
			}
		}
	}
}
	public void mousePressed(MouseEvent e) {
		if(crop==true) {
			xtop=e.getX()-8;
			ytop=e.getY()-32;
		}
	}
	public void mouseReleased(MouseEvent e) {
		if(crop==true) {
			JFrame cop=new JFrame();
			cop.setDefaultCloseOperation(EXIT_ON_CLOSE);
			xbottom=e.getX()-8;
			ybottom=e.getY()-32;
			Color[][] cropped=new Color[xbottom-xtop+1][ybottom-ytop+1];
			int row=0;
			for(int i=xtop; i<=xbottom; i++) {
					int column=0;
				for(int j=ytop; j<=ybottom; j++) {
					cropped[row][column]=manipulate[i][j];
					column++;
				}
				row++;
			}
			BufferedImage cropImage=ImageUtils.convertToBufferedFrom2D(cropped);
			label.setIcon(new ImageIcon(cropImage));
			frame.setSize(frame.getPreferredSize());
			base=cropped;
			crop=false;
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mouseMoved(MouseEvent arg0) {}
}
