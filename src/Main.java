import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Tom"), new Person(2, "Bob"),new Person(3, "Tim")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Test.bin"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.bin"))){

            oos.writeObject(people);
            System.out.println("Объекты записаны в файл");

            Person[] people2 = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people2));

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}