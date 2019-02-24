package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E999_AvailableCapturesforRook {

    public int numRookCaptures(char[][] board) {
        int rows = board.length, cols = board[0].length, ans = 0, posR = 0, posC = 0;
        for ( int i = 0; i < rows; i++) {
            for ( int j = 0; j < cols; j++) {
                if ( board[i][j] == 'R' ) {
                    posR = i;
                    posC = j;
                    break;
                }
            }
        }
        for ( int i = posR + 1; i < rows; i++ )
            if ( board[i][posC] != '.' ) {
                if ( board[i][posC] == 'p' )
                    ans += 1;
                break;
            }

        for ( int i = posR - 1; i >= 0; i-- )
            if ( board[i][posC] != '.' ) {
                if ( board[i][posC] == 'p' )
                    ans += 1;
                break;
            }

        for ( int i = posC + 1; i < cols; i++ )
            if ( board[posR][i] != '.' ) {
                if ( board[posR][i] == 'p' )
                    ans += 1;
                break;
            }

        for ( int i = posC - 1; i >= 0; i-- )
            if ( board[posR][i] != '.' ) {
                if ( board[posR][i] == 'p' )
                    ans += 1;
                break;
            }
        return ans;
    }
}