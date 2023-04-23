package domain;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WinnersTest {

    @Test
    @DisplayName("우승자의 이름 리스트를 가지고 온다.")
    void getFarthestDistance() {
        Car ethanCar = makeCarWithMoved("ethan",3);
        Car rickCar = makeCarWithMoved("rick",2);

        Cars cars = new Cars(List.of(ethanCar, rickCar));

        String [] winnerNames = new Winners(cars).winnersName();
        assertThat(winnerNames).contains("ethan");
    }

    @Test
    @DisplayName("우승자는 복수일 수 있다.")
    void getWinnerNames(){
        Car ethanCar = makeCarWithMoved("ethan",2);
        Car rickCar = makeCarWithMoved("rick",2);

        Cars cars = new Cars(List.of(ethanCar, rickCar));
        Winners winners = new Winners(cars);

        String winnersNames[] = winners.winnersName();

        Assertions.assertThat(winnersNames).contains("ethan","rick");
    }

    private static Car makeCarWithMoved(String name, int movedCount) {
        Car car = new Car(name);
        for (int i = 0; i < movedCount; i++) {
            car.attemptMove(true);
        }
        return car;
    }

    @Test
    @DisplayName("제일 멀리 간 차를 가지고 온다.")
    void getCarWithFarthestDistance(){
        Car ethanCar = makeCarWithMoved("ethan",3);
        Car rickCar = makeCarWithMoved("rick",2);

        Cars cars = new Cars(List.of(ethanCar, rickCar));
        Winners winners = new Winners(cars);
        Assertions.assertThat(winners.winnersName()).contains("ethan");
    }
}