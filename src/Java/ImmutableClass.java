package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class must declare as final
public final class ImmutableClass {

    // All properties must be private and final
    private final String name;
    private final int age;
    // For this we need to implement Cloning mechanism in order to get the copy of the original one.
    private final Address address;
    private final List<String> phoneNumbers;
    private final Map<String, String> metaData;

    // All args constructor for properties initialization.
    public ImmutableClass(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metaData) {
        this.name = name;
        this.age = age;
        // Creating a deep copy of Address, List, and Map to ensure immutability
        this.address = new Address(address.getCity(), address.getStreet(), address.getZipcode());
        this.phoneNumbers = new ArrayList<>(phoneNumbers);
        this.metaData = new HashMap<>(metaData);
    }

    // Only Getters, do not declare setters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() throws CloneNotSupportedException{
        // For all custom objects we need to implement cloning mechanism
        return (Address) address.clone();
    }
    public List<String> getPhoneNumbers() {
        /*
            For nested objects we need to make sure the return object is copy of
            original one. So that, if the user tries to modify, no impact o the original
            data.
        */
        return new ArrayList<>(phoneNumbers);
    }
    public Map<String, String> getMetaData() {
        /*
            For nested objects we need to make sure the return object is copy of
            original one. So that, if the user tries to modify, no impact o the original
            data.
        */
        return new HashMap<>(metaData);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", metaData=" + metaData +
                '}';
    }
}
