package Day_11.LFUCache;

class LFUCache {
    private class Node {
        int key, value, freq;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    private final int capacity;
    private int minFreq;
    private final Map<Integer, Node> keyNodeMap;
    private final Map<Integer, LinkedHashSet<Integer>> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyNodeMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyNodeMap.containsKey(key)) {
            return -1;
        }
        updateFreq(key);
        return keyNodeMap.get(key).value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyNodeMap.containsKey(key)) {
            Node node = keyNodeMap.get(key);
            node.value = value;
            updateFreq(key);
        } else {
            if (keyNodeMap.size() >= capacity) {
                // Evict LRU from minFreq
                LinkedHashSet<Integer> minFreqKeys = freqMap.get(minFreq);
                int evictKey = minFreqKeys.iterator().next();
                minFreqKeys.remove(evictKey);
                if (minFreqKeys.isEmpty()) {
                    freqMap.remove(minFreq);
                }
                keyNodeMap.remove(evictKey);
            }

            // Insert new node
            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            freqMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFreq = 1;
        }
    }
    private void updateFreq(int key){
        Node node = keyNodeMap.get(key);
        int freq = node.freq;
        freqMap.get(freq).remove(key);
        if(freqMap.get(freq).isEmpty()){
            freqMap.remove(freq);
            if(freq == minFreq){
                minFreq++;
            }
        }
        node.freq++;
        freqMap.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */