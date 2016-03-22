package controleur;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Actions.ActionQuitter;

public class Menu extends JMenuBar {

	public Menu() {
		this.setVisible(true);
		JMenuItem[] tabItems = new JMenuItem[] {new JMenuItem("Quitter")};
		ActionListener[] tabActions = new ActionListener[] {new ActionQuitter()};
		ajouterMenus("Fichier", tabItems, tabActions);
	}

	public void ajouterMenus(String nom, JMenuItem[] tabItems, ActionListener[] tabActions) {
		JMenu menu = new JMenu("Fichier");

		for (int i = 0; i < tabItems.length; i++) {
			menu.add(tabItems[i]);
			menu.getItem(i).addActionListener(tabActions[i]);
		}
		
		this.add(menu);
	}
}
