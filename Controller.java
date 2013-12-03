import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;





public class Controller extends JPanel implements ChangeListener, ActionListener{
	
	

	private static final long serialVersionUID = 1L;
	JSlider LSlider;
	JSlider dSlider;
	Timer MyTimer;
	public Model ModelIn;
	public View ViewIn;
	
	
	Controller(Model ModelIn, View ViewIn) {
		JSlider LSlider = new JSlider(SwingConstants.HORIZONTAL,1,10,3);
		JSlider dSlider = new JSlider(SwingConstants.HORIZONTAL,1,10,3);
		add(dSlider);
		add(LSlider);
		
		LSlider.addChangeListener(this);
		dSlider.addChangeListener(this);

		
		int delta =1;
		Timer MyTimer = new Timer(delta, this);
		MyTimer.setInitialDelay(1);
		MyTimer.addActionListener(this);
		
	}
	

	public void stateChanged (ChangeEvent e){

		ModelIn.setL(LSlider.getValue());

		}


	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
	}
	
}



