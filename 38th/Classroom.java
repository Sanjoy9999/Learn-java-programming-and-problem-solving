
// public class Classroom {

//     static class Node {
//         Node[] children;
//         boolean eow;

//         public Node() {
//             children = new Node[26]; // a to z
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//             eow = false;
//         }
//     }

//     static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {// O(l)
//             int idx = word.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 // add new node
//                 curr.children[idx] = new Node();
//             }
//             if (i == word.length() - 1) {
//                 curr.children[idx].eow = true;
//             }

//             curr = curr.children[idx];
//         }
//     }

// //for search word
//     public static boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) { //O(l) L = key length
//             int idx = key.charAt(i) - 'a';
//             Node node = curr.children[idx];

//             if (node == null) {
//                 return false;
//             }
//             if (i == key.length() - 1 && node.eow == false) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String words[] = { "the", "a", "there", "their", "any" };
//         for (int i = 0; i < words.length; i++) {
//             insert(words[i]);
//         }

//         System.out.println(search("their")); //true
//         System.out.println(search("thor"));//false
//         System.out.println(search("an"));//true
//     }
// }

//Word Break Problem 

// public class Classroom {

//     static class Node {
//         Node[] children;
//         boolean eow;

//         public Node() {
//             children = new Node[26]; // a to z
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//             eow = false;
//         }
//     }

//     static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {// O(l)
//             int idx = word.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 // add new node
//                 curr.children[idx] = new Node();
//             }
//             if (i == word.length() - 1) {
//                 curr.children[idx].eow = true;
//             }

//             curr = curr.children[idx];
//         }
//     }

// //for search word
//     public static boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) { //O(l) L = key length
//             int idx = key.charAt(i) - 'a';
//             Node node = curr.children[idx];

//             if (node == null) {
//                 return false;
//             }
//             if (i == key.length() - 1 && node.eow == false) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }

//         return true;
//     }

//     public static boolean wordBreak(String key){
//         if(key.length() == 0){
//             return true;
//         }

//         for(int i=1; i<=key.length();i++){
//             String firstPart = key.substring(0, i); // 0, 1
//             String secPart = key.substring(i);
//             if(search(firstPart) && wordBreak(secPart)){
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         String words[] = { "i", "like", "sam", "samsung", "mobile" };
//         String key = "ilikesamsung";

//         for(int i=0;i<words.length;i++){
//             insert(words[i]);
//         }

//         System.out.println(wordBreak(key));
//     }
// }

// // 2)startsWith Problem

// public class Classroom {

//     static class Node {
//         Node[] children;
//         boolean eow;

//         public Node() {
//             children = new Node[26]; // a to z
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//             eow = false;
//         }
//     }

//     static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {// O(l)
//             int idx = word.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 // add new node
//                 curr.children[idx] = new Node();
//             }
//             if (i == word.length() - 1) {
//                 curr.children[idx].eow = true;
//             }

//             curr = curr.children[idx];
//         }
//     }

// //for search word
//     public static boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) { //O(l) L = key length
//             int idx = key.charAt(i) - 'a';
//             Node node = curr.children[idx];

//             if (node == null) {
//                 return false;
//             }
//             if (i == key.length() - 1 && node.eow == false) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }

//         return true;
//     }

//     public static boolean wordBreak(String key){
//         if(key.length() == 0){
//             return true;
//         }

//         for(int i=1; i<=key.length();i++){
//             String firstPart = key.substring(0, i); // 0, 1
//             String secPart = key.substring(i);
//             if(search(firstPart) && wordBreak(secPart)){
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static boolean startsWith(String prefix){
//         Node curr = root;

//         for(int i=0; i<prefix.length();i++){
//             int idx = prefix.charAt(i) - 'a';

//             if(curr.children[idx] == null){
//                 return false;
//             }
//            curr = curr.children[idx];
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//        String words[] = {"apple","app","mango","man","woman"};
//        String prefix = "app";

//        for(int i=0; i<words.length;i++){
//         insert(words[i]);
//        }

//        System.out.println(startsWith(prefix));
//     }
// }

// 3)Count Unique Substrings 

// public class Classroom {

//     static class Node {
//         Node[] children;
//         boolean eow;

//         public Node() {
//             children = new Node[26]; // a to z
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//             eow = false;
//         }
//     }

//     static Node root = new Node();

//     // Insert function for trie

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {// O(l)
//             int idx = word.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 // add new node
//                 curr.children[idx] = new Node();
//             }
//             if (i == word.length() - 1) {
//                 curr.children[idx].eow = true;
//             }

//             curr = curr.children[idx];
//         }
//     }

//     // for search word
//     public static boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) { // O(l) L = key length
//             int idx = key.charAt(i) - 'a';
//             Node node = curr.children[idx];

//             if (node == null) {
//                 return false;
//             }
//             if (i == key.length() - 1 && node.eow == false) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }

//         return true;
//     }

//     public static int countNode(Node root) {

//         if (root == null) {
//             return 0;
//         }

//         int count = 0;
//         for (int i = 0; i < 26; i++) {
//             if (root.children[i] != null) {
//                 count += countNode(root.children[i]);
//             }
//         }
//         return count + 1;
//     }

//     public static void main(String[] args) {
//         String str = "apple";

//         for (int i = 0; i < str.length(); i++) {
//             String suffix = str.substring(i);
//             insert(suffix);
//         }
//         System.out.println(countNode(root));
//     }
// }











// 4)Longest World with all Prefixes 

public class Classroom {

    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a to z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    // Insert function for trie

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {// O(l)
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    // for search word
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) { // O(l) L = key length
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}
