package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @Test
    void 입력값_검증_테스트() {
        int x = 3;
        int y = 1;

        Coordinate coordinate = Coordinate.from(x, y);
        assertThat(coordinate.getX()).isEqualTo(x);
        assertThat(coordinate.getY()).isEqualTo(y);
    }

    @Test
    void 입력값_검증_테스트_실패() {
        int x = 25;
        int y = 1;

        assertThrows(IllegalArgumentException.class, () -> {
            Coordinate.from(x, y);
        });
    }
}