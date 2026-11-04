# study-algorithm

이 저장소는 Kotlin 기반 알고리즘 풀이용 프로젝트입니다. Android Studio에서 열어도 동작하고, Gradle + JUnit으로 로컬 테스트도 바로 실행할 수 있습니다.

## 프로젝트 구조

```text
study-algorithm/
├─ build.gradle.kts
├─ settings.gradle.kts
├─ gradle.properties
├─ .gitignore
├─ src/
│  ├─ main/kotlin/
│  │  └─ leetcode150/arrayshashing/
│  │     └─ ContainsDuplicate.kt
│  └─ test/kotlin/
│     └─ leetcode150/arrayshashing/
│        └─ ContainsDuplicateTest.kt
├─ leetcode150/
│  └─ Arrays & Hashing/
│     └─ 1. Contains Duplicate.kt
└─ README.md
```

## Android Studio에서 열기

1. Android Studio를 실행합니다.
2. `Open` 또는 `Open Folder`에서 이 저장소를 엽니다.
3. Gradle이 자동으로 설정을 인식합니다.
4. 우측 상단 Gradle 탭에서 `Tasks > verification > test`를 실행하면 JUnit 테스트를 수행합니다.

## 로컬에서 테스트 실행

JDK 17 이상과 Gradle이 설치되어 있어야 합니다.

```bash
gradle test
```

특정 테스트만 실행하려면:

```bash
gradle test --tests "leetcode150.arrayshashing.ContainsDuplicateTest"
```

## 문제 추가 방법

- 풀이 코드는 `src/main/kotlin/leetcode150/...`에 작성합니다.
- 테스트 코드는 `src/test/kotlin/leetcode150/...`에 작성합니다.
- 문제 설명과 학습 기록은 기존 `leetcode150/` 디렉터리 안의 파일로 정리하면 됩니다.

## 예시

현재 포함된 문제는 `Contains Duplicate`이며, 테스트는 다음을 검증합니다.

- 중복이 있을 때 `true`
- 중복이 없을 때 `false`
- 빈 배열일 때 `false`

이 구조를 따라 새로운 알고리즘 문제를 추가하면 Android Studio에서도 바로 테스트하면서 공부할 수 있습니다.
