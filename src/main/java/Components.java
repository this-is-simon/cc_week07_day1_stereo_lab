public abstract class Components {

    private String make;
    private String model;

    public Components(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public String play(){
        return "I am playing.";
    }

    public String stop(){
        return "I have stopped.";
    }

}