package Day_9.MinimumTimeDifference;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutesList = new ArrayList<>();

        for(String time : timePoints){
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            minutesList.add(hours * 60 + minutes);
        }

        Collections.sort(minutesList);

        int minDiff = Integer.MAX_VALUE;
        for(int i =  1; i < minutesList.size(); i++){
            int diff = minutesList.get(i) - minutesList.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }

        int first = minutesList.get(0);
        int last = minutesList.get(minutesList.size() - 1);
        int wrapDiff = (1440 - last + first);
        minDiff = Math.min(minDiff, wrapDiff);

        return minDiff;
    }
}