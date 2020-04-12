import java.util.*;

public class Search{
    public static void main(String[] args) {
        ArrayList<String> artists = new ArrayList<String>();
        artists.add("Bombay Bicycle Club"); //index 0
        artists.add("courtship.");
        artists.add("Future Generations");  //index 2
        artists.add("Glass House Point");
        artists.add("Harbour");
        artists.add("Hippo Campus");        //index 5
        artists.add("HUNNY");
        artists.add("Last Dinosaurs");
        artists.add("Lunar Vacation");
        artists.add("No Vacation");
        artists.add("Oh My!");              //index 10
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
        //21 items here
        //10
        System.out.println("Regular search");
        System.out.println(search(artists, "Shoobies"));
        System.out.println(search(artists, "Red Hot Chili Peppers"));

        System.out.println("Binary Search");
        System.out.println(binarySearch(artists, "Oh My!"));
        System.out.println(binarySearch(artists, "Hippo Campus"));
        System.out.println(binarySearch(artists, "Uppermost"));
        System.out.println(binarySearch(artists, "Bombay Bicycle Club"));
        System.out.println(binarySearch(artists, "Wallows"));
        System.out.println(binarySearch(artists, "Twenty One Pilots"));
    }
    
    public static int search(ArrayList<String> haystack, String needle){
        for(int i = 0; i < haystack.size(); i++){
            if(haystack.get(i).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<String> haystack, String needle){
        int start = 0;
        int finish = haystack.size()-1;

        while(start <= finish){
            int middle = (start + finish)/2;
            if(haystack.get(middle).equals(needle)){
                return middle;
            }
            else if(haystack.get(middle).compareTo(needle) < 0){
                start = middle + 1;
            }
            else{
                finish = middle -1;
            }
        }

        return -1;
    }
}
