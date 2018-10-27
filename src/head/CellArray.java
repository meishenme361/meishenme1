package head;

public class CellArray {
	private int[][] cell = new int[100][100];
	private int row;
	private int col;
	CellArray(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	public int getcell(int row, int col){	
		if(row < 0 || col < 0 || row >= 100 || col >= 100)
			return 0;
		else {
			return this.cell[row][col];
		}
	}
	
	public void setcell(int row, int col, int value) {
		if(row < 0 || col < 0 || row >= 100 || col >= 100)
			return;
		else {
			this.cell[row][col] = value;
			
		}
	}
	public int isValidCell(int i, int j)
	{
		if(i<0||j<0||i>=100||j>=100) 
		{
		return 0;
		}
		return 1;
	}
}
