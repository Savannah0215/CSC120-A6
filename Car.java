import java.util.ArrayList;

public class Car implements CarRequirements {
    private ArrayList<Passenger> passengers = new ArrayList<String>();
    private int maxCapacity;

    public Car(){
      maxCapacity = 7;  
    }

    public int getCapacity(){
      return maxCapacity;
    }

    public int seatsRemaining(){
      return maxCapacity - passengers.size();
    }

    private boolean addPassenger(Passenger p){
      if (passengers.size() >= maxCapacity){
        return false;
        
      } else if (passengers.contains(p)){
        return false;
        
      } else {
        passengers.add(p);
        return true;
      }
    }

    private boolean removePassenger(Passenger p){
      if (passengers.contains(p)){
        passengers.remove(p);
        return true;
        
      } else {
        return false;
      }
    }

    private void printManifest(){
      if (passengers.size() == 0) {
        System.out.println("This car is EMPTY.");
    } else {
        System.out.println(passengers.toString());
      }
}
