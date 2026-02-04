package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableClient {

    public static void main(String[] args) {
        Address address = new Address("xyz", "abc", "12345");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123456789");
        phoneNumbers.add("987654321");
        Map<String, String> metaData = new HashMap<>();
        metaData.put("123", "abc");
        metaData.put("456", "xyz");

        ImmutableClass immutableClass = new ImmutableClass("Ram", 23, address, phoneNumbers, metaData);

        System.out.println(immutableClass);

        phoneNumbers.add("3676384563847");
        metaData.put("987", "tvs");
        address.setCity("abc");

        System.out.println(immutableClass);

    }

}
