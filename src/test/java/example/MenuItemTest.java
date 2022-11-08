package example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuItemTest {

	@Test
	@DisplayName("메뉴 항목을 생성한다")
	void createTest() {

		assertThatCode(() -> new MenuItem("만두", 5000))
			.doesNotThrowAnyException();
	}

	@Test
	@DisplayName("인자로 전달받은 메뉴 이름이 같은 이름이라면 true를 리턴한다")
	void isMatchesTrue() {
		MenuItem menuItem = new MenuItem("치킨", 10000);

		assertThat(menuItem.matches("치킨")).isTrue();
	}

	@Test
	@DisplayName("인자로 전달받은 메뉴 이름이 다른 이름이라면 false를 리턴한다")
	void isMatchesFalse() {
		MenuItem menuItem = new MenuItem("치킨", 10000);

		assertThat(menuItem.matches("돈가스")).isFalse();
	}
}
