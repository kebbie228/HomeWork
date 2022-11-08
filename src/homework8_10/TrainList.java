package homework8_10;

import homework8_2.Customers;
import homework8_2.CustomersList;

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

}
