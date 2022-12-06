package main;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    int x,y;
    String color;

    public Circle(int x,int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(color == "Green"){
            g.setColor(Color.GREEN);
        }
        else if (color == "Red"){
            g.setColor(Color.RED);
        }
        else if(color == "Blue"){
            g.setColor(Color.BLUE);
        }
        else if(color == "Orange"){
            g.setColor(Color.ORANGE);
        }
        else if (color == ""){
            g.setColor(new Color(238,238,238));
        }
        g.fillOval(x, y, 25, 25);
    }

}
