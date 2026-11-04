# study-algorithm

이 저장소는 Kotlin 기반 알고리즘 풀이용 순수 JVM 프로젝트입니다. Android Studio에서 열어 Gradle로 동기화하고, Kotest로 풀이를 로컬에서 검증할 수 있습니다. Android 앱이나 에뮬레이터는 필요하지 않습니다.

## 프로젝트 구조

```text
study-algorithm/
├─ build.gradle.kts
├─ settings.gradle.kts
├─ gradle.properties
├─ gradle/
│  └─ libs.versions.toml  # Kotlin, Kotest 및 플러그인 버전 관리
├─ src/
│  ├─ main/kotlin/leetcode150/arrayshashing/
│  │  └─ ContainsDuplicate.kt
│  └─ test/kotlin/leetcode150/arrayshashing/
│     └─ ContainsDuplicateTest.kt
├─ leetcode150/                 # 기존 문제 노트
└─ README.md
```

## 환경

- JDK 17 이상
- Android Studio의 Gradle 프로젝트 열기 지원
- Kotlin Gradle Plugin 및 라이브러리 버전은 `gradle/libs.versions.toml`에서 관리

## Android Studio에서 열기

1. Android Studio에서 `Open`을 선택하고 저장소 루트를 엽니다.
2. Gradle 프로젝트 동기화가 완료될 때까지 기다립니다.
3. `src/test/kotlin`의 테스트 클래스 또는 테스트 함수 옆 실행 아이콘을 눌러 실행합니다.

## 로컬 테스트 실행

Gradle이 설치된 경우 저장소 루트에서 전체 테스트를 실행합니다.

```bash
gradle test
```

특정 테스트 클래스를 실행하려면:

```bash
gradle test --tests "leetcode150.arrayshashing.ContainsDuplicateTest"
```

## 문제 추가 방법

- 풀이 코드는 `src/main/kotlin/leetcode150/<category>/`에 작성합니다.
- 테스트는 `src/test/kotlin/leetcode150/<category>/`에 작성합니다.
- `category`에는 공백이나 `&` 대신 소문자와 숫자를 사용합니다.
- 테스트는 Kotest `FunSpec`과 matcher로 작성합니다.
- 문제 설명과 학습 기록은 기존 `leetcode150/` 디렉터리에 정리합니다.

현재 `Contains Duplicate` 테스트는 중복 존재, 중복 없음, 빈 배열의 세 경우를 검증합니다.
