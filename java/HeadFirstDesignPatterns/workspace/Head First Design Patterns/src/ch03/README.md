# 3장 Decorator Pattern

* 왜 decorator 패턴을 사용할까? 
 * 확장성을 위함. 너무 일반적인 말이다. 디자인 패턴 아니, 설계 원칙 자체가 이를 모두 포함한다.
 * 좀 더 구체적으로 생각해 보면, 실행중에 동적으로 추가적인 기능을 줄수 있게 만들기 위함(JavaScript Patterns 중) 
* 어떤 경우?
 * ???

* 데코레이터는 투명성을 보장한다. 데코레이터로 둘러싸도 원래 객체와 동일한 인터페이스를 제공해서 원 객체와 동일하게 취급될 수 있어야 한다.
 
## Open-Closed Principle
클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.
기존 코드를 건드리지 않은 채로 확장을 통해 새로운 동작이 가능하도록 만들어라.

* 일반적으로 데코레이터는 팩토리나 빌더 같은 다른 패턴을 써서 만들고 사용하게 된다.

## JavaScript Decorator Pattern

* interface에 정의되지 않은 메소드를 특정 decorator에서 정의하고 원래 정의된 메소드처럼 사용할 수 있다.
* class가 아닌 function을 decorate 할 수 있다.
     