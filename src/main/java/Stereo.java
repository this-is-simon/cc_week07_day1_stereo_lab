public class Stereo {

    private String name;
    private Radio radio1;
    private CassetteDeck cassetteDeck1;

    public Stereo(String name, Radio radio1, CassetteDeck cassetteDeck1){
        this.name = name;
        this.radio1 = radio1;
        this.cassetteDeck1 = cassetteDeck1;
    }

    public String getName(){
        return this.name;
    }

    public String playCassetteDeck(){
        return cassetteDeck1.play();
    }

}
