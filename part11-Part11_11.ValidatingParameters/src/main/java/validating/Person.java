package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if( name != null && (!name.equals("")) && name.length() <= 40 && age <= 120 && age >=0) {
            this.name = name;
            this.age = age;
        } else {
            throw new IllegalArgumentException(" Parameters passed ar not correct");
        }
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
