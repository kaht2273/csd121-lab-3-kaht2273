package practice_exercise_3_20_and_3_21;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class House extends JComponent
{
//"Write a program that draws a picture of a house.
// It could be as simple as the accompanying figure, or if you like, more elaborate (3-D, skyscraper, marble columns in the entryway, whatever).
// Implement a class House and supply a method draw(Graphics2D g2) that draws the house."
    // TODO: add the necessary instance variables, constructor, and method 
    //          to model and draw ONE house
    private int xLeft;
    private int yTop;



    public House(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 65, 100);
        Rectangle door = new Rectangle(xLeft + 50, yTop + 80, 15, 30);
        Rectangle window = new Rectangle(xLeft + 10, yTop + 45, 15, 30);
        Rectangle garage = new Rectangle(xLeft + 65, yTop + 60, 70, 50);
        Rectangle garagedoor = new Rectangle(xLeft + 75, yTop + 60, 50, 50);
        Ellipse2D.Double frontpad = new Ellipse2D.Double(xLeft + 10, yTop + 110, 65, 5);
        Ellipse2D.Double doorhandle = new Ellipse2D.Double(xLeft + 50, yTop +90, 5, 5);
        Ellipse2D.Double topwindow = new Ellipse2D.Double(xLeft + 40, yTop +20, 15, 15);

        //roof of house
       g2.drawLine(9,20,40,5);
       g2.drawLine(76,20,40,5);
        //roof of garage
        g2.drawLine(74,70,110,50);
        g2.drawLine(147,70,110,50);
        // cool stuff
        g2.drawLine(85,105,135,105);
        g2.drawLine(108,106,113,106 );






        g2.draw(body);
        g2.draw(door);
        g2.draw(window);
        g2.draw(garage);
        g2.draw(garagedoor);
        g2.draw(frontpad);
        g2.draw(topwindow);
        g2.draw(doorhandle);

    }


}
