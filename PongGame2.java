import java.awt.*;
import javax.swing.*;

public class PongGame2 extends JFrame{

	PongGame3 panel;
	
	PongGame2(){
		panel = new PongGame3();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}