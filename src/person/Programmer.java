package person;

public class Programmer extends Person {

    private String laptop;

    public Programmer() {
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "laptop='" + laptop + '\'' +
                super.toString() +
                '}';
    }
}

