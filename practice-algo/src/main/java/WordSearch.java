public class WordSearch {
    public boolean exist(char[][] board, String word) {

        if(board.length == 0 || word.length()==0)
            return true;

        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(word.charAt(0) == board[i][j] && findnext(board, word, 0, i, j, visited))
                    return true;
            }
        }

        return false;
    }

    private boolean findnext(char[][] board, String word, int index, int i, int j, boolean[][] visited){

        if(index == word.length())
            return true;

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || visited[i][j] || word.charAt(index) != board[i][j])
            return false;

        visited[i][j] = true;
        if(findnext(board, word, index+1, i + 1, j, visited)
                ||findnext(board, word, index+1, i - 1, j, visited)
                ||findnext(board, word, index+1, i, j + 1, visited)
                ||findnext(board, word, index+1, i, j - 1, visited)){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
