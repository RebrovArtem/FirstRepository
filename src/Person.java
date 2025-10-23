import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 2850941593282398964L;
    private transient int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + ",name: " + name;
    }
}
