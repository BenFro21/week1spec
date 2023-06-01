import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Expidition prep program starting");
        System.out.println("Thinking");
        System.out.println("Thinking");
        System.out.println("Thinking");
        System.out.println("Ready... to... begin...");

        System.out.println("Hello what is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " Are you ready to begin? type yes or no");
        String answer = input.nextLine();
        if(answer.equals( "yes")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }else {
            System.out.println("Too bad you are team leader. You have to go");
        }

        System.out.println("How many people do you want in your team?");
        int teamSize = input.nextInt();
        if(teamSize > 2){
            System.out.println("Woah woah woah, we can only take 2 passingers");
            teamSize = 2;
        }else if(teamSize < 2){
            System.out.println(("Woah man we need more then that"));
            teamSize =2;
        } else if (teamSize == 2) {
            System.out.println("Perfict size!");
        }

        System.out.println("What snack would you like to bring? you can bring one snack");
        String snacks = input.nextLine();
        System.out.println("Great choice! store your " + snacks + " in the trunk");

        System.out.println("You have a choice of three vheicals " +
                "\nA: A Mars Rover" +
                "\nB: The bat Mobile" +
                "\nC: superman");
        String vehical = input.nextLine();
        if(vehical.equalsIgnoreCase("A")){
            vehical = "a Mars Rover";
        }else if(vehical.equalsIgnoreCase("B")){
            vehical = "the bat mobile";
        } else if (vehical.equalsIgnoreCase("C")) {
            vehical = "Superman";
        }else{
            System.out.println("Invalad option");
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with a team of  " + teamSize +
                "\nTo explore Mars using " + vehical + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}


