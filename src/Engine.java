public class Engine {

    String enginesType;
    String enginePower;

    public Engine(String enginesType, String enginePower){
        this.enginesType=enginesType;
        this.enginePower=enginePower;

    }
    public String toString(){
        return enginesType + enginePower;
    }
}
