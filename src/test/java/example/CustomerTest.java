package example;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {

	@DisplayName("메뉴 이름에 해당하는 요리를 주문 한다")
	@Test
	void orderTest() {
		Customer customer = new Customer();
		Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("냉면", 7000)));
		Cooking cooking = new Cooking();

		assertThatCode(() -> customer.order("돈가스", menu, cooking))
			.doesNotThrowAnyException();
	}
}
