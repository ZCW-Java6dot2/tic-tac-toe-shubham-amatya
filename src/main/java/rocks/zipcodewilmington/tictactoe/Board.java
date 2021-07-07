package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }
    boolean xWins = false;
    boolean oWins = false;
    boolean tie = false;
    String winner;

    public Boolean isInFavorOfX() {


        if( board[0][0].equals('X') && board[0][1].equals('X') && board[0][2].equals('X') ||
                board[1][0].equals('X') && board[1][1].equals('X') && board[1][2].equals('X')||
        board[2][0].equals('X') && board[2][1].equals('X') && board[2][2].equals('X') ||
                board[0][0].equals('X') && board[1][0].equals('X') && board[2][0].equals('X')||
                board[0][1].equals('X') && board[1][1].equals('X') && board[2][1].equals('X')||
                board[0][2].equals('X') && board[1][2].equals('X') && board[2][2].equals('X')||
                board[0][0].equals('X') && board[1][1].equals('X') && board[2][2].equals('X')||
                board[2][0].equals('X') && board[1][1].equals('X') && board[0][2].equals('X')){
            xWins = true;
        }
        return xWins;
    }

    public Boolean isInFavorOfO() {


        if( (board[0][0].equals('O') && board[0][1].equals('O') && board[0][2].equals('O') )||
                (board[1][0].equals('O') && board[1][1].equals('O') && board[1][2].equals('O'))||
                (board[2][0].equals('O') && board[2][1].equals('O') && board[2][2].equals('O')) ||
                (board[0][0].equals('O') && board[1][0].equals('O') && board[2][0].equals('O'))||
                (board[0][1].equals('O') && board[1][1].equals('O') && board[2][1].equals('O'))||
                (board[0][2].equals('O') && board[1][2].equals('O') && board[2][2].equals('O'))||
                (board[0][0].equals('O') && board[1][1].equals('O') && board[2][2].equals('O'))||
                (board[2][0].equals('O') && board[1][1].equals('O') && board[0][2].equals('O'))) {
            oWins = true;
        } else {
            oWins = false;
        }

        return oWins ;
    }

    public Boolean isTie() {
        if( (board[0][0].equals('O') && board[0][1].equals('X') && board[0][2].equals('X') )||
                (board[1][0].equals('X') && board[1][1].equals('O') && board[1][2].equals('O'))||
                (board[2][0].equals('X') && board[2][1].equals('O') && board[2][2].equals('O')) ||
                (board[0][0].equals('O') && board[1][0].equals('X') && board[2][0].equals('O'))||
                (board[0][1].equals('X') && board[1][1].equals('X') && board[2][1].equals('O'))||
                (board[0][2].equals('X') && board[1][2].equals('O') && board[2][2].equals('X'))||
               (board[0][0].equals('O') && board[1][1].equals('O') && board[2][2].equals('X'))||
                (board[2][0].equals('X') && board[1][1].equals('X') && board[0][2].equals('O'))) {
            tie = true;
        } else {
            tie = false;
        }

        return tie;
    }

    public String getWinner() {

        if (isInFavorOfO()){
            winner = "O";
        } else if (isInFavorOfX()){
            winner = "X";
        } else {
            winner = "tie";
        }

        return winner;
    }

}

