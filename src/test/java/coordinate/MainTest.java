package coordinate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main = new Main();

    @Test
    void 좌표계_포맷_검증_invalid_case() {
        String input = "311141";

        Main.inputValidate(input);
    }

    @Test
    void 좌표계_포맷_검증_valid_case() {
        String input = "(12, 3)";

        Main.inputValidate(input);
    }

}