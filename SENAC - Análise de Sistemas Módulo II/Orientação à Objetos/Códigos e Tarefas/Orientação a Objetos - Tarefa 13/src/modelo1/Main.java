package modelo1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	
	Computer player1 = new Computer(1);
	JFrame mainFrame = new JFrame("Jogo da Velha");
	JPanel mainPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	JButton restartButton = new JButton("Sair"); // restart button nao funfa
	JButton buttons[][]= new JButton[3][3];
	Grid mainGrid = new Grid();
	
	buttonhandler handler = new buttonhandler();
	
	private class buttonhandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {

			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if( e.getSource() == buttons[i][j] ) {
						
						mainGrid.putIntoGrid(i, j);
						rePaint(mainGrid);
						
						if(mainGrid.findIfWon() == 2) {
							JOptionPane.showMessageDialog(null, "Você Ganhou!");
							clearJFrame();
							startGame();
							//System.exit(0);
						}
						else if(mainGrid.findIfWon() == 0) {
							JOptionPane.showMessageDialog(null, "Empate");
							startGame();
							clearJFrame();
							//System.exit(0);
						}
						
						computerTurn();
					}
				}
			}
			
			if(e.getSource() == restartButton) {
				System.exit(0); 
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Main();

	}
	
	public Main() {
		
		startGame();
	}
	
	private void startGame() {
		
		showGui();
		
		mainGrid.initialize();
		
		rePaint(mainGrid);
//		mainGrid.putValue(0, 2);
//		player1.giveTurn(mainGrid).printValues();
//		
//		mainGrid.putValue(6, 2);
//		player1.giveTurn(mainGrid).printValues();
		
		
	}
	
	public void computerTurn() {
		player1.giveTurn(mainGrid);
		rePaint(mainGrid);
		
		if(mainGrid.findIfWon() == 1) {
			JOptionPane.showMessageDialog(null, "O PC Ganhou!");
			clearJFrame();
			startGame();
			//System.exit(0);
		}
		else if(mainGrid.findIfWon() == 0) {
			JOptionPane.showMessageDialog(null, "Empate!");
			clearJFrame();
			startGame();
			//System.exit(0);
		}
	}
	
	
	public void showGui() {
		
		
		mainPanel.setLayout(new GridLayout(1, 2));
		mainPanel.setPreferredSize(new Dimension(750, 500));
		gamePanel = new JPanel(new GridLayout(3, 3));
		gamePanel.setPreferredSize(new Dimension(500, 500));
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {

				buttons[i][j] = new JButton();
				buttons[i][j].addActionListener(handler);
				gamePanel.add(buttons[i][j]);
			
			}
		}

		restartButton.addActionListener(handler);
		mainPanel.setBackground(Color.black);
		mainFrame.getContentPane().add(mainPanel);
		mainFrame.getContentPane().setLayout(new GridLayout(1, 2));
		mainFrame.setSize(309, 274);
		mainFrame.getContentPane();
		mainFrame.setVisible(true);
	}
	
	public void rePaint(Grid myGrid) {
		
		gamePanel.removeAll();
		gamePanel.revalidate();
		gamePanel.repaint();
		gamePanel.setPreferredSize(new Dimension(300, 300));
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				buttons[i][j].addActionListener(handler);
				if(myGrid.value[i][j] != 0 ) {
					
					if(myGrid.value[i][j] == 1) buttons[i][j] = getCircleButton();
					else buttons[i][j] = getCrossButton();
					//buttons[i][j].setEnabled(false);
				}
				gamePanel.add(buttons[i][j]);
			}
		}
		
		mainPanel.add(gamePanel);
	}
	
	private JButton getCircleButton() {
		JButton button = new JButton();
		
		try {
		    //Image img = ImageIO.read(getClass().getResource("circle.png"));
		    button.setIcon(new ImageIcon("circle.png"));
		  } catch (Exception ex) {
			  System.out.println("Working Directory = " +
		              System.getProperty("user.dir"));
		  }
		button.setSize(50, 50);
		
		return button;

	}
	
	private JButton getCrossButton() {
		JButton button = new JButton();
		
		try {
		    //Image img = ImageIO.read(getClass().getResource("circle.png"));
		    button.setIcon(new ImageIcon("cross.png"));
		  } catch (Exception ex) {
		  }
		button.setSize(50, 50);
		
		return button;
	}
	
	private void clearJFrame() {
		mainFrame.dispose();
	}
}