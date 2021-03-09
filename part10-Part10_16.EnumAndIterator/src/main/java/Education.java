
/**
 *
 * @author Miguel
 */
public enum Education {
    PHD("PHD"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");
    
    private String degree;        // object reference variable

    private Education (String degree) { // constructor
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }
    
}
