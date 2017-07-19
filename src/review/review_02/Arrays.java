package review.review_02;


public class Arrays {

    public static void main(String[] args) {
        int [] values1 = new int [10];
        int [] values2 = new int [] {22, 3, 6, 33};

         values1[5]= 45;

//        for (int i = 0; i < values1.length; i = i + 1)
//            System.out.println(values1[i]);
//
//        for (int i = 0; i < values2.length; i = i + 1)
//            System.out.println(values2[i]);

        // enhanced loop for a simple loops where you just want to run through all of the values.
        for(int i : values2){
            System.out.println(i);
        }

    }



}
