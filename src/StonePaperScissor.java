import java.util.Scanner;

public class StonePaperScissor {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            String x1="";


            while(true){
                int robot1= (int) (Math.random()*3) +1;
                switch (robot1){
                    case 1: x1="stone";break;
                    case 2: x1="paper";break;
                    case 3: x1="Scissor";break;
                }
                System.out.println(x1);
                int robot2= (int) (Math.random()*3) +1;
                switch (robot2){
                    case 1: x1="stone";break;
                    case 2: x1="paper";break;
                    case 3: x1="Scissor";break;
                }
                System.out.println(x1);
                if(robot1==robot2) System.out.println("draw");
                else if((robot1==1 && robot2==3) || (robot1==2 &&robot2==1) || (robot1==3 && robot2==2) ){
                    System.out.println("robot1 won");}
                else System.out.println("robot2 won");
                try {
                    int secondsToSleep = 1;
                    Thread.sleep(secondsToSleep * 2500);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }

    }
