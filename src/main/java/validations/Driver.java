package validations;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Driver {
    @NotNull(message = "where is your name?")
    private String name;

    @Min(value = 18, message = "too young to be a driver")
    private int age;

    @AssertTrue(message = "So you are an alcoholist")
    private boolean alcoholist;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
