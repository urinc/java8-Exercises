public class Car {

    private String name;

    @Override
    public String toString() {
        return name;
    }

    Car(String name) {
        this.name = name;
    }

    public int length() {
        return name.length();
    }


}
