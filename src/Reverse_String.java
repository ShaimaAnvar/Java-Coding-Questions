public class Reverse_String {
    public static void main(String[] args){
        String name="malayalam";
        String namereversed="";
        for(int i=name.length()-1; i>=0; i--){
            namereversed=namereversed+name.charAt(i);
        }
        System.out.println(namereversed);
        if(name.equals(namereversed)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
