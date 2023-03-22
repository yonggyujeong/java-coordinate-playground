package injectFuel.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AvanteTest {

    @Test
    void newTest() {
        int distance = 100;

        Avante avante = new Avante(distance);

        assertThat(avante.distance).isEqualTo(100);
    }

    @Test
    void calculateFuelTest() {
        int distance = 130;

        Avante avante = new Avante(distance);
        long fuel = avante.calculateFuel();

        assertThat(fuel).isEqualTo(10);
        assertThat(avante.fuel).isEqualTo(10);
    }

}
