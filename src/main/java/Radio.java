public class Radio extends Components implements IConnect{

    private String waveLength;

    public Radio(String make, String model){
        super(make, model);
        this.waveLength = "White noise";
    }


    public String tune(String radioStation){
        return "I am tuning to " + radioStation;
    }

    public String connect(Stereo stereo){
        return "I am a radio connected to " +stereo.getName();
    }

}
