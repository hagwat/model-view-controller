package packman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private Model model;
	private ViewFrame view;

	public static void main(String[] args) {
		new Controller();
	}

	public Controller() {

		model = new Model();
		view = new ViewFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("gotitt");
	}

}
