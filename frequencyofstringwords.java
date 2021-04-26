import java.util.Map;
import java.util.TreeMap;
public class frequencyofstringwords {
    static void count_freq(String str)
    {
    	System.out.println("MUDIT ARYA 16");
    	Map<String,Integer> mp=new TreeMap<>();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry:
                    mp.entrySet())
   {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
    }
 
    public static void main(String[] args) {
        String str = "What are you trying to achieve in this paragraph and in your whole composition? What is your purpose right here? ";
        count_freq(str);
    }
}
