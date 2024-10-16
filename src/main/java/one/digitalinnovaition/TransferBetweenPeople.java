package one.digitalinnovaition;

public class TransferBetweenPeople {

    public void transfer(Person person1, Person person2, int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
    }
}
