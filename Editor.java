import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;

public class Editor {
	  public Color[][] Grayscale(Color[][] img){
		  int width = img.length;
		    int height = img[0].length;
		    Color[][] result = new Color[width][height];
		    // Iterate through the array, adding new Colors from the intRGB values.
		    for (int row = 0; row < height; row++) {
		      for (int col = 0; col < width; col++) {
		        // Get the integer RGB, and separate it into individual components.
		        // (BufferedImage saves RGB as a single integer value).
		        int red = img[col][row].getRed();
		        int green = img[col][row].getGreen();
		        int blue =img[col][row].getBlue();
		        int avg=(red+green+blue)/3;
		        int gray= (avg<<16) | (avg<<8) | avg;
		        
		        // Set the pixel to the Color.
		        result[col][row] = new Color(gray);
		       }
		   }
		    return result;
	  }
	  public Color[][] Cyanotype(Color[][] img){
		  int width = img.length;
		    int height = img[0].length;
		    Color[][] result = new Color[width][height];
		    // Iterate through the array, adding new Colors from the intRGB values.
		    for (int row = 0; row < height; row++) {
		      for (int col = 0; col < width; col++) {
		        // Get the integer RGB, and separate it into individual components.
		        // (BufferedImage saves RGB as a single integer value).
		    	int red = img[col][row].getRed();
			    int green = img[col][row].getGreen();
			    int blue =img[col][row].getBlue();
		        int avg=(red+green+blue)/3;
		        result[col][row] = new Color(avg);
		       }
		   }
		    return result;
	  }
	  public Color[][] Sephia(Color[][] img){
		  int width = img.length;
		    int height = img[0].length;
		    Color[][] result = new Color[width][height];
		    for (int row = 0; row < width; row++) {
		      for (int col = 0; col < height; col++) {
		    	int red = img[row][col].getRed();
			    int green = img[row][col].getGreen();
			    int blue =img[row][col].getBlue();
		        double outRed = (red * .393) + (green *.769) + (blue * .189);
		        double outGreen = (red *.349) + (green *.686) + (blue * .168);
		        double outBlue = (red *.272) + (green *.534) + (blue * .131);
		        int outputRed=(int)outRed;
		        int outputGreen=(int)outGreen;
		        int outputBlue=(int)outBlue;
		        if(outputRed>255) {
		        	outputRed=255;
		        }if(outputBlue>255) {
		        	outputBlue=255;
		        }if(outputGreen>255) {
		        	outputGreen=255;
		        }
		        result[row][col] = new Color(outputRed, outputGreen, outputBlue);
		       }
		   }
		    return result;
	  }
	  public Color[][] Cyan(Color[][] img){
		  int width = img.length;
		    int height = img[0].length;
		    Color[][] result = new Color[width][height];
		    for (int row = 0; row < width; row++) {
		      for (int col = 0; col < height; col++) {
		    	int red = img[col][row].getRed();
			    int green = img[col][row].getGreen();
			    int blue =img[col][row].getBlue();
		        double outRed =  (red *.349) + (green *.686) + (blue * .168);
		        double outGreen =(red *.272) + (green *.534) + (blue * .131);
		        double outBlue = (red * .393) + (green *.769) + (blue * .189);
		        int outputRed=(int)outRed;
		        int outputGreen=(int)outGreen;
		        int outputBlue=(int)outBlue;
		        if(outputRed>255) {
		        	outputRed=255;
		        }if(outputBlue>255) {
		        	outputBlue=255;
		        }if(outputGreen>255) {
		        	outputGreen=255;
		        }
		        result[row][col] = new Color(outputRed, outputGreen, outputBlue);
		       }
		   }
		    return result;
	  }
	  public Color[][] Green(Color[][] img){
		  int width = img.length;
		    int height = img[0].length;
		    Color[][] result = new Color[width][height];
		    for (int row = 0; row < height; row++) {
		      for (int col = 0; col < width; col++) {
		        int red = img[col][row].getRed();
			    int green = img[col][row].getGreen();
			    int blue =img[col][row].getBlue();
		        double outRed =  (red *.272) + (green *.534) + (blue * .131);
		        double outGreen =(red * .393) + (green *.769) + (blue * .189);
		        double outBlue = (red *.349) + (green *.686) + (blue * .168);
		        int outputRed=(int)outRed;
		        int outputGreen=(int)outGreen;
		        int outputBlue=(int)outBlue;
		        if(outputRed>255) {
		        	outputRed=255;
		        }if(outputBlue>255) {
		        	outputBlue=255;
		        }if(outputGreen>255) {
		        	outputGreen=255;
		        }
		        result[col][row] = new Color(outputRed, outputGreen, outputBlue);
		       }
		   }
		    return result;
	  }
	  public Color[][] Rotate90Right(Color[][] img){
		  Color[][] rotated= new Color[img[0].length][img.length];
		  int width = rotated.length;
		    int height = rotated[0].length;
		    int i=img.length-1;
		    int j=0;
		    System.out.println(i+"   "+j);
		    Color[][] result = new Color[width][height];
		    // Iterate through the array, adding new Colors from the intRGB values.
		    for (int row = 0; row < height; row++) {
		    	j=0;
		      for (int col = 0; col < width; col++) {
		        result[col][row] =img[i][j];
		        j++;
		       }
		      i--;
		   }
		    return result;
	  }
	  public Color[][] Rotate180(Color[][] img){
		  Color[][] rotated= Rotate90Right(Rotate90Right(img));
		  return rotated;
	  }
	  
	  public Color[][] Rotate270Right(Color[][] img){
		  Color[][] rotated= Rotate180(Rotate90Right(img));
		  return rotated;
	  }
	  public Color[][][] Cube(){
		  Color[][][] cube=new Color[255][255][255];
		  for (int i=0; i<255; i++) {
			  for(int j=0; j<255; j++) {
				  for(int k=0; k<255; k++) {
					  cube[i][j][k]=new Color(i, j, k);
				  }
			  }
		  }
		  return cube;
	  }
}
