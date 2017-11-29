import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;

public class ImageCollection extends JPanel {
	File imageFile;
	ArrayList<BufferedImage> imageArray = new ArrayList<BufferedImage>();

	public static void main(String[] args) {
		JFrame frame = new JFrame("imageCollection");
		ImageCollection ic = new ImageCollection();

		frame.setSize(960, 530);
		frame.add(ic);
		frame.setVisible(true);
	}

	public void paintComponent (Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			try {
				for (int i = 2; i <= 13; i++) {
					imageFile = new File("./cards/" + i + "D.jpg");
					imageArray.add(ImageIO.read(imageFile));
				}
			} catch (Exception e) {
				System.out.println("oops");
			}
			
			this.setBackground(Color.BLACK);
			g2d.setColor(new Color(255,0,0));
			
			for(int i =2; i <=7; i++) {
				g2d.drawImage(imageArray.get(i-2), null, (10 + (i-2)*150),20);
			}
			for(int i =8; i <=13; i++) {
				g2d.drawImage(imageArray.get(i-2), null, (10 + (i-8)*150),260);
			}
	}
}
