package homework8_10;

public class train_10 {
    public static void main(String[] args) {
    Train train1 = new Train("Vitebsk", 305, "13:13", 212);
    Train train2 = new Train("Minsk", 503, "02:43", 373);
    Train train3 = new Train("Moscow", 777, "23:51", 622);
    Train train4 = new Train("Orsha", 13, "06:01", 100);
    Train train5 = new Train("Saint-Petersburg", 101, "10:10", 605);
    Train train6 = new Train("Brest", 185, "07:10", 137);
    TrainList trainList = new TrainList();
    trainList.addTrain(train1);
    trainList.addTrain(train2);
    trainList.addTrain(train3);
    trainList.addTrain(train4);
    trainList.addTrain(train5);
    trainList.addTrain(train6);
    trainList.trainPrintf();
    }

}
