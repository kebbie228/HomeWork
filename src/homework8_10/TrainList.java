package homework8_10;

import java.util.ArrayList;
import java.util.List;

public class TrainList {
    private List<Train> TrainList=new ArrayList<>();
    public void addTrain(Train a) {TrainList.add(a);}
    public void trainPrintf(){
        System.out.println("List of train:");
        for(Train train:TrainList)
            System.out.println(train.toString());
    }
    public void trainDestination(String destination){
        System.out.println("List of trains moving towards their destination:"+destination);
        for(Train train:TrainList)
            if(train.getDestination().equals(destination))
            System.out.println(train.toString());
    }
    public void trainTimeDestination( String destination,String departureTime) {
        System.out.println("List of trains moving towards their destination:" + destination + " after " + departureTime);
        for (Train train : TrainList){
            if (train.getDestination().equals(destination) && IntegerTime(train.getDepartureTime().substring(0, 2)) >= IntegerTime(departureTime))
                System.out.println(train.toString());
            else if (train.getDestination().equals(destination) && IntegerTime(train.getDepartureTime().substring(0, 2)) > 0 && IntegerTime(train.getDepartureTime().substring(0, 2)) <= IntegerTime(departureTime))
                System.out.println(train.toString());
    }

    }
    public int IntegerTime(String departureTime){
         return Integer.parseInt(departureTime.substring(0,2));
    }

}
