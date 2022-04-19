package day48_encapsulation.TicketFlight;

public class Flight {
//    Task
//            FlightTicket
//    instance variables:
//    type (first, business, economy)
//    departure location
//    arrival location
//
//    constructor: initialize all fields
//                -> only allow the given ticket types to be set
//
//    encapsulate all the fields

   private String type;
   private String departureLocation;
   private String arrivalLocation;

   public Flight(String type,String departureLocation, String arrivalLocation){
       setType(type);
       setDepartureLocation(departureLocation);
       setArrivalLocation(arrivalLocation);

   }

   public String getType(){
       return type;
   }
    public String getArrivalLocation(){
        return arrivalLocation;
    }
    public String getDepartureLocation(){
        return departureLocation;
    }
    public void setType(String type){
       switch (type.toLowerCase()){
           case "first":
           case "business":
           case "economy":this.type=type; break;
           default:
               System.out.println("Invalid input");
       }
    }

    public void setDepartureLocation(String departureLocation){
       this.departureLocation=departureLocation;
    }
    public void setArrivalLocation(String arrivalLocation){
        this.arrivalLocation=arrivalLocation;
    }

   public String toString(){
       return (type!=null?"Type: "+type:"")+"\n"+(arrivalLocation!=null?"Arrival location: "+arrivalLocation:"")+"\n"+(departureLocation!=null?"Departure location: "+departureLocation:"");

   }


}
