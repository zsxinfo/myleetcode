class TimeMap {
    HashMap<String, HashMap<Integer, String>> lib;
    
    public TimeMap() {
        lib = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (lib.containsKey(key)) {
            HashMap<Integer, String> im = lib.get(key);
            im.put(timestamp, value);
        } else {
            HashMap<Integer, String> nim = new HashMap<Integer, String>();
            nim.put(timestamp, value);
            lib.put(key, nim);
        }
    }
    
    public String get(String key, int timestamp) {
        HashMap<Integer, String> im = lib.get(key);
        if (im == null) return ""; // there is no key in lib
        else {
            while (timestamp != 0) {
                if (im.containsKey(timestamp)) return im.get(timestamp);
                timestamp--;                
            }
            return "";
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */

 