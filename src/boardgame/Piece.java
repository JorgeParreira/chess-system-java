package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Opcional. Por padrão o java já coloca a variável como null,
                        // caso não seja declarada no construtor
    }

    protected Board getBoard() {
        return board;
    }
}
