package day07.solved;
import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeSet {
 
    public static void main(String[] args) {
 
        // TreeSet sorts the collections
        HashSet<String> cityNames = new HashSet<String>();
        cityNames.add("Delhi");
        cityNames.add("Chennai");
        cityNames.add("Bangalore");
        TreeSet<Integer> cityName = new TreeSet<Integer>();
        cityName.add(5);
        cityName.add(55);
        cityName.add(8);
//        for (String cityName : cityNames) {
//            System.out.println(cityName);
//        }
        System.out.println(cityNames);
        System.out.println(cityName);
         
         
    }
 
}