package id.netzme;

/**
 * Created by andreas on 5/19/16.
 */
public class Pair {

    private final String name;
    private final Integer count;

    public Pair(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + count;
    }
}
