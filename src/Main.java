import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//public class Main {
//    public static void main(String[] args) {
//        Frame frame = new Frame("Week3 Lab");
//        frame.setSize(400,300);
//        frame.setLayout(new BorderLayout());
//
//        Label label = new Label("Hello, AWT!");
//        Button button = new Button("Click Me!");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Button Clicked");
//            }
//        });
//
//        frame.add(label, BorderLayout.CENTER);
//        frame.add(button, BorderLayout.SOUTH);
//
//        frame.setVisible(true);
//    }
//}

// exersise 5
public class Main {
    public static void main(String[] args){
        Frame frame = new Frame("Drawing Application");
        frame.setSize(400,300);

        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.blue);
                g.fillRect(50,50,100,100);
            }
        };

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Graphics g = canvas.getGraphics();
                g.setColor(Color.red);
                g.fillOval(e.getX(), e.getY(),20,40);
            }
        });

        frame.add(canvas);
        frame.setVisible(true);
    }
}