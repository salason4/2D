package Generics;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5,6};
        Double[] doublearray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'O'};
        String[] stringArray = {"B", "Y","E"};

        //displayarray(intArray);
        //displayarray(doublearray);
        //displayarray(charArray);
        // displayarray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doublearray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

    }
    public  static <Thing> void displayarray (Thing[] array){
        for ( Thing x : array ){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
    public  static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }
}
