package Day_5.MaximumPopulationYear;

class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPopulation = 0;
        int earliestYear = 1950;

        for (int year = 1950; year <= 2050; year++) {
            int population = 0;
            for (int[] log : logs) {
                int birth = log[0];
                int death = log[1];

                // Count if person was alive in this year
                if (birth <= year && year < death) {
                    population++;
                }
            }

            // Update earliest year with max population
            if (population > maxPopulation) {
                maxPopulation = population;
                earliestYear = year;
            }
            // If same population, we keep the earlier year (do nothing)
        }

        return earliestYear;
    }
}