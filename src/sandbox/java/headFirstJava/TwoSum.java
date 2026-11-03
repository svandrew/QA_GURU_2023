package headFirstJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("нет подходящей пары значений в массиве " + Arrays.toString(nums));
    }

    public static int[] twoSumFast(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("ищем в МАПе ключ: " + complement);
            if (map.containsKey(complement)) {
                System.out.println("Значение в ключе " + complement + " равно " + map.get(complement) + " при i = " + i);
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
            System.out.println("MAP: " + map);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));

//        System.out.println(Arrays.toString(twoSumFast(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSumFast(new int[]{3, 3}, 6)));
//        System.out.println(Arrays.toString(twoSumFast(new int[]{3, 5}, 6)));

        int[] result = twoSumFast(new int[]{3, 5}, 6);
        if (result.length == 0) {
            System.out.println("Пара не найдена");
        } else {
            System.out.println(Arrays.toString(result));
        }
//
//        try {
//            System.out.println(Arrays.toString(twoSumFast(new int[]{3, 3}, 6)));
//            System.out.println(Arrays.toString(twoSumFast(new int[]{3, 5}, 6)));   // выполнится
//            System.out.println(Arrays.toString(twoSumFast(new int[]{3, 7}, 6)));
//        } catch (IllegalArgumentException e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
    }
}
