import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();


    @Test //Тест на правильный номер
    public void testAdd1() {
        //arrange
        int expected;
        int actual = 2;
        //act
        phoneBook.add("+79315851646", "Oleg");
        phoneBook.add("+79315851647", "Oleg");
        expected = phoneBook.add("+79315851646", "Oleg");
        //assert
        if (actual == expected) {
            System.out.println("Тест на правильный номер пройден");
        } else
            throw new AssertionError("Тест на правильный номер не пройден");
    }

}
