package head;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gameMap extends JFrame {
	MyPanel mp = null ;
	String s = null;
	gameMap(CellArray c_1)
	{	
		try {
			mp = new MyPanel(c_1);
			mp.setSize(1000, 1000);
			mp.setVisible(true);
			this.setSize(1000, 1000);
			this.setVisible(true);
			this.add(mp);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			while(true) {
				repaint();
				Thread.sleep(100);
			}
		}catch(Exception e){
			s = e.getMessage();
		}
	}
	public String isMap() {
		return s;
	}
}

class MyPanel extends JPanel	
{
	private CellArray c_1 = new CellArray(100, 100);
	MyPanel(CellArray c_1)
	{
		this.c_1=c_1;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Logic logic =new Logic();
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(this.c_1.getcell(i,j)==1)//ºÚÉ«
				{
					g.setColor(Color.black);
					g.fillRect(i*10,j*10,10,10);
				}
				else 
				{
					g.setColor(Color.white);
					g.fillRect(i*10,j*10,10,10);
				}
			}
		}
		this.c_1=logic.judge(this.c_1);
		
	}
}
