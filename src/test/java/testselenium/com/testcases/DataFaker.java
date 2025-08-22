package testselenium.com.testcases;

import net.datafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class DataFaker {
    @Test
    public void testDataFaker01() {
        Faker faker = new Faker(new Locale("vi"));

        String computer = faker.computer().windows();
        String name = faker.name().fullName();
        String address = faker.address().fullAddress();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        System.out.println(computer);
        System.out.println(name);
        System.out.println(address);
        System.out.println(email);
        System.out.println(password);
    }
}
