import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        if (board == null || board.length == 0 || board[0].length == 0 || words == null || words.length == 0) {
            return result;
        }

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, trie.getRoot(), visited, result);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, boolean[][] visited, List<String> result) {
        int rows = board.length;
        int cols = board[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j]) {
            return;
        }

        char c = board[i][j];
        if (!node.containsKey(c)) {
            return;
        }

        node = node.get(c);
        if (node.isWord()) {
            result.add(node.getWord());
            node.setWord(null); // Mark word as found (avoid duplicates)
        }

        visited[i][j] = true;
        for (int[] direction : DIRECTIONS) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];
            dfs(board, newRow, newCol, node, visited, result);
        }
        visited[i][j] = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (!node.containsKey(c)) {
                node.put(c, new TrieNode());
            }
            node = node.get(c);
        }
        node.setWord(word);
    }
}

class TrieNode {
    private TrieNode[] children;
    private String word;

    public TrieNode() {
        children = new TrieNode[26];
        word = null;
    }

    public boolean containsKey(char c) {
        return children[c - 'a'] != null;
    }

    public TrieNode get(char c) {
        return children[c - 'a'];
    }

    public void put(char c, TrieNode node) {
        children[c - 'a'] = node;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isWord() {
        return word != null;
    }
}
