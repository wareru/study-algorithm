# study-algorithm

Kotlin 기반 알고리즘 학습 저장소입니다. 루트 프로젝트는 공통 Gradle 설정을 관리하고, 각 문제집이나 서비스는 독립된 JVM 모듈로 구성합니다. Android Studio에서 저장소 루트를 열어 Gradle 프로젝트로 동기화하면 됩니다.

## 프로젝트 구조

```text
study-algorithm/
├─ build.gradle.kts                 # 공통 플러그인 선언
├─ settings.gradle.kts              # 모듈 등록
├─ gradle/libs.versions.toml        # Kotlin/Kotest 버전 카탈로그
├─ leetcode150/                     # LeetCode 150 JVM 모듈 및 문제 노트
│  ├─ build.gradle.kts
│  ├─ Arrays & Hashing/              # 사람이 읽는 카테고리/문제 노트
│  └─ src/
│     ├─ main/kotlin/leetcode150/arrayshashing/
│     └─ test/kotlin/leetcode150/arrayshashing/
└─ programmers/                     # 필요할 때 별도 모듈로 추가
```

## 환경

- JDK 21
- Kotlin Gradle Plugin 및 Kotest 버전은 `gradle/libs.versions.toml`에서 관리합니다.
- `leetcode150`은 Android 앱이 아닌 순수 Kotlin/JVM 모듈입니다.

## Android Studio

1. `Open`으로 저장소 루트를 엽니다.
2. Gradle 동기화가 끝나면 `leetcode150/src/test/kotlin`의 테스트 옆 실행 아이콘으로 테스트할 수 있습니다.
3. Gradle JDK는 JDK 21로 설정하세요. Gradle 설정에서 Kotlin 컴파일 toolchain도 21로 맞췄습니다.

## 로컬 테스트

루트에서 모든 모듈의 테스트를 실행합니다.

```bash
gradle test
```

LeetCode 150 모듈만 실행하려면:

```bash
gradle :leetcode150:test
```

특정 테스트 클래스를 실행하려면:

```bash
gradle :leetcode150:test --tests "leetcode150.arrayshashing.ContainsDuplicateTest"
```

## 문제 추가 및 네이밍

- 문제 풀이: `leetcode150/src/main/kotlin/leetcode150/<category>/`
- 테스트: `leetcode150/src/test/kotlin/leetcode150/<category>/`
- 표시용 카테고리는 `Arrays & Hashing`처럼 공백과 특수문자를 포함해도 됩니다.
- Kotlin package 이름에는 소문자 식별자를 사용하세요. 예: `leetcode150.arrayshashing`.
- 다른 문제집이나 서비스는 별도 디렉터리와 Gradle 모듈로 추가하고 `settings.gradle.kts`에 `include(":모듈명")`을 등록합니다.
- 각 모듈은 자신의 `build.gradle.kts`에서 테스트 의존성을 관리하며 버전은 공통 version catalog를 사용합니다.
