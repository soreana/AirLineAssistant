/**
 * Created by Mashayekhi on 2/27/2017 AD.
 */
public class Request {
    protected String origin;
    protected Destination destination;
    protected int leaveDay , leaveMounth , leaveYear;
    protected int returnDay , returnMount , returnYear;

    public Request(String origin, Destination destination, int leaveDay,
                   int leaveMounth, int leaveYear, int returnDay,
                   int returnMount, int returnYear) {
        this.origin = origin;
        this.destination = destination;
        this.leaveDay = leaveDay;
        this.leaveMounth = leaveMounth;
        this.leaveYear = leaveYear;
        this.returnDay = returnDay;
        this.returnMount = returnMount;
        this.returnYear = returnYear;
    }



}
