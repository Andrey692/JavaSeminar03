package HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;
    private String name;

    public Stream(String name) {
        this.name = name;
        groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudentGroup(StudentGroup group) {
        groups.add(group);
    }

    public List<StudentGroup> getgroups() {
        return groups;
    }

    public void setgroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);

    }

    public int size() {
        return groups.size();
    }

}
