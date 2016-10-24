package math.tp1;

public class Point {
	private int abs;
	private int ord;
	
	public Point(){
		this.abs = (int)(Math.random()*612);
		this.ord = (int)(Math.random()*792);
	}

	public int getAbs() {
		return abs;
	}

	public int getOrd() {
		return ord;
	}
}
