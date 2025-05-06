public class Engine implements EngineRequirements {
    double currentFuel;
    double maxFuel;
    private String FuelType;

    public Engine() {
        this.FuelType = FuelType;
        currentFuel = 100.0d;
        maxFuel = 100.0d;
    }
    private void refuel(){
        currentFuel = maxFuel;
    }

    private boolean go(){
        currentFuel = currentFuel - 25.0;
        System.out.println("Remaining fuel level: " + currentFuel);
        if (currentFuel > 0){
            return true;
      } else {
            return false;
      }
        
        
    }
}
