## Customer
- 고객은 먹을음식, 메뉴판, 요리사 정보를 가지고 주문을 한다

## Menu
- 메뉴판은 인자로 전달받은 메뉴 이름으로 해당 메뉴가 존재하는지 판단한다
- 메뉴판은 여러개의 메뉴를 상태로 갖는다(일급 컬렉션)

## MenuItem
- 메뉴는 가격과 이름이라는 상태를 가진다
- 인자로 전달받은 이름이 자신의 이름과 같은지 다른지 true, false로 판단할 수 있다

## Cooking
- 요리사는 전달받은 메뉴를 요리한다

## Cook
- 이름과 가격을 상태로 갖는다
