import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class View extends JPanel{
	
	private static final long serialVersionUID = 1L;
	Model MyModel;
	Graphics2D g1;
	
	
	public View() {							//konstruktor utan argument
    	System.out.println("You have not entered a model to view.");
	}
	
	public View(Model MyModelIn) {			//konstruktor med argument			
		MyModel = MyModelIn;

	}

	public void paint(Graphics g){
		super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;
        g1.setColor(Color.blue);
        int antal = MyModel.ParticleArray.length;
        for (int i=0; i<antal ; i++){
			g1.fill(new Rectangle2D.Double(0.1*antal + MyModel.ParticleArray[i].x*(antal)*0.8, 0.1*antal + MyModel.ParticleArray[i].y*antal*0.76,2,1));
		}
 }
}

