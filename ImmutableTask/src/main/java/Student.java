import java.util.Objects;

public final class Student {

    private final String name;
    private final String group;
    private final int age;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, String group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student person = (Student) obj;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(group, person.group);
    }

    @Override
    public int hashCode() {

        int result = 19;
        result = 33 * result + (name == null ? 0 : name.hashCode());
        result = 33 * result + (group == null ? 0 : group.hashCode());
        result = 33 * result + age;
        return result;
    }
}

