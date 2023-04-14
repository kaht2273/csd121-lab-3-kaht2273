package practice_exercise_3_20_and_3_21;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class House extends JComponent
{
//"Write a program that draws a picture of a house.
// It could be as simple as the accompanying figure, or if you like, more elaborate (3-D, skyscraper, marble columns in the entryway, whatever).
// Implement a class House and supply a method draw(Graphics2D g2) that draws the house."
    // TODO: add the necessary instance variables, constructor, and method 
    //          to model and draw ONE house
    private int houseX;
    private int houseY;
    private int houseScale;
    private int houseWidth = 65;
    private int houseHeight = 100;



    public House(int x, int y, int z)
    {
        houseX = x;
        houseY = y;
        houseScale = z;
    }

    public void draw(Graphics2D g2)
    {

        Rectangle body = new Rectangle(houseX, houseY, houseWidth * houseScale, houseHeight * houseScale);
        Rectangle door = new Rectangle(houseX + (houseWidth * houseScale) / 2 - (15 * houseScale), houseY + (houseHeight * houseScale) - (30 * houseScale), 15 * houseScale, 30 * houseScale);
        Rectangle window = new Rectangle(houseX + (houseWidth * houseScale) / 3 - (15 * houseScale), houseY + (houseHeight * houseScale) / 2 - (15 * houseScale), 15 * houseScale, 15 * houseScale);
        Rectangle window2 = new Rectangle(houseX + (houseWidth * houseScale) / 3 * 2 - (15 * houseScale), houseY + (houseHeight * houseScale) / 2 - (15 * houseScale), 15 * houseScale, 15 * houseScale);
        Rectangle garage = new Rectangle(houseX + (houseWidth * houseScale), houseY + (houseHeight * houseScale) / 2, (houseWidth * houseScale), (houseHeight * houseScale) / 2);
        Rectangle garagedoor = new Rectangle(houseX + (houseWidth * houseScale) + (10 * houseScale), houseY + (houseHeight * houseScale) - (30 * houseScale), (houseWidth * houseScale) - (20 * houseScale), 30 * houseScale);
        //Ellipse2D.Double frontpad = new Ellipse2D.Double(houseX + 10, houseY + 110, 65 * houseScale, 5 * houseScale);
        //Ellipse2D.Double doorhandle = new Ellipse2D.Double(houseX + 50, houseY +90, 5 * houseScale, 5 * houseScale);
        //Ellipse2D.Double topwindow = new Ellipse2D.Double(houseX + 40, houseY +20, 15 * houseScale, 15 * houseScale);
/*
        //roof of house
        g2.drawLine(xLeft + 9,yTop + 20,xLeft + 40,yTop + 5);
        g2.drawLine(xLeft + 76,yTop + 20,xLeft + 40,yTop + 5);
        //roof of garage
        g2.drawLine(xLeft + 74,yTop + 70,xLeft + 110,yTop + 50);
        g2.drawLine(xLeft + 147,yTop + 70,xLeft + 110,yTop + 50);
        // cool stuff
        g2.drawLine(xLeft + 85,yTop + 105,xLeft + 135,yTop + 105);
        g2.drawLine(xLeft + 108,yTop + 106,xLeft + 113,yTop + 106 );
*/
        g2.draw(body);
        g2.draw(door);
        g2.draw(window);
        g2.draw(window2);
        g2.draw(garage);
        g2.draw(garagedoor);
        //g2.draw(frontpad);
        //g2.draw(topwindow);
        //g2.draw(doorhandle);

    }


}
