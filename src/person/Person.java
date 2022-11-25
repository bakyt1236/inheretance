package person;

public class Person {

    private String Job;
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person() {

    }

    public Person(String job, String name, String surname, int age, String gender) {
        this.Job = job;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Job='" + Job + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender;
    }
}

