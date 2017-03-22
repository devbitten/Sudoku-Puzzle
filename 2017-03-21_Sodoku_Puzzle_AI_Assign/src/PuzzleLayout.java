import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class PuzzleLayout extends JPanel {
	private int WIDTH = 550;		//Side length of squares is 50
	private int HEIGHT = 550;		//And there are 9 squares on each side
	private PuzzleState puzzleState;
	private int[] startPointXY, endPointXY;
	
	public PuzzleLayout(){
		puzzleState = new PuzzleState();
		
		/*  OLD CODE IN MAPLAYOUT
		startPointXY = mapState.getStartPointXY();
		endPointXY = mapState.getEndPointXY();
		*/
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	public void paintComponent(Graphics page){
		/* OLD CODE IN MAPLAYOUT
		page.setColor(Color.white);
		page.fillRect(0, 0, mapWidth, mapHeight);
		*/
		
		//Draw Puzzle Background AND outer border
		page.setColor(Color.white);
		page.fillRect(0, 0, WIDTH, HEIGHT);

		page.setColor(Color.black);
		Graphics2D g2 = (Graphics2D) page;
		g2.setStroke(new BasicStroke(12));
		g2.drawRect(0, 0, WIDTH, HEIGHT);
		//Draw big square borders
		g2.setStroke(new BasicStroke(4));
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++)
				g2.drawRect((i * WIDTH/3), (j * HEIGHT/3), WIDTH/3, HEIGHT/3);
		}
		//Draw individual square borders
		g2.setStroke(new BasicStroke(2));
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++)
				g2.drawRect((i * WIDTH/9), (j * HEIGHT/9), WIDTH/9, HEIGHT/9);
		}
		
		/* MORE OLD CODE IN MAPLAYOUT
		//Labels
		page.setColor(Color.gray);
		page.setFont(new Font("Courier New", Font.BOLD, 15));
		page.drawString("Start Node", 20, 15);
		page.drawString("MAZE SECTION", 140, 15);
		page.drawString("End Node", 420, 15);
		
		//Draw Polygons
		 */
	}
}
