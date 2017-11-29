import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;

public class ImageCollectionv2 extends JPanel {
	File imageFile;
	String name;
	String key;
	BufferedImage bi;

	HashMap<String, BufferedImage> imageArray = new HashMap<String, BufferedImage>();

	public static void main(String[] args) {
		JFrame frame = new JFrame("ImageCollection");
		ImageCollection ic = new ImageCollection();

		frame.setSize(960, 530);
		frame.add(ic);
		frame.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		try {
			for (int i = 2; i <= 13; i++) {
				name = "./cards/" + i + "D.jpg";
				imageFile = new File(name);
				imageArray.put(name, ImageIO.read(imageFile)); /*
																 * puts name and image in the hashmap
																 */
			}
		} catch (Exception e) {
			System.out.println("Oppssss a DDAIAIAIIAISDIAIFSDF!!!!!!");
		}

		this.setBackground(Color.BLACK);
		g2d.setColor(new Color(255, 0, 0));

		java.util.Set<String> allKeySet = imageArray.keySet();
		Iterator<String> keyIterator = allKeySet.iterator();

		int x = -140;
		int y1 = 20;
		int y2 = 260;

		while (keyIterator.hasNext()) {
			key = keyIterator.next();
			bi = imageArray.get(key);
			x = x + 150;
			g2d.drawImage(bi, null, x, y1);
			// g2d.drawImage(bi, null, x, y2);

		}

		// At this point we have run through all the cards and put them in our
		// Data structure but we have not put them in our Jpanel yet.

		for (int i = 2; i <= 7; i++) {
			// The X position will be changing, but not the Y position
			g2d.drawImage(imageArray.get(i - 2), null, (10 + (1 - 2) * 150), 20);

		}

		for (int i = 8; i <= 13; i++) {
			// The X position will be changing, but not the Y position
			g2d.drawImage(imageArray.get(i - 2), null, (10 + (1 - 8) * 150), 260);

		}
	}
}