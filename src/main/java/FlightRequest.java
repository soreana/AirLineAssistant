/**
 * Created by Mashayekhi on 2/27/2017 AD.
 */
public class FlightRequest extends Request {
    FlightRequest(String origin, Destination destination, int leaveDay, int leaveMounth,
                  int leaveYear, int returnDay, int returnMount, int returnYear){

        super(origin,destination,leaveDay,leaveMounth,leaveYear,returnDay,returnMount,returnYear);
    }


}


