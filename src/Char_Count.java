//Count occurance of each character in a string
import java.util.LinkedHashMap;
import java.util.Map;
public class Char_Count {
    public static void main(String[] args){
        String text = "automation";
        Map<Character, Integer> freqMap = new LinkedHashMap<Character,Integer>();
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            if(freqMap.containsKey(c)){
                freqMap.put(c, freqMap.get(c)+1);
            }else{
                freqMap.put(c, 1);
            }
        }
        System.out.println(freqMap);
    }
}
