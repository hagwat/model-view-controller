package packman;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controller implements  MouseListener {

	private Model model;
	private ViewFrame view;
	
	public static void main(String[] args) {
		new Controller();
	}
	
	public Controller(){

		model = new Model();
		view = new ViewFrame();
		view.addMouseListener(this);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("gotitt");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	

	
	
	
}
