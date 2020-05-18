package mod;

public class Maze {

	private boolean[][] _maze =
			{
					{ true, 	true,  	true, 	false, 	true, 	true,  	true, 	false,	true, 	true,  	true, 	false, 	true, 	true,  	true, 	true },
					{ true, 	false, 	false, 	false, 	false, 	true,  	true, 	false,	true, 	true,  	true, 	false, 	true, 	true,  	true, 	true },
					{ true, 	false, 	true, 	true, 	false, 	false, 	true, 	false,	true, 	true,  	true, 	false, 	true, 	true,  	true, 	true },
					{ true, 	false, 	true, 	true, 	true, 	false, 	true, 	false,	true, 	true,  	true, 	false, 	false, 	false,  false, 	false },
					{ true, 	false, 	true, 	true, 	true, 	false, 	true, 	false,	true, 	true,  	true, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	false, 	true, 	false,	true, 	true,  	true, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	false, 	true, 	false,	true, 	true,  	true, 	false, 	true, 	true,  	false, 	false },
					{ true, 	false, 	true, 	true, 	true, 	false, 	false, 	false,	false, 	false,  false, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	false, 	true, 	false,	true, 	false,  false, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	false, 	true, 	true,	true, 	false, 	false, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	true,  	true, 	false,	true, 	false, 	true, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	true,  	true, 	false,	true, 	false, 	true, 	false, 	true, 	true,  	true, 	false },
					{ true, 	false, 	true, 	true, 	true, 	true,  	true, 	false,	true, 	false, 	true, 	false, 	false, 	false,  false, 	false },
					{ true, 	false, 	true, 	true, 	true, 	true,  	true, 	false,	true, 	false, 	true, 	false, 	true, 	true,  	true, 	true },
					{ true, 	false, 	true, 	true, 	true, 	true,  	true, 	false,	false, 	false, 	true, 	false, 	true, 	true,  	true, 	true },
					
			
			};
	
	public boolean[][] getMaze() { return _maze; }
	
	
}
