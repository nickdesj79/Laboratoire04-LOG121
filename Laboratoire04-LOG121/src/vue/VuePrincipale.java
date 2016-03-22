package vue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class VuePrincipale extends Vue{

	public VuePrincipale(){
		this.setBackground(Color.BLACK);
		Dimension dimension = new Dimension(800,400);
		this.setPreferredSize(dimension);
	}
}
