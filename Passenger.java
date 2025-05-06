public class Passenger implements PassengerRequirements {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    boardCar(Car c){
        c.addPassenger(this);
    }

    getOffCar(Car c){
        c.removePassenger(this);
    }
}

// I think I'm missing the requirement where boardCar() and getOffCar() check the boolean values returned by addPassenger() and removePassenger(). Not too sure how to do that.
