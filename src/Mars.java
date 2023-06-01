

public class Mars {

    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Red Dawn";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(5);
        double landingMeals = meals - ((shipPopulation * 0.75)*2);
        landingMeals = landingMeals + (landingMeals * 0.5);
        System.out.println(landingMeals);
        shipPopulation += 5;
        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain") ){
            System.out.println("Bbzzz Landing on the Plain");
        } else  {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
//        new GuessingGame();
        new MarsExpedition();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minutes = 0; minutes <= minutesLeft; minutes++){
            if((minutes % 3 == 0) && (minutes % 2 ==0)){
                System.out.println("Keep Center");
            }else if (minutes % 3 == 0){
                System.out.println("Left");
            }else if (minutes % 2 == 0) {
                System.out.println("Right");
            }else {
                System.out.println("Calculateing");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
     return false;
    }

}
