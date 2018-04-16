public class CassetteDeck extends Components implements IConnect{

    private boolean tapeStatus;

    public CassetteDeck(String make, String model){
        super(make, model);
        this.tapeStatus = false;
    }

    public boolean getTapeStatus() {
        return this.tapeStatus;
    }

    public String fastForward(){
        return "I am fast forwarding.";
    }

    public void eject(){
        this.tapeStatus = false;
    }

    public void addTape(){
        this.tapeStatus = true;
    }

    public String connect(Stereo stereo){
        return "I am a cassette deck connected to " +stereo.getName();
    }

}
