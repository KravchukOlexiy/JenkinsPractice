import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeWithJenkins extends BaseTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void thirdTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void fourthTest() {
        Assertions.assertTrue(true);
    }

    @Disabled
    @Test
    void fifthTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void formTest() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("My firtsname");
        $("#lastName").setValue("My lastname");
        $("#userEmail").setValue("someemail@some.net");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(7);
        $(".react-datepicker__year-select").selectOptionByValue("1988");
        $(byText("26")).click();

        $("#subjectsInput").setValue("p");
        $(byText("Physics")).click();

        $(byText("Sports")).click();

        $("#uploadPicture").uploadFromClasspath("1.png");
        $("#currentAddress").setValue("My text");

        $("#state").$("svg").click();
        $(byText("NCR")).click();

        $("#city").click();
        $(byText("Delhi")).click();

        $("#submit").click();

        //check that all data was sent
        $("#example-modal-sizes-title-lg").shouldHave(Condition.text("Thanks for submitting the form"));
        $$("td").shouldHave(CollectionCondition.texts(
                "Student Name", "My firtsname My lastname",
                "Student Email", "someemail@some.net",
                "Gender", "Male",
                "Mobile", "0123456789",
                "Date of Birth", "26 August,1988",
                "Subjects", "Physics",
                "Hobbies", "Sports",
                "Picture", "1.png",
                "Address", "My text",
                "State and City", "NCR Delhi -"));

    }
}
