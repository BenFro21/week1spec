import java.util.*;
import java.util.ArrayList;


public class FindingList {
    public FindingList () throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        Thread.sleep(500);
        System.out.println("Welcome back to the mars expidition");
        ArrayList<String> rocksArray = new ArrayList<String>();
        rocksArray.add("rock");
        rocksArray.add("weird rock");
        rocksArray.add("smooth rock");
        rocksArray.add("not rock");
        Thread.sleep(500);
        System.out.println("Everything downloaded rocks list ready....");
        Thread.sleep(500);
        System.out.println(rocksArray);
        System.out.println("There is a non rock in the system please remove");
        Thread.sleep(500);
        rocksArray.remove("not rock");
        Thread.sleep(500);
        System.out.println("I took care of the non rock the new array is " + rocksArray);

        HashMap <String, String> fossils = new HashMap<String, String>();
        fossils.put("birdFossil", "The fossil has wings implying it was capable of flight");
        fossils.put("fishFossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("toothFossil", " The tooth from an unknown fossil");
        Thread.sleep(1000);
        System.out.println("Fossil Data downloaded");
        Thread.sleep(1000);
        System.out.println("What fossil would you like to learn more about? A: bird, B:Fish, C:Tooth");
        Thread.sleep(1000);
        String response = scan.nextLine();
        if(response.equalsIgnoreCase("A")){
           System.out.println(fossils.get("birdFossil"));
        } else if (response.equalsIgnoreCase("B")) {
            System.out.println(fossils.get("fishFossil"));
        }else if(response.equalsIgnoreCase("B")){
            System.out.println(fossils.get(("toothFossil")));
        }else{
            System.out.println("Please enter a correct response");
        }
        Thread.sleep(1000);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Ray gun");
        supplies.add("A fan");
        supplies.add("Anti Marshin spray");

        supplies.remove("Ray gun");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println("Supplies After Expedition 1 " + itr.next());
        }

    }
}
