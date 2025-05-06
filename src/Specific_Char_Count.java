//count the occurence of a specific character in a string
public class Specific_Char_Count {
    public static void main(String[] args){
        int p_count = char_count("apple", 'p');
        System.out.println(p_count);
    }
    public static int char_count(String word, char character){
        int count =0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == character){
                count++;
            }
        }
        return count;
    }
}
