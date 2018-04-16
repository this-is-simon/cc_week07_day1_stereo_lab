import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Radio radio;
    private CassetteDeck cassetteDeck;

    @Before
    public void before(){
        radio = new Radio("Sonry", "Walkbox");
        cassetteDeck = new CassetteDeck("Hotachlet", "Modelo Unoxus");
        stereo = new Stereo("Johnson", radio, cassetteDeck);
    }

    @Test
    public void hasMake(){
        assertEquals("Johnson", stereo.getName());
    }

    @Test
    public void canPlayCassetteDeck(){
        assertEquals("I am playing.", stereo.playCassetteDeck());
    }

}
