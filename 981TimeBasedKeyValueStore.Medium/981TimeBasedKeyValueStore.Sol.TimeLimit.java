class TimeMap {
    HashMap<String, Node> lib;
    
    public class Node {
        public int first;
        public String second;
        public Node next;
        
        public Node(int f, String s) {
            first = f;
            second = s;
        }
    }
    
    public TimeMap() {
        lib = new HashMap<String, Node>();
    }
    
    public void set(String key, String value, int timestamp) {
        Node anode = new Node(timestamp, value);
        if (lib.containsKey(key)) {
            Node enode = lib.get(key);
            while (enode.next != null) {
                enode = enode.next;
            }
            enode.next = anode;
        } else {
            lib.put(key, anode);
        }
    }
    
    public String get(String key, int timestamp) {
        Node anode = lib.get(key);
        if (anode == null) return ""; // there is no node
        else {
            if (anode.next == null) return anode.second; // only one node
            else {          // with at least 2 nodes
                int timestamp_prev;
                int timestamp_next;
                Node prev_node = anode;
                while (anode.next != null) {
                    timestamp_prev = anode.first;
                    prev_node = anode;
                    anode = anode.next;
                    timestamp_next = anode.first;
                    if (timestamp < timestamp_prev) return "";
                    if (timestamp_prev <= timestamp && timestamp < timestamp_next) {
                        return prev_node.second;
                    }
                }
                return anode.second;
            }
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */