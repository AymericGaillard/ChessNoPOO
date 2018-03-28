/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessapp;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aymeric
 */
public class ChessApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ceci est mon premier programme");
        ChessApp checkersFrame = new ChessApp();
        checkersFrame.go();
    }
    
    public void go(){
        System.out.println("invocation de la fonction go()");
        JFrame frame = new JFrame();
        JPanel checkersBoard;
        checkersBoard = setCheckerBoard(10);
        frame.add(checkersBoard);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("bonsoir à tous");
        frame.setSize(400,400);
    }
    
    public JPanel setCheckerBoard(int n){
        GridLayout layout = new GridLayout(n,n);
        JPanel checkersBoard = new JPanel();
        checkersBoard.setLayout(layout);
        JPanel cellule;
        JPanel thing;
        for(int j=0; j<n;j++){
            for(int i=0;i<n;i++){
                cellule = new JPanel();
                if((i+j)%2==0){
                    cellule.setBackground(Color.white);
                }
                else{
                    cellule.setBackground(Color.black);
                    if(j<3){
                        thing = new JPanel();
                        thing.setBackground(Color.red);
                        cellule.add(thing);
                    }
                    else if(j>6){
                        thing = new JPanel();
                        thing.setBackground(Color.blue);
                        cellule.add(thing);
                    }
                }
                checkersBoard.add(cellule);
            } 
        }
        return checkersBoard;
    }
}
