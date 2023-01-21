import java.math.BigDecimal;

public class Class_B extends Class_A{

    private String address;
    private Integer zipcode;
    private BigDecimal amount;

    public Class_B(String name, String lastName, Integer age,
                   String address, Integer zipcode, BigDecimal amount) {

        super(name, lastName, age);
        this.address = address;
        this.zipcode = zipcode;
        this.amount = amount;
    }
}