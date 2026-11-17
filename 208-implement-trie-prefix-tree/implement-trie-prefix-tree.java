class Trie {

    class Node {
        Node[] child = new Node[26];
        boolean isWord;
    }

    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (curr.child[idx] == null)
                curr.child[idx] = new Node();

            curr = curr.child[idx];
        }

        curr.isWord = true;
    }

    public boolean search(String word) {
        Node curr = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (curr.child[idx] == null)
                return false;

            curr = curr.child[idx];
        }

        return curr.isWord;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;

        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';

            if (curr.child[idx] == null)
                return false;

            curr = curr.child[idx];
        }

        return true;
    }
}