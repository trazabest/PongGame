import java.awt.*;

public class PongGame6 extends Rectangle{

	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	
	PongGame6(int GAME_WIDTH, int GAME_HEIGHT){
		PongGame6.GAME_WIDTH = GAME_WIDTH;
		PongGame6.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Consolas",Font.PLAIN,60));
		
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		
		g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
		g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
	}
}