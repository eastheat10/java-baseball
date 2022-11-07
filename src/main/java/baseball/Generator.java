package baseball;

import static baseball.Const.BALL_LENGTH;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.Set;

public class Generator {

    public String generateRandomNumber() {
        StringBuilder counterpartNumber = new StringBuilder();
        Set<Character> ballCounter = new HashSet<>();

        while (ballCounter.size() < BALL_LENGTH) {
            char number = generateRandomNumberFrom1To9();

            if (ballCounter.add(number)) {
                counterpartNumber.append(number);
            }
        }

        return counterpartNumber.toString();
    }

    private char generateRandomNumberFrom1To9() {
        return Integer.toString(Randoms.pickNumberInRange(1, 9)).charAt(0);
    }

}
