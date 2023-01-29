package GenericClass;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer,Integer > myIntegerClass = new MyGenericClass<>(1, 2);
        MyGenericClass<Double, Double> myDoubleClass= new MyGenericClass<>(5.5, 4.0);
        //MyGenericClass<Character, Character> myCharacterclass = new MyGenericClass<>('H', 'A');
        //MyGenericClass<String, String> mystringClass = new MyGenericClass<>("Hello", "Alfa");


        System.out.println(myIntegerClass.getX());
        System.out.println(myDoubleClass.getX());
       // System.out.println(myCharacterclass.getX());
       // System.out.println(mystringClass.getX());
    }
}
