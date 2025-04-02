public class MaybePrint<T> {

    private final T value;

    public static <U> MaybePrint<U> some(U value){
        return new MaybePrint<U>(value);
    }

    public static <U> MaybePrint<U> none(){
        return new MaybePrint<U>(null);
    }

    private MaybePrint(T value) {
        this.value = value;
    }

    public boolean hasValue(){
        return value != null;
    }

    public T getValue(){
        return value;
    }
}