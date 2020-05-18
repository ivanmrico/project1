package mod;

public enum PassageType {

	// filename, Left, Up, Right, Down

	Space("space.png"), Void("void.png");

	private String _type;

	public String getFileName() {
		return _type;
	}

	private PassageType(String s) {
		_type = s;
	}
}
