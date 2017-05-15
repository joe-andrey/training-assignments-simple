package eu.sig.training.ch02;

public class BoardFactory {
    // tag::createBoard[]
    public Board createBoard(Square[][] grid) {
    	return new BoardCreator(grid).create();
    }
    // end::createBoard[]
}

class BoardCreator {
	private Square[][] grid;
	private Board board;
	private int width;
	private int height;

	BoardCreator(Square[][] grid) {
		this.grid = grid;
        this.board = new Board(grid);
        this.width = this.board.getWidth();
        this.height = this.board.getHeight();        
	}
	
	public Board create() {
        assert grid != null;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                setDirection(x, y);
            }
        }
        return board;
	}

	private void setDirection(int x, int y) {
		Square square = grid[x][y];
		for (Direction dir : Direction.values()) {
		    createLink(x, y, square, dir);
		}
	}

	private void createLink(int x, int y, Square square, Direction dir) {
		int dirX = (width + x + dir.getDeltaX()) % width;
		int dirY = (height + y + dir.getDeltaY()) % height;
		Square neighbour = grid[dirX][dirY];
		square.link(neighbour, dir);
	}
}

class Board {
    public Board(Square[][] grid) {}

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
}

class Square {
    public void link(Square neighbour, Direction dir) {}
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
