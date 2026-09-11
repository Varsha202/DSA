import java.util.*;

class Solution {
    public int totalNumbers(int[] d) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                for (int k = 0; k < d.length; k++) {
                    if (i == j || i == k || j == k)
                        continue;
                    if (d[i] == 0)
                        continue;
                    if (d[k] % 2 != 0)
                        continue;
                    int num = d[i] * 100
                            + d[j] * 10
                            + d[k];

                    set.add(num);
                }
            }
        }
        return set.size();
    }
}