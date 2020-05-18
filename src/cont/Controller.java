package cont;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import mod.Direction;
import view.Frame;

public class Controller implements KeyListener {
	
	private Frame _f;
	
	public Controller(Frame f) {
		_f = f;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int r = _f.getPlayerRow();
		int c = _f.getPlayerCol();
		if (arg0.getKeyCode() == KeyEvent.VK_W) {
			if(r - 1 >= 0 && !_f.getMaze().getMaze()[r-1][c]) {
				_f.removePlayer(r, c);
				_f.addPlayer(r-1, c, Direction.Up);
			}
		} else if (arg0.getKeyCode() == KeyEvent.VK_D) {
			if(c + 1 < _f.getMazeGUI()[0].length && !_f.getMaze().getMaze()[r][c+1]) {
				_f.removePlayer(r, c);
				_f.addPlayer(r, c + 1, Direction.Right);
			}

		} else if (arg0.getKeyCode() == KeyEvent.VK_S) {
			if(r + 1 < _f.getMazeGUI().length && !_f.getMaze().getMaze()[r+1][c]) {
				_f.removePlayer(r, c);
				_f.addPlayer(r+1, c, Direction.Down);
			}

		} else if (arg0.getKeyCode() == KeyEvent.VK_A) {
			if(c - 1 > 0 && !_f.getMaze().getMaze()[r][c-1]) {
				_f.removePlayer(r, c);
				_f.addPlayer(r, c-1, Direction.Left);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
