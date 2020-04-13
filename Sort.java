import java.util.*;
public class Sort{

    public static void main(String[] args) {
        ArrayList<String> artists = new ArrayList<String>();
        
        artists.add("Strawberry Milk Cult");
        artists.add("Harbour");
        artists.add("HUNNY");
        artists.add("Last Dinosaurs");
        artists.add("Lunar Vacation");
        artists.add("Hippo Campus"); 
        artists.add("No Vacation");
        artists.add("Oh My!");              
        artists.add("Peach Pit");
        artists.add("The Greeting Committee");
        artists.add("The Million");
        artists.add("Future Generations");  
        artists.add("Glass House Point");
        artists.add("The Wrecks");
        artists.add("Uppermost");
        artists.add("Wallows");
        artists.add("Remo Drive");
        artists.add("Rome Hero Foxes");
        artists.add("Bombay Bicycle Club"); 
        artists.add("courtship.");
        artists.add("Shoobies");
        
        

        selectionSort(artists);

        System.out.println(artists.toString());
    }

    public static void selectionSort(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){

            String smallest = list.get(i);
            int smallIndex = i;

            for(int j = i; j < list.size(); j++){

                if(list.get(j).compareToIgnoreCase(smallest) < 0){
                    smallest = list.get(j);
                    smallIndex = j;
                }

            }
            
            list.set(smallIndex, list.get(i));
            list.set(i, smallest);
        }
    }

    public static void insertionsSort(ArrayList<String> list){

    }

    public static void bubbleSort(ArrayList<String> list){

    }
}