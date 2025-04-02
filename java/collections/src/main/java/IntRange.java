import java.util.Iterator;

public record IntRange(int start, int end) implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new IntRangeIterator(start, end);
    }

    private static class IntRangeIterator implements Iterator<Integer> {
        private int current;
        private final int end;

        public IntRangeIterator(int start, int end) {
            this.current = start;
            this.end = end;
        }

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Integer next() {
            return current++;
        }
    }
}
