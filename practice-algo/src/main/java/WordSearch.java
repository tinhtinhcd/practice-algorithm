public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!word.startsWith(String.valueOf(board[i][j])))
                    continue;
                char[][] clone = board.clone();
                clone(clone,board);
                if (findNext(clone, i, j, word.substring(1, word.length())))
                    return true;
            }
        }
        return false;
    }

    private void clone(char[][] A2, char[][] A1){
        for (int i = 0; i < A2.length; i++) {
            A2[i] = A2[i].clone();
        }
    }

    private boolean findNext(char[][] clone, int i, int j, String str) {
        if (str.length() == 0)
            return true;

        clone[i][j] = '*';

        boolean rs = false;
        if ((i - 1 >= 0 && str.startsWith(String.valueOf(clone[i - 1][j])))) {
            rs = findNext(clone, i - 1, j, str.substring(1, str.length()));
        }
        if (rs == true)
            return true;
        if (i + 1 < clone.length && str.startsWith(String.valueOf(clone[i + 1][j]))) {
            rs = findNext(clone, i + 1, j, str.substring(1, str.length()));
        }
        if (rs == true)
            return true;
        if (j + 1 < clone[i].length && str.startsWith(String.valueOf(clone[i][j + 1]))) {
            rs = findNext(clone, i, j + 1, str.substring(1, str.length()));
        }
        if (rs == true)
            return true;
        if (j - 1 >= 0 && str.startsWith(String.valueOf(clone[i][j - 1]))) {
            rs = findNext(clone, i, j - 1, str.substring(1, str.length()));
        }
        return rs;
    }
}
