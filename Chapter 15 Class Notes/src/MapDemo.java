import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /* 
            The Map interface is a generic. The first type is the type
                of the key; the second, the type of the value.
        */
        Map<String, Color> favoriteColors = new HashMap<>();

        favoriteColors.put("Brian", Color.RED);
        favoriteColors.put("Minghan", Color.ORANGE);
        favoriteColors.put("Dylan", Color.BLUE);
        favoriteColors.put("Daniel", Color.MAGENTA);
        favoriteColors.put("Robert", Color.CYAN);

        // two different keys can have the same value
        favoriteColors.put("Schmit", Color.MAGENTA);

        // but the same key cannot have two different values
        // this changes the value for the key "Daniel"
        favoriteColors.put("Daniel", Color.RED);   

        // create a set of the keys in the map
        Set<String> keySet = favoriteColors.keySet();

        for(String key : keySet)
        {
            System.out.println(key + " (" + key.hashCode() + "): " +
                    favoriteColors.get(key));
        }



    
    }
}
