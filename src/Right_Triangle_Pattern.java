//    *
//    * *
//    * * *
//    * * * *
public class Right_Triangle_Pattern {
    public static void main(String[] args){
        for(int i=1; i<5; i++){        //outer for loop- decides number of rows
            for(int j=1; j<=i; j++){    //inner for loop- decides number of * in each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
