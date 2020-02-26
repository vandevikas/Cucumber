package step_definitions;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TicTacToeSteps {

	private List<List<String>> board;

	@Given("^a board like this:$")
	public void aBoardLikeThis(DataTable table) throws Throwable {
		board = new ArrayList<List<String>>();
		for (List<String> row : table.raw()) {
			board.add(new ArrayList<String>(row));
		}
	}

	@When("^player x plays in row (\\d+), column (\\d+)$")
	public void playerXPlaysInRowColumn(int row, int col) throws Throwable {
		board.get(row).set(col, "x");
	}

	@Then("^the board should look like this:$")
	public void theBoardShouldLookLikeThis(DataTable expectedTable) throws Throwable {
		expectedTable.diff(board);

	}

}
