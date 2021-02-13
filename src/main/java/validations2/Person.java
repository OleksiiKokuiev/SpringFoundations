package validations2;

public class Person implements CustomValidation {

    //@CheckCase(groups = CustomValidation.class, value = CaseType.UPPER_CASE, message = "manager must have upperCase name")
    @ManagerName
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
