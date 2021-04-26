
import java.util.Map;
import java.util.TreeMap;
public class Frequency_Of_String_Words {
    
    // Function to count frequency of
    // words in the given string
    static void count_freq(String str)
    {
    	System.out.println("Mudit Arya R171219016");
    	Map<String,Integer> mp=new TreeMap<>();
 
        // Splitting to find the word
        String arr[]=str.split(" ");
 
        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        
        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry:
                    mp.entrySet())
        {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
    }
 
    // Driver Code
    public static void main(String[] args) {
        String str = "What are you trying to achieve in this paragraph and in your whole composition? What is your purpose right here? ";
 
        // Function Call
        count_freq(str);
    }
}
