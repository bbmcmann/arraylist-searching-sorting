import java.util.*;

public class Search{
    public static void main(String[] args) {
        ArrayList<String> artists = new ArrayList<String>();
        artists.add("Bombay Bicycle Club");
        artists.add("courtship.");
        artists.add("Future Generations");
        artists.add("Glass House Point");
        artists.add("Harbour");
        artists.add("Hippo Campus");
        artists.add("HUNNY");
        artists.add("Last Dinosaurs");
        artists.add("Lunar Vacation");
        artists.add("No Vacation");
        artists.add("Oh My!");
        artists.add("Peach Pit");
        artists.add("Remo Drive");
        artists.add("Rome Hero Foxes");
        artists.add("Shoobies");
        artists.add("Strawberry Milk Cult");
        artists.add("The Greeting Committee");
        artists.add("The Million");
        artists.add("The Wrecks");
        artists.add("Uppermost");
        artists.add("Wallows");

        System.out.println(search(artists, "Shoobies"));
        System.out.println(search(artists, "Red Hot Chili Peppers"));

    }
    
    public static int search(ArrayList<String> haystack, String needle){
        for(int i = 0; i < haystack.size(); i++){
            if(haystack.get(i).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static int  binarySearch(){
        return -1;
    }
}
