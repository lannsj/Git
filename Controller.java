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
		JSlider LSlider = new JSlider(SwingConstants.VERTICAL,1,10,3);
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
	

//	public void stateChanged (ChangeEvent e){
//
//		JSlider slider = (JSlider) e.getSource();
//
//		int x = slider.getOrientation();
//		
//		System.out.println(x);
//		
//		if(x == 1);{
//			
//			System.out.println("blub");
//		}
//		if(x==0);{
//
//			System.out.println("apa");
//			
//			}
//		
//		
//		}

    public void stateChanged(ChangeEvent e){
        if(e.getSource()==LSlider);{
                this.L = LSlider.getValue();
                System.out.println("blub");
        }
        if(e.getSource()==dSlider);{
                int delta = dSlider.getValue();
                MyTimer.stop();
                MyTimer = new Timer(delta, this);
                
                }
        }
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		//System.out.println(ae.getSource());
	}
	
}



