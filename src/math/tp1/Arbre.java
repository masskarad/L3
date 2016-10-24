package math.tp1;

public class Arbre {
	private int nb_points;
	private int nb_paire_points;
	private Point points[];
	private int edge[][];
	private int arbre[][];
	
	public static void main(String [] Args){
		int nb_points;
		
	}
	
	public Arbre(int p_nb_points){
		this.nb_points = p_nb_points;
		this.nb_paire_points = this.nb_points*(this.nb_points-1)/2;
	}
}
