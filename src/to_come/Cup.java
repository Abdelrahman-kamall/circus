package to_come;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cup implements IShape {

    

	BufferedImage bi;
	public Cup(String color) {
		try {
			 bi =ImageIO.read(getClass().getResourceAsStream("/"+color+"cup.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {
		
		return bi;
	}
}