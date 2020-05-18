package mod;

public enum Direction {

	Left("arrowLeft.png"),
	Up("arrowUp.png"),
	Down("arrowDown.png"),
	Right("arrowRight.png");
	
	private String _fileName;
	
	public String getFileName() { return _fileName; }
	
	private Direction(String fn) {
		_fileName = fn;
	}
}
