import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShapeWindowDemo extends JFrame {
    public ShapeWindowDemo() {
        super("ShapedWindow");
        setLayout(new GridBagLayout());
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new Ellipse2D.Double(0,0,getWidth(),getHeight()));
            }
        });
 
        setUndecorated(true);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        add(new JButton("I am a Button"));
    }
 
    public static void main(String[] args) {
    	ShapeWindowDemo wnd = new ShapeWindowDemo();
    	wnd.setVisible(true);
    }
}