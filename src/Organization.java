public class Organization {
    private long id; // Value of field should be grader than 0, value of field should be unique and generate automatic
    private String name; // Field can't be null, String shouldn't be empty
    private long employeesCount; // Value of field should be grader than 0
    private OrganizationType type; // Field can't be null
    private Address officialAddress; // Field can't be null
}