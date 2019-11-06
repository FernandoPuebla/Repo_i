package Application;

import java.util.*;

class Person implements Comparable<Person>
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person person) {
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

       Collections.sort(list);

        showElements(list);
        System.out.println();
        System.out.println(set);

    }

    public static void addElements(Collection<Person> col)
    {
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mike"));
    }

    public static void showElements(Collection<Person> col)
    {
        for (String element: col)
        {
            System.out.println(element);
        }
    }
}
