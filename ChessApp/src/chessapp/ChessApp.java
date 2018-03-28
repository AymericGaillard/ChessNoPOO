/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessapp;

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
        frame.setVisible(true);
        frame.setTitle("bonsoir à tous");
        frame.setSize(400,400);
        JPanel checkersBoard;
        //checkersBoard = setCheckerboard(10);
        //frame.add(checkersBoard);
    }
    
    public JPanel setCheckerBoard(JPanel checkersBoard){
        GridLayout layout = new GridLayout();
        checkersBoard = new JPanel(layout);
        
        return checkersBoard;
    }
    
}
