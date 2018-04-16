import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    private Radio radio1;
    private CassetteDeck cassetteDeck1;
    private Stereo stereo1;

    @Before
    public void before(){
        radio1 = new Radio("Hitachi", "Model One");
        cassetteDeck1 = new CassetteDeck("Sony", "Walkman");
        stereo1 = new Stereo("Johnson", radio1, cassetteDeck1);
    }

    @Test
    public void canGetMake(){
        assertEquals("Hitachi", radio1.getMake());
    }

    @Test
    public void canTune(){
        assertEquals("I am tuning to Radio 6", radio1.tune("Radio 6"));
    }

    @Test
    public void canConnect(){
        assertEquals("I am a radio connected to Johnson", radio1.connect(stereo1));
    }

}
