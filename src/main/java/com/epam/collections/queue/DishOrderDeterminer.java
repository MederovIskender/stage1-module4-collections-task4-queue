package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // Fill the queue with all dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int step = everyDishNumberToEat - 1;
        int p = 0;

        while (!queue.isEmpty()) {
            p = (p+step) % queue.size();
            int n = queue.remove(p);
            result.add(n);
        }

        return result;
    }
}
