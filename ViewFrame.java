package packman;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class ViewFrame extends JFrame{

	ViewCanvas canvas;

	public ViewFrame() {
		super("View");
		canvas = new ViewCanvas();
		setLayout(new BorderLayout());
		add(canvas, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setVisible(true);
	}




}