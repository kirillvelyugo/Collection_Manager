public class Product {
    private Long id; // Filed can't be null, Value of field should be grader than 0, value of field should be unique and generate automatic
    private String name; // Filed can't be null, and String shouldn't be empty
    private Coordinates coordinates; // Field can be null
    private java.time.LocalDateTime creationDate; // Field can't be null, value generations automatic
    private Double price; // Field can't be null, Value of field should be grader than 0
    private String partNumber; // Field can be null
    private UnitOfMeasure unitOfMeasure; // Field can be null
    private Organization manufacturer; // Field can be null
}