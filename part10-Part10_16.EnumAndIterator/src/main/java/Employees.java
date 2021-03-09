
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Employees {
    List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        if(personToAdd != null) {
            this.list.add(personToAdd);
        }
    }
    
    public void add(List<Person> peopleToAdd) {
        for(Person person : peopleToAdd) {
            add(person);
        }
    }
    
    public void fire(Education education) {
        //using the iterator
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getEducation().ordinal() == education.ordinal()) {
                iterator.remove();
//                this.list.remove(iterator.next());
//                ConcurrentModificationException!!
                   
            } 
        }
        
    }
    
    
    public void print() {
//        this.list.stream()
//                .forEach(person -> System.out.println(person.toString()) );
// they want a use of the iterator
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while(iterator.hasNext()) {
            Person iteratorPerson = iterator.next();
            if(iteratorPerson.getEducation() == education) {
                System.out.println(iteratorPerson.toString());
            } 
        }
    }
    
}
