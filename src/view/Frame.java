package view;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cont.Controller;
import mod.Direction;
import mod.Maze;
import mod.PassageType;

public class Frame {

	private JFrame _frame;
	private JPanel _pan;
	private JLabel[][] _mazegui;
	private ImageIcon[][] _icons;
	private JLabel _ply;
	private int _plyRow, _plyCol;
	private Maze _maze;

	public int getPlayerRow() {
		return _plyRow;
	}

	public int getPlayerCol() {
		return _plyCol;
	}

	public JFrame getFrame() {
		return _frame;
	}

	public JLabel[][] getMazeGUI() {
		return _mazegui;
	}

	public Maze getMaze() {
		return _maze;
	}

	public void setPlayerRow(int row) {
		_plyRow = row;
	}

	public void setPlayerCol(int col) {
		_plyCol = col;
	}

	public Frame(Maze m) {
		_maze = m;
		_icons = getIconArray(_maze.getMaze());
		setupLabels();
		setupPanel();
		setupFrame();
	}

	private void setupFrame() {
		_frame = new JFrame("MiniMap");
		_frame.add(_pan);
		_frame.setResizable(false);
		_frame.pack();
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupPlayer();
		_frame.addKeyListener(new Controller(this));
		_frame.setVisible(true);
	}

	private void setupPlayer() {
		_plyRow = _icons.length - 1;
		_plyCol = 1;
		_mazegui[_plyRow][_plyCol].add(_ply);
		_ply.setLocation(0, 0);
		_ply.setSize(_mazegui[_plyRow][_plyCol].getSize());
		_mazegui[_plyRow][_plyCol].repaint();

	}

	public void addPlayer(int r, int c, Direction d) {
		_ply = new JLabel(new ImageIcon(getClass().getResource(d.getFileName())));
		_ply.setSize(_mazegui[r][c].getSize());
		_plyRow = r;
		_plyCol = c;
		_mazegui[r][c].add(_ply);
		_mazegui[r][c].repaint();
		_pan.repaint();
		_frame.repaint();
	}

	public void removePlayer(int r, int c) {
		_mazegui[r][c].remove(_ply);
		_mazegui[r][c].repaint();
		_pan.repaint();
		_frame.repaint();

	}

	private void setupPanel() {
		_pan = new JPanel();
		_pan.setLayout(new GridLayout(_icons.length, _icons[0].length));
		for (JLabel[] arr : _mazegui)
			for (JLabel j : arr)
				_pan.add(j);

	}

	private void setupLabels() {
		_mazegui = new JLabel[_icons.length][_icons[0].length];
		_ply = new JLabel(new ImageIcon(getClass().getResource("arrowUp.png")));

		for (int r = 0; r < _icons.length; r++) {
			for (int c = 0; c < _icons[0].length; c++) {
				_mazegui[r][c] = new JLabel(_icons[r][c]);

			}
		}
	}

	public ImageIcon[][] getIconArray(boolean[][] maze) {
		int rows = maze.length;
		int cols = maze[0].length;

		ImageIcon[][] icons = new ImageIcon[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (maze[r][c]) {

					icons[r][c] = new ImageIcon(getClass().getResource(PassageType.Void.getFileName()));
				} else {
					icons[r][c] = new ImageIcon(getClass().getResource(PassageType.Space.getFileName()));
				}

			}

		}
		return icons;

	}

}
