package view;

import domain.UserInput;
import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String FIRST_QUESTION_FOR_CREATE_CAR = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String SECOND_QUESTION_ATTEMPT_COUNT = "시도할 회수는 몇 회 인가요?";

    public static UserInput getInput() {
        return getUserInputForRace();
    }

    private static UserInput getUserInputForRace() {
        System.out.println(FIRST_QUESTION_FOR_CREATE_CAR);
        String namesForCars = scanner.next();
        System.out.println(SECOND_QUESTION_ATTEMPT_COUNT);
        int attemptCount = scanner.nextInt();

        return new UserInput(namesForCars, attemptCount);
    }

}