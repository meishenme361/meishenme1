package head;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		Logic logic = new Logic();
		CellArray c_1 = new CellArray(100, 100);
		logic.initcell(c_1);

		JFrame gamemap=new gameMap(c_1);
		gamemap.setTitle("…˙√¸”Œœ∑");
		gamemap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
