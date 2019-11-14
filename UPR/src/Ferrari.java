import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ferrari implements Car {
    String model = "488-Spider";
    String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String gas() {
        return  "Zadu6avam sA!";
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String toString() {
       return this.model + "/" +brakes()+"/"+gas()+"/"+this.driver;
    }
}
