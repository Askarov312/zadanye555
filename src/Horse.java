public class Horse extends Animal{
    private String horseName;

    public Horse(String horseName, String food, String location) {
        super(food, location);
        this.horseName = horseName;
    }


    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    public void sleep() {
        System.out.println("Horse is slepping!");
    }

    @Override
    public void makeNoise() {
        System.out.println("igo-go-go");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating!");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + horseName + '\'' +
                "} " + super.toString();
    }
}

