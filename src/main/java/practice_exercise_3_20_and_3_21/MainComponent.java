package practice_exercise_3_20_and_3_21;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class MainComponent extends JComponent {
//"Extend Exercise •• Graphics E3.20 by supplying a House constructor for specifying the position and size.
// Then populate your screen with a few houses of different sizes."


        // Add at least three houses of different positions and sizes
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;


            House House1 = new House(10, 10);
            int x = getWidth() -500;
            int y = getHeight() -130;
            House House3 = new House(x,y);


            House House2 = new House(x, y);



            House1.draw(g2);
            House2.draw(g2);
            House3.draw(g2);
        }

}
