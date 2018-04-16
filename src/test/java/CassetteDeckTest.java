import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CassetteDeckTest {

    private CassetteDeck cassetteDeck1;
    private Stereo stereo1;
    private Radio radio1;

    @Before
    public void before(){
        radio1 = new Radio("Hitachi", "Model One");
        cassetteDeck1 = new CassetteDeck("Sony", "Walkman");
        stereo1 = new Stereo("Johnson", radio1, cassetteDeck1);

    }

    @Test
    public void hasMake(){
        assertEquals("Sony",cassetteDeck1.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Walkman",cassetteDeck1.getModel());
    }

    @Test
    public void hasTapeStatus(){
        assertEquals(false, cassetteDeck1.getTapeStatus());
    }

    @Test
    public void canFastForward(){
        assertEquals("I am fast forwarding.", cassetteDeck1.fastForward());
    }

    @Test
    public void canEject(){
        cassetteDeck1.eject();
        assertEquals(false, cassetteDeck1.getTapeStatus());
    }

    @Test
    public void canAddTape(){
        cassetteDeck1.addTape();
        assertEquals(true, cassetteDeck1.getTapeStatus());
    }

    @Test
    public void canConnect(){
        assertEquals("I am a cassette deck connected to Johnson", cassetteDeck1.connect(stereo1));
    }

}
