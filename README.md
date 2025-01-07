# TDD 연습을 위한 첫 테스트

## 1. TDD란 무엇인가?

**TDD(Test-Driven Development)**는 **테스트를 먼저 작성**하고, 그 테스트를 통과하기 위한 코드를 작성한 후, 코드를 리팩토링하는 과정을 반복하는 소프트웨어 개발 방법론입니다.  
TDD는 "테스트 우선 개발"이라는 접근 방식으로, 요구사항을 명확히 하고 코드 품질을 높이며 유지보수성을 향상시킵니다.

---

## 2. TDD의 3단계: RED → GREEN → REFACTOR

TDD는 아래의 3단계를 반복하면서 개발을 진행합니다:

1. **RED: 실패하는 테스트 작성**
   - 먼저, 구현할 기능의 요구사항을 정의하는 **테스트 코드**를 작성합니다.
   - 테스트를 실행하면 실패하는 것이 정상입니다. 왜냐하면, 아직 기능이 구현되지 않았기 때문입니다.
   - 목표: 테스트를 통해 "무엇을 기대하는지"를 명확히 정의.

2. **GREEN: 테스트 통과를 위한 최소한의 코드 작성**
   - 테스트를 통과하기 위해 **최소한의 코드**를 작성합니다.
   - 여기서는 테스트가 성공하는 것만을 목표로 하고, 코드를 간단하게 유지합니다.
   - 목표: 테스트를 성공시키는 것.

3. **REFACTOR: 코드와 테스트 리팩토링**
   - 코드와 테스트를 **리팩토링**하여 중복을 제거하고 가독성을 높이며 유지보수성을 개선합니다.
   - 이 과정에서 테스트가 계속 통과해야 하며, 리팩토링은 안전하게 이루어져야 합니다.
   - 목표: 더 좋은 품질의 코드를 작성.

---
