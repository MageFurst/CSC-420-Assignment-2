package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

public class Main {

    public static ArrayList<String> colorstrings = new ArrayList<String>(){
        {
            add("Red");
            add("Blue");
            add("Green");
            add("Orange");
        }
    };

    public static String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setLayout(new BorderLayout());

        JSlider horizontal = new JSlider();
        horizontal.setMinimum(25);
        horizontal.setMaximum(frame.getWidth() - 100);
        JSlider vertical = new JSlider(JSlider.VERTICAL);
        vertical.setInverted(true);
        vertical.setMinimum(25);
        vertical.setMaximum(frame.getHeight() - 125);

        Box buttonsholder = Box.createHorizontalBox();
        Box bottompiece = Box.createVerticalBox();
        ButtonGroup colors = new ButtonGroup();

        for(String color : colorstrings){
            JRadioButton colorselection = new JRadioButton(color);
            colors.add(colorselection);
            buttonsholder.add(colorselection);
        }

        Button showcircle = new Button("Show");
        showcircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle c = new Circle(horizontal.getValue(),vertical.getValue(),getSelectedButtonText(colors));
                if(showcircle.getLabel() == "Show"){
                    showcircle.setLabel("Hide");
                    frame.add(c);
                    frame.revalidate();
                }
                else {
                    showcircle.setLabel("Show");
                    frame.add(new Circle(c.x,c.y,""));
                    frame.revalidate();
                }
            }
        });
        buttonsholder.add(showcircle);

        bottompiece.add(horizontal);
        bottompiece.add(buttonsholder);

        frame.add(bottompiece, BorderLayout.SOUTH);
        frame.add(vertical, BorderLayout.WEST);

        horizontal.setVisible(true);
        frame.setVisible(true);
    }

}
