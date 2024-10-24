// Violates SRP: The class handles both user management and report generation
public class User1 {
    private String name;
    private String email;

    public void save() {
        // code to save user to database
    }

    public void generateReport() {
        // code to generate user report
    }
}
