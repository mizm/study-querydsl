# study-querydsl

## jpa 의 한계
- from 절에 서브 쿼리를 사용 할 수 없다.
- 해결 방법
    1. 서브쿼리를 join으로 변경한다.
    2. 애플리케이션에서 쿼리를 2번 실행한다.
    3. nativesql을 사용한다.