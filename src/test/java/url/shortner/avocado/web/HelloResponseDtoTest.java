package url.shortner.avocado.web;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_test() {
        String name = "Lee";
        int age = 30;

        HelloResponseDto dto = new HelloResponseDto(name, age);
        assertThat(dto.getAge()).isEqualTo(age);
        assertThat(dto.getName()).isEqualTo(name);
    }
}
