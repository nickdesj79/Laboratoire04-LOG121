import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import controleur.Menu;
import vue.Vue;
import vue.VuePrincipale;
import vue.VueZoom;

public class FenetrePrincipale extends JFrame {

	Menu menu = new Menu();
	Vue vuePrincipale = new VuePrincipale();
	Vue vueZoom1 = new VueZoom();
	Vue vueZoom2 = new VueZoom();

	public FenetrePrincipale() {

		GridBagConstraints contrainte = new GridBagConstraints();
		
		this.setLayout(new GridBagLayout());
		
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.gridx = 0;
		contrainte.gridy = 0;
		contrainte.weightx = 0.5;
		contrainte.ipady = 20;
		contrainte.gridwidth = 2;
		contrainte.anchor = GridBagConstraints.FIRST_LINE_START;
		this.add(menu, contrainte);

		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.gridx = 0;
		contrainte.gridy = 1;
		contrainte.weightx = 0.5;
		contrainte.weighty = 0.5;
		contrainte.gridwidth = 2;
		this.add(vuePrincipale, contrainte);
		
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.gridx = 0;
		contrainte.gridy = 2;
		contrainte.weightx = 0.5;
		contrainte.weighty = 0.5;
		contrainte.gridwidth = 1;
		this.add(vueZoom1, contrainte);
		
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.gridx = 1;
		contrainte.gridy = 2;
		contrainte.weightx = 0.5;
		contrainte.weighty = 0.5;
		contrainte.gridwidth = 1;
		this.add(vueZoom2, contrainte);
		
		this.setBounds(100, 100, 800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		FenetrePrincipale fenetre = new FenetrePrincipale();
	}
}
