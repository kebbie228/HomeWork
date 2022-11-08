package homework8_10;

public class Train { //Пункт назначения, Номер поезда, Время отправления, Число мест(общих, купе, плацкарт, люкс).
        private String destination;
        private int trainNumber;
        private String departureTime;

        private int generalSeats;

        public Train( String destination,int trainNumber, String departureTime, int generalSeats) {
            this.destination = destination;
            this.trainNumber = trainNumber;
            this.departureTime = departureTime;
            this.generalSeats = generalSeats;
          /*
            setDestination(destination);
            setTrainNumber(trainNumber);
            setDepartureTime(departureTime);
            setSurName(surName);
            setGeneralSeats(generalSeats);


           */
        }
public String getDestination(){return destination;}
public void setDestination(String destination) {this.destination = destination;}

public int getTrainNumber(){return trainNumber;}
public void setTrainNumber(int trainNumber) {this.trainNumber = trainNumber;}

public String getDepartureTime(){return departureTime;}
public void setDepartureTime(String departureTime) {this.departureTime = departureTime;}

public int getGeneralSeats(){return generalSeats;}
public void setGeneralSeats(int generalSeats) {this.generalSeats = generalSeats;}

    public String toString() {
        return "Student {"+"destination " +destination+
                ", trainNumber='" + trainNumber + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", generalSeats='" + generalSeats + '\'' +
                '}';
    }
}
