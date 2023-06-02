import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {

    private final List<Integer> internalList;
    private final Set<Integer> sum3set;


    public Sum3() {
        internalList = new ArrayList<>();
        sum3set = new HashSet<>();
    }

    /**
     * Adds/appends list of integers at the end of internal list.
     */
    public void addLast(int[] list) {
        for (int i = 0; i < list.length; i++) {
            internalList.add(list[i]);
            if (internalList.size() >= 3) {
                sum3set.add(internalList.get(internalList.size() - 1) + internalList.get(internalList.size() - 2) + internalList.get(internalList.size() - 3));
            }
        }
        for (int value : list) internalList.add(value);
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given sum.
     */
    public boolean containsSum3(int sum) {
        if (internalList.size() < 3)
            return false;

        return sum3set.contains(sum);
    }

    public static void main(String[] args) {
        Sum3 s = new Sum3();

        s.addLast(new int[]{1, 2, 3});

        System.out.println(s.containsSum3(6));
        System.out.println(s.containsSum3(9));

        s.addLast(new int[]{4});

        System.out.println(s.containsSum3(9));
        System.out.println(s.containsSum3(6));
    }
}
