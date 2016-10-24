package interfaceGraph;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.*;

class MaFrame extends JFrame implements KeyListener{
  private JPanel pNorth, pCenter;
  private JTextField pSouth;
  private JButton b1,b2,b3;
  private JButton [] boutons;
  private JTextField texte;
  private JMenuBar menuBar = new JMenuBar();
  private JMenu test1 = new JMenu("Fichier");
  private JMenu test2 = new JMenu("Editer");
  private JMenuItem item1 = new JMenuItem("Ouvrir");
  private JMenuItem item2 = new JMenuItem("Fermer");
  private static int compteur = 0;
  
  @Override
  public void keyPressed(KeyEvent e) {
      pSouth.setText(pSouth.getText().toUpperCase());
    }

  @Override
  public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

  }

  public MaFrame(){
        this.test1.add(item1);
        this.test1.add(item2);
        this.menuBar.add(test1);
        this.menuBar.add(test2);
        this.setJMenuBar(menuBar);
    setTitle("Fenêtre à panneaux");
    pNorth = new JPanel();
    pCenter = new JPanel();
    pSouth = new JTextField("");
    pSouth.addKeyListener(this);
    getContentPane().add(pSouth);
    add(pNorth, "North");
    add(pCenter, "Center"); // ou : add(pBleu);
    add(pSouth, "South");
    b1 = new JButton("b1"); pNorth.add(b1);


    boutons = new JButton[10];
    for (int i = 0; i < boutons.length; i ++){
    	boutons[i]= new JButton("Bouton "+i);
    	boutons[i].addMouseListener(new java.awt.event.MouseAdapter()
	    {
	        public void mouseClicked(java.awt.event.MouseEvent evt)
	        {
			    JOptionPane.showMessageDialog(pSouth,
			    		"T@ Kliqué : " + ++compteur, 
			             "1Tïtre",
			             JOptionPane.OK_CANCEL_OPTION);
	        }
});
    }
      pCenter.setLayout(new GridLayout(4,3));
      for (int i = 0; i < boutons.length; i ++)
      pCenter.add(boutons[i]);
    b3 = new JButton("b3"); pSouth.add(b3);
    pack();
     }
}
