import java.awt.*;

public class DuckFace {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		
		Graphics g = panel.getGraphics();
		
		g.drawOval(50,25,40,40);
		g.setColor(Color.BLUE);
		g.fillOval(50,25,40,40);
		g.drawOval(130,25,40,40);
		g.setColor(Color.BLUE);
		g.fillOval(130,25,40,40);
		g.setColor(Color.RED);
		g.drawRect(70,50,80,80);
		g.setColor(Color.RED);
		g.fillRect(70,50,80,80);
		g.setColor(Color.black);
		g.drawLine(150,90,70,90);
		
		
		
		
		
		
		
		
	}

}



