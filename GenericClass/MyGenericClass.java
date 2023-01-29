package GenericClass;

public class MyGenericClass <Thing extends Number, Thing2>{
    Thing2 y;
    Thing x;
    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getX() {
        return y;
    }
}
