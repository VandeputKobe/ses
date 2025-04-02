package records;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class EmailTest {
    @Test
    public void email_address_is_stored(){
        var email = new Email("test@example.be");
        assertThat(email.address()).isEqualTo("test@example.be");
    }

    @Test
    public void reject_null(){
        assertThatNullPointerException().isThrownBy(() -> new Email(null));
    }

    @Test
    public void requires_at_least_one_at(){
        assertThatIllegalArgumentException().isThrownBy(() -> new Email("testexample.com"));
    }

    @Test
    public void reject_more_than_one_at(){
        assertThatIllegalArgumentException().isThrownBy(() -> new Email("test@ex@ample.com"));
    }

    @Test
    public void reject_not_com_be(){
        assertThatIllegalArgumentException().isThrownBy(() -> new Email("test@example.org"));
    }
}
