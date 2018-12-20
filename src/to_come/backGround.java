package to_come;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class backGround implements IShape{
	
	BufferedImage bi;
	String color;
	public backGround(String color) {
		this.color=color;
		try {
			 bi =ImageIO.read(getClass().getResourceAsStream("/"+color+"background.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {

		return bi;
	}

	@Override
	public String getColor() {
		return color;
	}

}
