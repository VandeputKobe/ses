import java.util.Iterator;

public class IntRangeIterator implements Iterator<Integer> {
    private int start;
    private int end;
    private int current;

    public IntRangeIterator(int start, int end) {
        this.start = start;
        this.end = end;
        this.current = start;
    }

    @Override
    public boolean hasNext() {
        return current < end;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalArgumentException("No more elements");
        }
        current = current + 1;
        return current;
    }
}
