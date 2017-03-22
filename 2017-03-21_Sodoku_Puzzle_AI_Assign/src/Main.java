import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Main {
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Sodoku Puzzle Solver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel listPane = new JPanel();
		listPane.setBackground(new Color(173, 216, 230));
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
		

		JPanel po = new JPanel();			//Outer Panel for puzzle
		JPanel pl = new PuzzleLayout();		//Current Puzzle configuration
		/* OLD CODE
		JPanel cp = new ControlPanel();		//main controls
		JPanel dp = new DebugPanel();		//Debugging Options
		*/
		
		
		// < BORDER FOR YOUR PANELS! >
		Border blackline = BorderFactory.createLineBorder(Color.black);
		TitledBorder titlePO, titleCP, titleDP;			//These panels are for the outline
		titlePO = BorderFactory.createTitledBorder(blackline, "Sodoku Puzzle :)");
		/* OLD CODE
		titleCP = BorderFactory.createTitledBorder(blackline, "Control Panel :3");
		titleDP = BorderFactory.createTitledBorder(blackline, "Debug Panel :D");
		*/
		
		//Set the borders to the 'outer' panels
		po.setBorder(titlePO);
		//cp.setBorder(titleCP);
		//dp.setBorder(titleDP);
		// </ BORDER FOR YOUR PANELS! >
		
		//Add 'inner' panels into 'outer' panels
		po.add(pl);
		listPane.add(po); 		//Add complete Puzzle Panel			to listPane
		//listPane.add(cp); 		//Add complete main controls Panel	to listPane 
		//listPane.add(dp); 		//Add complete Debugging Options	to listPane 

		frame.getContentPane().add(listPane);
		frame.pack();
		frame.setVisible(true);
	}
}
