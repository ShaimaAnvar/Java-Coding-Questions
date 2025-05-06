import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
    public static void main(String[] args){
        int[] a= {1,2,2,3,4,3,2,5,6};
        Set<Integer> unique= new HashSet<Integer>();
        for(int num: a){
            unique.add(num);
        }
        System.out.println(unique);
    }
}
