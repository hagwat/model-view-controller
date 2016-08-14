package packman;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ViewCanvas extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(600, 600);

	}
}
