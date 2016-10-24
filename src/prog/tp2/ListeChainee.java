package prog.tp2;

public final class ListeChainee {
	private Node root;

	public ListeChainee() {
		root = new Node();
	}

	public ListeChainee(String p_nom) {
		root = new Node(p_nom);
	}

	public final int size() {
		return size_aux(root);
	}

	private final int size_aux(Node p_node) {
		if (p_node.successeur == null)
			return 1;
		else
			return 1 + size_aux(p_node.successeur);
	}

	public final Node get(int p_index) {
		return get_aux(root, p_index - 1);
	}

	private final Node get_aux(Node p_node, int p_compteur) {
		if (p_compteur == 0)
			return p_node;
		else
			return get_aux(p_node.successeur, p_compteur - 1);

	}

	private final void add(String p_nom) {
		get(size()).successeur = new Node(p_nom);
	}

	public final String toString() {
		return root.toString();
	}

	private final void addDebut(String p_nom) {
		Node t_node = new Node(p_nom, root);
		root = t_node;
	}

	public static void main(String[] Args) {
		ListeChainee liste_chainee = new ListeChainee("Miaou");
		liste_chainee.add("Nya");
		liste_chainee.add("Plop");
		liste_chainee.add("Yaulo");
		liste_chainee.addDebut("Meow");
		System.out.println(liste_chainee.size());
		System.out.println(liste_chainee.toString());
	}

	private final class Node {
		private String nom;
		private Node successeur;

		public Node() {
			nom = "";
			successeur = null;
		}

		public Node(String p_nom) {
			nom = p_nom;
			successeur = null;
		}

		public Node(String p_nom, Node p_successeur) {
			nom = p_nom;
			successeur = p_successeur;
		}

		public String toString() {
			if (successeur == null)
				return "[Nom : " + nom + ']';
			else
				return "[Nom : " + nom + "] --> " + successeur.toString();
		}
	}
}
