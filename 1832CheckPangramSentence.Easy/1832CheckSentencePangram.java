class Solution {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
        char[] box = new char[26];
        for (int i = 0; i < 26; i++) {
            box[i] = 0;
        }
        
        for (char c : sentence.toCharArray()) {
            int id = c - 'a';
            if (box[id] == 0) {
                box[id] = 65;
                count ++;
            } else {
                continue;
            }
        }
        if (count == 26) return true;
        else return false;
    }
}

/* 
Runtime: 1 ms, faster than 88.72% of Java online submissions for Check if the Sentence Is Pangram.
Memory Usage: 40.1 MB, less than 98.09% of Java online submissions for Check if the Sentence Is Pangram.
*/