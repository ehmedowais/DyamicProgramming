package com.ows;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

/*
    This class is the code for house robber challange where we have to find maximum loot for non-adjacent houses
    This youtuber has a good explanation https://www.youtube.com/watch?v=VXqUQYGMnQg
* */
public class HouseRobber {

        public static int getMaxLoot(List<Integer> houses) {
            if (houses == null || houses.isEmpty()) {
                return 0;
            }
            int n = houses.size();
            if (n == 1) {
                return houses.get(0);
            }
            int prevMax = houses.get(0);
            int currMax = Math.max(houses.get(0), houses.get(1));
            for (int i = 2; i < n; i++) {
                int temp = currMax;
                currMax = Math.max(prevMax + houses.get(i), currMax);
                prevMax = temp;
            }
            return currMax;
        }



    public static int getMaxLootCircularStreet(List<Integer> houses) {
        var firstLoot = getMaxLoot(houses.subList(1, houses.size()-1));
        var secondLoot = getMaxLoot(houses.subList(0, houses.size()-2));
        return max(firstLoot, secondLoot);
    }
}
