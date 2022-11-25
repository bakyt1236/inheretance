package person;

public class Singer extends Person {

    private String national;

    public Singer() {
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "national='" + national + '\'' +
                super.toString() +
                '}';
    }
}




