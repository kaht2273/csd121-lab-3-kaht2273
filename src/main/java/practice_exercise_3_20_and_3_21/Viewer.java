package practice_exercise_3_20_and_3_21;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class Viewer
{


     public static void main(String[]args)
     {
         JFrame frame = new JFrame();

         frame.setSize(1000, 1000);
        frame.setTitle("Three Houses");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         MainComponent component = new MainComponent();
         frame.add(component);

         frame.setVisible(true);
     }


    
}
