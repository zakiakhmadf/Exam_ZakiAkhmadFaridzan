package demo.steps.android;


import demo.pages.android.CreateToDoPage;
import demo.pages.android.StatisticsPage;
import demo.pages.android.ToDoDetailPage;
import demo.pages.android.ToDoListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AndroidStepDefinition {

    ToDoListPage toDoListPage = new ToDoListPage();
    CreateToDoPage createToDoPage = new CreateToDoPage();
    ToDoDetailPage toDoDetailPage = new ToDoDetailPage();
    StatisticsPage statisticsPage = new StatisticsPage();

    @Given("User is on to-do list page")
    public void userIsOnToDoListPage() {
        toDoListPage.isOnPage();
    }

    @When("User tap the add to-do button")
    public void userTapTheAddToDoButton() {
        toDoListPage.tapAddToDo();
    }

    @When("User input {string} as to-do title")
    public void userInputAsToDoTitle(String title) {
        createToDoPage.inputToDoTitle(title);
    }

    @When("User input {string} as to-do description")
    public void userInputAsToDoDescription(String description) {
        createToDoPage.inputToDoDescription(description);
    }

    @When("User tap the save to-do button")
    public void userTapTheSaveToDoButton() {
        createToDoPage.tapSaveToDo();
    }

    @When("User tap the to-do title")
    public void userTapTheToDoTitle() {
        toDoListPage.tapToDoTitle();
    }

    @Then("User see {string} as the to-do title")
    public void userSeeAsTheToDoTitle(String title) {
        String actualTitle = toDoDetailPage.getToDoTitle();
        Assert.assertEquals(title, actualTitle);
    }

    @Then("User see {string} as the to-do description")
    public void userSeeAsTheToDoDescription(String description) {
        String actualDescription = toDoDetailPage.getToDoDescription();
        Assert.assertEquals(description, actualDescription);
    }


    @When("User tap checkbox to complete to-do")
    public void userClickCheckboxToCompleteToDo() {
        toDoListPage.tapCheckbox();
    }

    @Then("User see the checkbox is checked")
    public void userSeeTheCheckboxIsChecked() {
        boolean result = toDoListPage.checkBoxIsChecked();
        Assert.assertTrue(result);
    }

    @When("User tap checkbox to uncheck completed to-do")
    public void userTapCheckboxToUncheckCompletedToDo() {
        toDoListPage.tapCheckbox();
    }

    @Then("User see the checkbox is unchecked")
    public void userSeeTheCheckboxIsUnchecked() {
        boolean result = toDoListPage.checkBoxIsUnchecked();
        Assert.assertFalse(result);
    }

    @When("User tap menu filter")
    public void userTapMenuFilter() {
        toDoListPage.tapMenuFilter();
    }

    @When("User tap Active")
    public void userTapActive() {
        toDoListPage.tapFilterByActive();
    }

    @When("User tap Completed")
    public void userTapCompleted() {
        toDoListPage.tapFilterByCompleted();
    }

    @Then("User see {string} as the to-do title on to-do list page")
    public void userSeeAsTheToDoTitleOnToDoListPage(String title) {
        String actualTitle = toDoListPage.getToDoTitle();
        Assert.assertEquals(title, actualTitle);
    }

    @When("User tap the Navigate button")
    public void userTapTheNavigateButton() {
        toDoListPage.tapNavigation();
    }

    @When("User tap Statistics")
    public void userTapStatistics() {
        toDoListPage.tapStatistics();
    }

    @Then("User see {string} as menu bar title")
    public void userSeeAsMenuBarTitle(String title) {
        String actualTitle = statisticsPage.getMenuTitle();
        Assert.assertEquals(title, actualTitle);
    }

    @When("User tap options button")
    public void userTapOptionsButton() {
        toDoListPage.tapOptions();
    }

    @When("User tap Clear completed")
    public void userTapClearCompleted() {
        toDoListPage.tapClearCompleted();
    }

    @Then("User see {string} on to-do list page")
    public void userSeeOnToDoListPage(String noToDo) {
        String actual = toDoListPage.getNoToDo();
        Assert.assertEquals(noToDo, actual);
    }

    @And("User tap Refresh")
    public void userTapRefresh() {
        toDoListPage.tapRefresh();
    }
}
