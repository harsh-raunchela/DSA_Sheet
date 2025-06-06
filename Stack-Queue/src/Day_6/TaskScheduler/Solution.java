package Day_6.TaskScheduler;

import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char t : tasks) {
            freqMap.put(t, freqMap.getOrDefault(t, 0) + 1);
        }

        // Max Heap: sort by highest frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(freqMap.values());

        Queue<int[]> cooldown = new LinkedList<>();
        int time = 0;

        while (!maxHeap.isEmpty() || !cooldown.isEmpty()) {
            time++;

            // Schedule from heap
            if (!maxHeap.isEmpty()) {
                int freq = maxHeap.poll() - 1; // one occurrence used
                if (freq > 0) {
                    cooldown.add(new int[]{freq, time + n});
                }
            }

            // Check if task cooldown is over
            if (!cooldown.isEmpty() && cooldown.peek()[1] == time) {
                maxHeap.offer(cooldown.poll()[0]);
            }
        }

        return time;
    }
}
