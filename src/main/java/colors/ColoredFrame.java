package colors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class ColoredFrame extends JFrame {

    @Autowired
    private Color color;

    public abstract Color getColor();

    @PostConstruct
    public void init(){
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public String toString() {
        return "ColoredFrame{" +
                "color=" + color +
                '}';
    }

    public void showOnRandomPlace (){
        Random random = new Random();
        setLocation(random.nextInt(800), random.nextInt(500));
        getContentPane().setBackground(getColor());
        this.repaint();
        this.validate();
    }
}
