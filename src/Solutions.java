
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author shana
 */
public class Solutions {

    private static int fibonaci(int n) {
        int value = 0;
        for (int i = 1; i < n; i++) {
            value += i;
        }
        return value;
    }

    private static List<Integer> sort(int a, int b, int c) {
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(a);
        tmp.add(b);
        tmp.add(c);
        Collections.sort(tmp);
        return tmp;
    }

    private static List<List<Integer>> getGroupOfTwo(int[] nums) {
        final HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        final List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> tmp = new ArrayList<>();
                for (int k = 0; k < nums.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if ((nums[k] + nums[i] + nums[j]) == 0) {
                        tmp = sort(nums[i], nums[j], nums[k]);
                        set.add(tmp);
                        break;
                    }
                }
            }
        }
        Iterator<List<Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

//    private List<List<Integer>> getGroupOfThree(int[] nums) {
//        final List result = new ArrayList<List<Integer>>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            List<List<Integer>> tmp2 = getGroupOfTwo(nums, i + 1);
//            for (List<Integer> t : tmp2) {
//                ArrayList<Integer> tmp = new ArrayList<>();
//                tmp.add(nums[i]);
//                tmp.add(t.get(0));
//                tmp.add(t.get(1));
//                result.add(tmp);
//            }
//        }
//        return result;
//    }
    private static HashSet<List<Integer>> filterDuplicateGroup(HashSet<List<Integer>> list) {
        int i = 0;
        int j = 1;
//        List<Integer> tmp5 = new ArrayList<Integer>();

        Iterator<List<Integer>> iter = list.iterator();
        while (iter.hasNext()) {
            j = i + 1;
            while (j < list.size()) {
                ArrayList<Integer> tmp5 = (ArrayList<Integer>) iter.next();
                List<Integer> tmp = new ArrayList<Integer>();
                for (int k = 0; k < tmp5.size(); k++) {
                    tmp.add(tmp5.get(k));
                }
                List<Integer> tmp2 = iter.next();
                tmp.remove(tmp2.get(0));
                tmp.remove(tmp2.get(1));
                tmp.remove(tmp2.get(2));
                if (tmp.isEmpty()) {
                    list.remove(tmp2);
                    continue;
                }
                j++;
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
//        int[] nums = {34, 55, 79, 28, 46, 33, 2, 48, 31, -3, 84, 71, 52, -3, 93, 15, 21, -43, 57, -6, 86, 56, 94, 74, 83, -14, 28, -66, 46, -49, 62, -11, 43, 65, 77, 12, 47, 61, 26, 1, 13, 29, 55, -82, 76, 26, 15, -29, 36, -29, 10, -70, 69, 17, 49};
//        Set<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            set.add(i);
//        }
//        System.out.println(nums.length);
//        int[] newNums = new int[set.size()];
//        Iterator<Integer> iter = set.iterator();
//        int count = 0;
//        while (iter.hasNext()) {
//            newNums[count] = iter.next();
//            count++;
//        }

//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {34, 55, 79, 28, 46, 33, 2, 48, 31, -3, 84, 71, 52, -3, 93, -14, 28, -66, 46, -49, 62, -11, 43, 65, 77, 12, 47, 61, 26, 1, 13, 29, 55};
        int[] nums2 = {66, -49, -14, -11, -3, 1, 2, 12, 13, 26, 28, 29, 31, 33, 34, 43, 46, 47, 48, 52, 55, 61, 62, 65, 71, 77, 79, 84, 93,};
        var result = getGroupOfTwo(nums2);
//        result = filterDuplicateGroup(result);
        System.out.println(result);
        System.out.println(result.size());
//        Iterator<Integer> iter3 = set.iterator();
//        while (iter3.hasNext()) {
//            System.out.println(iter3.next());
//        }
    }
}
