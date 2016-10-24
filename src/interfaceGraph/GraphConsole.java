package interfaceGraph;

import java.util.Scanner;
import javax.swing.*;

public class GraphConsole extends JFrame{
  private JButton bouton;

  public GraphConsole(){
    setSize(400, 400);
    setTitle("Fenêtre à un bouton");

    bouton = new JButton("Hello");
    this.add(bouton); // équivalent à add(bouton, "Center"), voir plus loin
  }

  public static void main(String args[])
  {
    GraphConsole f = new GraphConsole();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
