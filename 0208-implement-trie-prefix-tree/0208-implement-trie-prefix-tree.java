class Trie {
    private final Node root;
    
    public Trie() {
        this.root = new Node();    
    }
    
    public class Node {
        private HashMap<Character, Node> map;
        private boolean isEnd;

        public Node() {
            this.map = new HashMap<>();
            this.isEnd = false;
        }
    }
    
    public void insert(String word) {
        Node current = this.root;
        // System.out.println("word = " + word);
        // System.out.println();
        for(Character w : word.toCharArray()) {
            // System.out.println("w = " + w);
            if(!current.map.containsKey(w)) {
                current.map.put(w, new Node());
            }
            current = current.map.get(w);
            // System.out.println(current);
            // System.out.println(current.isEnd);
            // System.out.println(current.map.get(w));
            // System.out.println();
        }
        current.isEnd = true;
    }

     public boolean search(String word) {
        Node current = this.root;
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            Node child = current.map.get(c);

            if (child == null) return false;
            current = child;
        }
        return current.isEnd;
     }

     public boolean startsWith(String prefix) {
         Node current = this.root; // 한 글자의 노드
        for(int i=0; i<prefix.length(); i++) {
            char c = prefix.charAt(i); // 한글 자
            // System.out.println("c = " + c);
            current = current.map.get(c);
            // System.out.println("current = " + current);

            if(current == null) {
                return false;
            }
        }
         return true;
     }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */