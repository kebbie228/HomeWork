package homework8_10;

public class train_10 {
    public static void main(String[] args) {
    Train train1 = new Train("Vitebsk", 305, "13:51", 212);
    Train train2 = new Train("Minsk", 503, "02:13", 373);
    Train train3 = new Train("Moscow", 777, "23:23", 622);
    Train train4 = new Train("Orsha", 13, "06:41", 100);
    Train train5 = new Train("Saint-Petersburg", 101, "10:10", 605);
    Train train6 = new Train("Brest", 185, "07:37", 137);
    Train train7 = new Train("Brest", 394, "09:54", 137);
    Train train8 = new Train("Minsk", 831, "08:32", 373);
    Train train9 = new Train("Minsk", 831, "23:32", 373);
    TrainList trainList = new TrainList();
    trainList.addTrain(train1);
    trainList.addTrain(train2);
    trainList.addTrain(train3);
    trainList.addTrain(train4);
    trainList.addTrain(train5);
    trainList.addTrain(train6);
    trainList.addTrain(train7);
    trainList.addTrain(train8);
    trainList.addTrain(train9);

    //trainList.trainPrintf();
   //trainList.trainDestination("Minsk"); //trains whose move to destination
  // trainList.trainTimeDestination("Brest","03:00");// trains moving towards their destination after time

    }

}
