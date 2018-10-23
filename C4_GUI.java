package ConnectFour;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C4_GUI extends JFrame {
	private JPanel jpMain;
	C4_DisBoard dBoard;
	C4_BPanel bPanel;
	C4_CheckerSlot cSlot;

	private Player currPlayer;
	private Player player1;
	private Player player2;
	public JLabel playerDisplay;
	
	
	
//	public JLabel display;
	
	public C4_GUI() {
		player1 = new Player("United States","US");
		player2 = new Player("China", "CN");
		currPlayer = player1;
		this.setTitle("Connect Four: Trade War");
		
		jpMain = new JPanel();
		jpMain.setLayout(new BorderLayout());
		jpMain.setBackground(Color.WHITE);
		
		
		dBoard = new C4_DisBoard();
		bPanel = new C4_BPanel();
		cSlot = new C4_CheckerSlot();
		jpMain.add(BorderLayout.SOUTH, dBoard);
		jpMain.add(BorderLayout.NORTH, bPanel);
		jpMain.add(BorderLayout.CENTER, cSlot);
		
		add(jpMain);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	private class C4_DisBoard extends JPanel{
		public JLabel display;
		public Font screenFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		public Font sf2 = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		public C4_DisBoard() {
			display = new JLabel();
			playerDisplay = new JLabel();
			display.setFont(screenFont);
			playerDisplay.setFont(sf2);
			add(display);
			add(playerDisplay);
			display();
		}
		public void display() {
			display.setText("Current Player:");
			playerDisplay.setText(currPlayer.getName());
		}
	}
	private class C4_BPanel extends JPanel implements GBInterface, GamePlayerIntf, ActionListener{
		
		private JButton[] choice;
		private final String[] JBTN_NAMES = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 "};
		public C4_BPanel() {
			setLayout(new GridLayout(1, 7));
			choice = new JButton[7];
			displayBoard();
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btnClicked = (JButton) e.getSource();
			if(btnClicked.equals(choice[0])) {//checks which button was pressed
				if(C4_CheckerSlot.slots[5][0].getText().equals(C4_CheckerSlot.blankText)) { //it goes up every column to check cells
					C4_CheckerSlot.slots[5][0].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][0].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][0].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][0].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][0].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][0].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][0].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][0].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][0].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][0].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][0].setText(currPlayer.getSymbol());
				}
			}
			else if(btnClicked.equals(choice[1])) {
				if(C4_CheckerSlot.slots[5][1].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[5][1].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][1].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][1].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][1].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][1].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][1].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][1].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][1].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][1].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][1].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][1].setText(currPlayer.getSymbol());
				}
			}
			else if(btnClicked.equals(choice[2])) {
				if(C4_CheckerSlot.slots[5][2].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[5][2].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][2].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][2].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][2].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][2].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][2].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][2].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][2].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][2].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][2].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][2].setText(currPlayer.getSymbol());
				}
			}
			else if(btnClicked.equals(choice[3])) {
				if(C4_CheckerSlot.slots[5][3].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[5][3].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][3].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][3].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][3].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][3].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][3].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][3].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][3].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][3].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][3].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][3].setText(currPlayer.getSymbol());
				}
			}
			else if(btnClicked.equals(choice[4])) {
				if(C4_CheckerSlot.slots[5][4].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[5][4].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][4].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][4].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][4].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][4].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][4].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][4].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][4].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][4].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][4].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][4].setText(currPlayer.getSymbol());
				}
			}
			else if(btnClicked.equals(choice[5])) {
				if(C4_CheckerSlot.slots[5][5].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[5][5].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][5].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][5].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][5].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][5].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][5].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][5].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][5].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][5].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][5].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][5].setText(currPlayer.getSymbol());
				}
			}
			else if(btnClicked.equals(choice[6])) {
				if(C4_CheckerSlot.slots[5][6].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[5][6].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[4][6].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[4][6].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[3][6].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[3][6].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[2][6].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[2][6].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[1][6].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[1][6].setText(currPlayer.getSymbol());
				}
				else if(C4_CheckerSlot.slots[0][6].getText().equals(C4_CheckerSlot.blankText)) {
					C4_CheckerSlot.slots[0][6].setText(currPlayer.getSymbol());
				}
			}
			takeTurn();
			playerDisplay.setText(currPlayer.getName());
			if(isWinner()) {
				JOptionPane.showMessageDialog(null, currPlayer.getName() + " has reached 4 first, and is a winner.");
				int answer = JOptionPane.showConfirmDialog(null, "Play again?");
				if(answer == JOptionPane.YES_OPTION) {
					clearBoard();
				}
				else if(answer == JOptionPane.NO_OPTION || answer == JOptionPane.CANCEL_OPTION) {
					System.exit(0);
				}
				
			}
			else if(isFull()) {
				JOptionPane.showMessageDialog(null,"It is a draw.");
				int answer = JOptionPane.showConfirmDialog(null, "Play again?");
				if(answer == JOptionPane.YES_OPTION) {
					clearBoard();
				}
				else if(answer == JOptionPane.NO_OPTION || answer == JOptionPane.CANCEL_OPTION) {
					System.exit(0);
				}
			}
			
		}

		@Override
		public void displayBoard() {
			for(int i = 0; i < 7; i++) {
				choice[i] = new JButton(JBTN_NAMES[i]);
				Font fon = new Font(Font.SANS_SERIF, Font.BOLD, 30);
				choice[i].setFont(fon);
				choice[i].addActionListener(this);
				choice[i].setEnabled(true);
				choice[i].setForeground(Color.BLACK);
				choice[i].setBounds(40,30,40,30);
				add(choice[i]);
			}
			
		}

		@Override
		public void clearBoard() {
			for(int row=0; row < 6; row++){
				for(int col=0; col < 7; col++){
					C4_CheckerSlot.slots[row][col].setText(C4_CheckerSlot.blankText);		
					
				}
			}
		}

		@Override
		public boolean isEmpty() {
			for(int row= 0; row < C4_CheckerSlot.slots.length; row++){
				for(int col=0; col< C4_CheckerSlot.slots[row].length; col++){
					String cellContent = C4_CheckerSlot.slots[row][col].getText().trim();
					if(cellContent.equals(C4_CheckerSlot.blankText)){
						return true;
					}
				}
			}
			return false;
		}

		@Override
		public boolean isFull() {
			for(int row= 0; row < C4_CheckerSlot.slots.length; row++){
				for(int col=0; col< C4_CheckerSlot.slots[row].length; col++){
					String cellContent = C4_CheckerSlot.slots[row][col].getText().trim();
					if(cellContent.isEmpty()){
						return false;
					}
				}
			}
			return true;
		}


		@Override
		public boolean isWinner() {
			//check rows
			//check cols
			//check main diagonal
			//check seocndary diagonal
			if(isWinnerInRow() || isWinnerInCol() || isWinnerInMainDiag() || isWinnerInSecDiag()){
				return true;
			}
			return false;
		}

		public boolean isWinnerInRow(){
			String symbol = currPlayer.getSymbol();
			String otherSym = "";
			if(currPlayer == player1) {
				otherSym = player2.getSymbol();
			}
			else if(currPlayer == player2) {
				otherSym = player1.getSymbol();
			}
			for(int row = 0; row < 6; row++){
				int numMatchesInRow = 0; //reset on the next row
				for(int col = 0; col < 7; col++){
					if(C4_CheckerSlot.slots[row][col].getText().trim().equalsIgnoreCase(symbol)){
						numMatchesInRow++;
					}
					else if(C4_CheckerSlot.slots[row][col].getText().trim().equalsIgnoreCase(otherSym)){
						numMatchesInRow = 0;
					}
				}
				if(numMatchesInRow == 4){
					return true;
				}
			}
			return false;
		}
		public boolean isWinnerInCol() {
			String symbol = currPlayer.getSymbol();
			String otherSym = "";
			if(currPlayer == player1) {
				otherSym = player2.getSymbol();
			}
			else if(currPlayer == player2) {
				otherSym = player1.getSymbol();
			}
			for(int col = 0; col < 7; col++) {
				int numMatchesInCol = 0;
				for(int row = 0; row < 6; row++) {
					if(C4_CheckerSlot.slots[row][col].getText().trim().equalsIgnoreCase(symbol)){
						numMatchesInCol++;
					}
					else if(C4_CheckerSlot.slots[row][col].getText().trim().equalsIgnoreCase(otherSym)) {
						numMatchesInCol = 0;
					}
				}
				if(numMatchesInCol == 4) {
					return true;
				}
			}
			return false;
		}
		public boolean isWinnerInMainDiag() { //checks all possible upward diag's
			String symbol = currPlayer.getSymbol();
				if((C4_CheckerSlot.slots[3][0].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[1][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[0][3].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
				else if((C4_CheckerSlot.slots[4][0].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][1].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][3].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[3][1].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[0][4].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[5][0].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[4][1].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][3].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[4][1].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][4].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[3][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][4].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[0][5].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[5][1].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[4][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][4].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[4][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][4].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][5].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[3][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][4].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][5].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[0][6].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[5][2].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[4][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][4].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][5].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[4][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][4].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][5].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[1][6].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else if((C4_CheckerSlot.slots[5][3].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[4][4].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[3][5].getText().trim().equalsIgnoreCase(symbol) &&
						C4_CheckerSlot.slots[2][6].getText().trim().equalsIgnoreCase(symbol))){
					return true;
					
				}
				else {
					return false;	
				}
		}
		public boolean isWinnerInSecDiag() { //checks all possible downward diag's
			String symbol = currPlayer.getSymbol();
			if((C4_CheckerSlot.slots[0][0].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[1][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][3].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[1][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][4].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[2][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][4].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[5][5].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[0][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[1][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][4].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[1][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][4].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][5].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[2][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][4].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][5].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[5][6].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[0][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[1][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][4].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][5].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[1][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][4].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][5].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][6].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[0][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[1][4].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][5].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][6].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[1][0].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[2][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][3].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[2][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][3].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[5][4].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else if((C4_CheckerSlot.slots[2][0].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[3][1].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[4][2].getText().trim().equalsIgnoreCase(symbol) &&
					C4_CheckerSlot.slots[5][3].getText().trim().equalsIgnoreCase(symbol))){
				return true;
				
				}
			else {
				return false;
			}
			
		}


		@Override
		public void takeTurn() {
			if(currPlayer.equals(player1)){
				currPlayer = player2;
			}
			else{
				currPlayer = player1;
			}
			
		}
		
	}
	public static class C4_CheckerSlot extends JPanel implements GBInterface{
		public static JTextField[][] slots;
		public static String blankText = "";
		private final int ROWS = 6;
		private final int COLS = 7;
		public C4_CheckerSlot() {
			setLayout(new GridLayout(ROWS,COLS));
			slots = new JTextField[ROWS][COLS];
			displayBoard();
			
		}

		@Override
		public void displayBoard() {
			for(int row=0; row < slots.length; row++){
				for(int col=0; col< slots[row].length; col++){
					slots[row][col] = new JTextField();
					Font bigFont = new Font(Font.SANS_SERIF, Font.BOLD, 40);
					slots[row][col].setFont(bigFont);
					slots[row][col].setEnabled(false);
					slots[row][col].setText(blankText);
					add(slots[row][col]);	
				}
			}
			
		}

		@Override
		public void clearBoard() { //unused on purpose, these methods aren't necessary, but eclipse thinks so
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isEmpty() {
			
			return false;
		}

		@Override
		public boolean isFull() {
			
			return false;
		}

	}
	

}

