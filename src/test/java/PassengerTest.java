import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;



public class PassengerTest {

Passenger george;
    @BeforeEach
    public void setUp() {
        george = new Passenger("George", 071234567, "A123");


    }
    @Test
    public void hasName(){
        assertThat(george.getName()).isEqualTo("George");
    }


}
