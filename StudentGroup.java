package HW;

public class StudentGroup {
    private String name;

    public StudentGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "группа - " + name;
    }

}
