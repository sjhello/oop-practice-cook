package example;

import java.text.CollationKey;

/*
* 요리사
* */
public class Cooking {

	public Cook makeCook(MenuItem menuItem) {
		Cook cook = new Cook(menuItem);
		return cook;
	}
}
