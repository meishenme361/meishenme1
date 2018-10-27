package head;

import java.util.Random;
public class Logic {
	int value = 0;
	
	public void initcell(CellArray cell_1) //cellarray的初始化
	{
		int a=0;
		Random rand = new Random();
		int[][] array = new int[100][100];
		for(int i = 0; i <100; i++)
			for(int  j=0; j <100; j++) {
				array[i][j] = rand.nextInt(2);
			}
		for (int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				value = array[i][j];
				cell_1.setcell(i, j, value);
			}
		}
	}
	
	public int count(int i, int j, CellArray cell_1)//周边死亡数量
	{
		int count = 0;
		if((cell_1.getcell(i-1, j-1) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i, j-1) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i+1, j-1) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i-1, j) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i+1, j) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i, j+1) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i-1, j+1) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		if((cell_1.getcell(i+1, j+1) == 1)&&(cell_1.isValidCell(i,j)==1))
			count++;
		return count;
	}
	
	public CellArray judge(CellArray cell_1) {
		CellArray cell_2 = new CellArray(20, 20);
		
		for (int j = 0; j < 100; j++) 
		{
			for (int i = 0; i < 100; i++) 
			{
				if (count(i, j, cell_1) == 3)
					cell_2.setcell(i, j, 1);
				else if(count(i, j, cell_1)==2)
					{
						cell_2.setcell(i, j, cell_1.getcell(i, j));
					}
				else if(count(i, j, cell_1)!=2&&count(i, j, cell_1)!=3)
					cell_2.setcell(i, j, 0);	
			}
		}
		return cell_2;
	}
}
