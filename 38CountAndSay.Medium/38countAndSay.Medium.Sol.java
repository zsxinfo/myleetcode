class Solution {
    public String countAndSay(int n) {
        String s = "1";
        ArrayList<Node> arr = new ArrayList<Node>();
        while (n != 1) {
            arr = count(s);
            s = create(arr);
            n = n - 1;
        }
        return s;
    }
    
    public ArrayList<Node> count(String s){
        ArrayList<Node> ans = new ArrayList<Node>();
        int count = 0;
        char pre = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == pre) {
                count ++;
            } else {
                ans.add(new Node(pre, count));
                count = 1;
            }
            pre = c;
        }
        ans.add(new Node(pre, count));
        return ans;
    }
    
    public String create(ArrayList<Node> ans) {
        String s = new String();
        for (Node nod : ans) {            
            s += Integer.toString(nod.fre);
            s += nod.ch;
        }        
        return s;
    }
    
    public class Node {
        char ch;
        int fre;
        
        public Node (char c, int fr) {
            ch = c;
            fre = fr;
        }
    }
}


/* Runtime: 69 ms, faster than 7.42% of Java online submissions for Count and Say.
Memory Usage: 72.5 MB, less than 5.01% of Java online submissions for Count and Say.
*/