
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;


public class StartFrame extends JFrame  implements ActionListener {

    // private static StartPanel panel;
    private Container win;
    private JButton button, helpButton;
    private BufferedImage ore, wood, wheat, wool, brick;

    public StartFrame()
    {
        super();
        win = getContentPane();
        win.setLayout(null);

        try {
            ore = ImageIO.read(Objects.requireNonNull(this.getClass().getResource("/Image/img.png")));
            wheat = ImageIO.read(Objects.requireNonNull(this.getClass().getResource("/Image/img.png")));
            wool = ImageIO.read(Objects.requireNonNull(this.getClass().getResource("/Image/img.png")));
            wood = ImageIO.read(Objects.requireNonNull(this.getClass().getResource("/Image/img.png")));
            brick = ImageIO.read(Objects.requireNonNull(this.getClass().getResource("/Image/img.png")));


        } catch (IOException e) {
            e.printStackTrace();
        }
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible (true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g)
    {
        int setLength = ore.getWidth() / 2;
        int setHeight = ore.getHeight() / 2;
        int startHeight = getHeight()/6;
        int startLength = getWidth()/5;
        //first row
        for(int r=2; r<5; r++) {
            g.drawImage(ore, r*setLength + startLength, startHeight, setLength, setHeight, null);
        }
        //second row
        for(int r=1; r<5; r++) {
            g.drawImage(ore, r*setLength + setLength/2 + startLength, (int)(setLength * .86) + startHeight, setLength, setHeight, null);
        }
        //third row
        for(int r=1; r<6; r++) {
            g.drawImage(ore, r*setLength + startLength, (int)(setLength * 1.72) + startHeight, setLength, setHeight, null);
        }
        //fourth row
        for(int r=1; r<5; r++) {
            g.drawImage(ore, r*setLength + setLength/2 + startLength, (int)(setLength* 2.58) + startHeight, setLength, setHeight, null);
        }
        //fifth row
        for(int r=2; r<5; r++) {
            g.drawImage(ore, r*setLength + startLength, (int)(setLength * 3.44) + startHeight, setLength, setHeight, null);
        }

//        g.drawImage(ore, 0, 0,getWidth()/5, getHeight()/5, null);
//        g.drawImage(ore, 312, 0, getWidth()/5, getHeight()/5, null);
//        g.drawImage(ore, 624, 0, getWidth()/5, getHeight()/5, null);
//        g.drawImage(ore, 156, 270,getWidth()/5, getHeight()/5, null );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(helpButton))
            System.out.print("help"); //new HelpMenu();
    }
}

