package main.java.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Service
public abstract class ColorFrame extends JFrame {


    public ColorFrame() {
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace(){
        Random random=new Random();
        setLocation(random.nextInt(1980), random.nextInt(1020));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
