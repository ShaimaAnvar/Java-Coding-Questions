//* * * *
//* * *
//* *
//*
public class Inverted_Right_Triangle {
    public static void main(String[] args){
        for(int i=1; i<5; i++){   //controls rows
            for(int j=4; j>=i; j--){  //controls stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
