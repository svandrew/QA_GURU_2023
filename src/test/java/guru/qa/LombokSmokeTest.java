package guru.qa;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Проверка, что Lombok подключён и lombok.config (accessors.chain = true) применяется.
 */
class LombokSmokeTest {

    @Value
    @Builder
    static class User {
        String name;
        int age;
    }

    @Getter
    @Setter
    static class Config {
        private String host;
        private int port;
    }

    @Test
    @DisplayName("Lombok: @Value + @Builder генерируют билдер, геттеры и equals")
    void valueAndBuilderWork() {
        User user = User.builder().name("Andrey").age(30).build();

        assertEquals("Andrey", user.getName());
        assertEquals(30, user.getAge());
        assertEquals(User.builder().name("Andrey").age(30).build(), user);
    }

    @Test
    @DisplayName("Lombok: lombok.config включает chain-сеттеры")
    void chainedSettersFromLombokConfig() {
        Config config = new Config();

        assertSame(config, config.setHost("localhost").setPort(4444));
        assertEquals("localhost", config.getHost());
        assertEquals(4444, config.getPort());
    }
}
