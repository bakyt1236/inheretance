package person;

public class Footbalplayer extends Person {

    private String boots;

    public Footbalplayer() {
    }


    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    @Override
    public String toString() {
        return "Footbalplayer{" +
                "boots='" + boots + '\'' +
                super.toString() +
                '}';
    }
}

