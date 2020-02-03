package Lecture25;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TTT extends JFrame implements ActionListener {

	public static boolean crossturn = true;
	public static final int BOARD_SIZE = 3;

	public static enum gamestatus {
		Xwins, Zwins, Incomplete, Tie;
	}

	private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];

	TTT() {
		super.setTitle("TIC TAC TOE");
		super.setSize(600, 600);
		GridLayout grid = new GridLayout(BOARD_SIZE, BOARD_SIZE);
		super.setLayout(grid);
		Font font = new Font("Times New Roman", 1, 150);
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				JButton button = new JButton("");
				buttons[row][col] = button;
				button.setFont(font);
				button.addActionListener(this);
				super.add(button);
			}
		}
		super.setResizable(false);
		super.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton = (JButton) e.getSource();
		makeMove(clickedButton);

		gamestatus gs = this.getGameStatus();

		if (gs == gamestatus.Incomplete) {
			return;
		}
		declareWiiner(gs);
		int choice = JOptionPane.showConfirmDialog(this, "Would You Like To Restart");
		if (choice == JOptionPane.YES_OPTION) {
			for (int row = 0; row < BOARD_SIZE; row++) {
				for (int col = 0; col < BOARD_SIZE; col++) {
					buttons[row][col].setText("");
				}
			}
			crossturn = true;
		} else {
			super.dispose();
		}
	}

	private void makeMove(JButton clickedButton) {
		String btnText = clickedButton.getText();
		if (btnText.length() > 0) {
			JOptionPane.showMessageDialog(this, "INVALID MOVE");
			return;
		}

		if (crossturn) {
			clickedButton.setText("X");
		} else {
			clickedButton.setText("O");
		}
		crossturn = !crossturn;
	}

	private gamestatus getGameStatus() {
		String text1 = "", text2 = "";
		// for rows
		int row = 0, col = 0;
		while (row < BOARD_SIZE) {
			col = 0;
			while (col < BOARD_SIZE - 1) {
				text1 = buttons[row][col].getText();
				text2 = buttons[row][col + 1].getText();
				if (!text1.equals(text2) || text1.length() == 0 || text2.length() == 0) {
					break;
				}
				col++;
			}
			if (col == BOARD_SIZE - 1) {
				String text = buttons[row][col].getText();
				if (text.equals("X")) {
					return gamestatus.Xwins;
				} else {
					return gamestatus.Zwins;
				}
			}
			row++;
		}
		// for cols
		row = 0;
		col = 0;
		while (col < BOARD_SIZE) {
			row = 0;
			while (row < BOARD_SIZE - 1) {
				text1 = buttons[row][col].getText();
				text2 = buttons[row + 1][col].getText();
				if (!text1.equals(text2) || text1.length() == 0 || text2.length() == 0) {
					break;
				}
				row++;
			}
			if (row == BOARD_SIZE - 1) {
				String text = buttons[row][col].getText();
				if (text.equals("X")) {
					return gamestatus.Xwins;
				} else {
					return gamestatus.Zwins;
				}
			}
			col++;
		}
		// Diagnol 1;
		row = 0;
		col = 0;
		while (row < BOARD_SIZE - 1) {
			text1 = buttons[row][col].getText();
			text2 = buttons[row + 1][col + 1].getText();
			if (!text1.equals(text2) || text1.length() == 0 || text2.length() == 0) {
				break;
			}
			row++;
			col++;

		}
		if (row == BOARD_SIZE - 1 && col == BOARD_SIZE - 1) {
			String text = buttons[row][col].getText();
			if (text.equals("X")) {
				return gamestatus.Xwins;
			} else {
				return gamestatus.Zwins;
			}
		}

		row = BOARD_SIZE - 1;
		col = 0;
		while (row > 0) {
			text1 = buttons[row][col].getText();
			text2 = buttons[row - 1][col + 1].getText();
			if (!text1.equals(text2) || text1.length() == 0 || text2.length() == 0) {
				break;
			}
			row--;
			col++;

		}
		if (row == 0) {
			String text = buttons[row][col].getText();
			if (text.equals("X")) {
				return gamestatus.Xwins;
			} else {
				return gamestatus.Zwins;
			}
		}

		for (row = 0; row < BOARD_SIZE; row++) {
			for (col = 0; col < BOARD_SIZE; col++) {

				String text = buttons[row][col].getText();
				if (text.length() == 0) {
					return gamestatus.Incomplete;
				}
			}

		}
		return gamestatus.Tie;
	}

	private void declareWiiner(gamestatus gs) {

		if (gs == gamestatus.Xwins) {
			JOptionPane.showMessageDialog(this, "Player X Wins");
		} else if (gs == gamestatus.Zwins) {
			JOptionPane.showMessageDialog(this, "Player Y Wins");
		} else {
			JOptionPane.showMessageDialog(this, "Its A Tie");
		}
	}
}
