package interfaceGraph;

import javax.swing.*;
public class Appli{
  public Appli(){
    JFrame f = new MaFrame();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
public static void main(String args[]){
  Appli a = new Appli();
  }  //ou simplement : { new Appli(); }
}
