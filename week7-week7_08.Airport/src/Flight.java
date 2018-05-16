public class Flight {

    private String departure;
    private String arrival;

    public Flight(String departure,String arrival){
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public String toString(){
        String flight = String.format("(%s-%s)",departure,arrival);
        return flight;
    }
}
