package one.stoorx.leetcode.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

// Task: 146. LRU Cache
// Link: https://leetcode.com/problems/lru-cache
// Level: Medium
class LRUCache {
    private final LinkedHashMap<Integer, Integer> storage;

    public LRUCache(int capacity) {
        this.storage = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return storage.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        storage.put(key, value);
    }
}