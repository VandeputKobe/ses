import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class MaybePrintTest {
    @Test
    public void maybeWithValue() {
        MaybePrint<String> maybe = MaybePrint.some("Yes");
        assertThat(maybe.hasValue()).isTrue();
        assertThat(maybe.getValue()).isEqualTo("Yes");
    }

    @Test
    public void maybeWithoutValue() {
        MaybePrint<String> maybe = MaybePrint.none();
        assertThat(maybe.hasValue()).isFalse();
        assertThat(maybe.getValue()).isNull();
    }
}
