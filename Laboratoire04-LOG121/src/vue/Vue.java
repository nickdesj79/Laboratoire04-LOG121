package vue;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controleur.Loader;

public class Vue extends JPanel {

	public Vue() {
		Border compound;
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();

		compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
		
		this.setBorder(compound);
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.drawImage(Loader.getInstance().getImage(), 0, 0,this.getWidth(),this.getHeight(), null);
	}
}
