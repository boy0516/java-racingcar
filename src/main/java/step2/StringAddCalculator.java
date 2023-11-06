package step2;

import static step2.constants.NumberConstants.DEFAULT_VALUE;
import static step2.utils.StringParseUtils.isNullOrEmpty;
import static step2.utils.StringParseUtils.parseString;

public class StringAddCalculator {

    public static int splitAndSum(String numbers) {
        if (isNullOrEmpty(numbers)) {
            return DEFAULT_VALUE;
        }

        return parseString(numbers).stream().reduce(0, Integer::sum);
    }
}