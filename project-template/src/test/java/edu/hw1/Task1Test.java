package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Перевод минут в секунды")
    void convertMinutesToSeconds() {
        // given
        String str = "01:00";

        // when
        int secondsValue = Task1.minutesToSeconds(str);

        // then
        assertThat(secondsValue)
            .isEqualTo(60);
    }

}
