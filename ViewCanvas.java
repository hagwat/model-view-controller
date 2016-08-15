package packman;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ViewCanvas extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 401385718012180046L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(600, 400);
	}
}
