import java.awt.BorderLayout;

import javax.swing.*;



public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;


	public MyFrame() {
		int antal = 700;
	    Model MyModel = new Model(antal);
	    View MyView = new View(MyModel);
	    Controller MyController = new Controller(MyModel, MyView);

	    int width = (int) (antal);
	    int height = (int) (antal);
		this.pack();
	    this.setVisible(true);
		this.setSize( width, height );
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ganska ful");
		this.add(MyController, BorderLayout.PAGE_START);
		this.add(MyView, BorderLayout.CENTER);
	}
	

public static void main(String[] args) {
	new MyFrame();
	}

}



