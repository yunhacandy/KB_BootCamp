# 파일별 설명 문서

각 파일의 역할을 이해하도록 돕기 위한 설명서입니다.

---

## 1. `db.json`

- `json-server`가 읽는 데이터베이스 파일입니다.
- 여기 들어 있는 `boards` 배열이 게시판 데이터가 됩니다.
- 등록/수정/삭제를 하면 이 파일 내용이 바뀝니다.

### 핵심 개념

- `boards`라는 이름은 API 경로와 연결됩니다.
- `/boards` 요청은 이 배열을 의미합니다.

---

## 2. `vite.config.js`

- Vite 개발 서버 설정 파일입니다.
- 여기서 proxy를 설정하면 `/api` 요청을 3000번 서버로 넘길 수 있습니다.

### 핵심 개념

- 프론트: `/api/boards`
- 실제 서버: `http://localhost:3000/boards`

---

## 3. `src/main.js`

- Vue 앱의 시작 파일입니다.
- `App.vue`를 화면에 렌더링하고 `router`를 연결합니다.

---

## 4. `src/App.vue`

- 공통 레이아웃 역할을 합니다.
- 상단 메뉴와 `RouterView`가 들어 있습니다.
- 실제 페이지 컴포넌트는 `RouterView` 위치에 바뀌어 나타납니다.

---

## 5. `src/router/index.js`

- 페이지 이동 규칙을 모아 둔 파일입니다.

### 현재 라우트

- `/` : 목록 페이지
- `/create` : 등록 페이지
- `/detail/:id` : 상세 페이지
- `/edit/:id` : 수정 페이지

### 핵심 포인트

- `:id`는 URL 파라미터입니다.
- 예: `/detail/3` 이면 `id = 3`

---

## 6. `src/components/BoardListItem.vue`

- 게시글 1개를 화면에 보여주는 재사용 컴포넌트입니다.
- 부모인 `BoardList.vue`에서 `:board="board"` 형태로 데이터를 넘겨받습니다.

### 핵심 개념

- 부모 → 자식 데이터 전달은 `props`
- 자식은 전달받은 데이터를 화면에 출력만 담당

---

## 7. `src/pages/BoardList.vue`

- 게시글 목록 페이지입니다.
- `onMounted()` 시점에 서버에서 게시글 목록을 불러옵니다.

### 핵심 체크

- `boards = ref([])` : 목록 상태
- `axios.get('/api/boards')` : 목록 조회
- `v-for` : 여러 게시글 반복 출력
- `:key="board.id"` : 각 항목의 고유 키

---

## 8. `src/pages/BoardDetail.vue`

- 게시글 상세 페이지입니다.
- URL의 `id`를 이용해 특정 게시글 1개를 조회합니다.

### 핵심 체크

- `useRoute()` : 현재 경로 정보 읽기
- `useRouter()` : 페이지 이동하기
- `route.params.id` : URL 파라미터 꺼내기
- `axios.get('/api/boards/:id')` : 상세 조회
- `axios.delete('/api/boards/:id')` : 삭제

---

## 9. `src/pages/BoardCreate.vue`

- 새 게시글 작성 페이지입니다.

### 핵심 체크

- `v-model` : 입력값과 상태 연결
- `axios.post('/api/boards', board.value)` : 등록
- 등록 성공 후 `router.push('/')` : 목록으로 이동

---

## 10. `src/pages/BoardEdit.vue`

- 기존 게시글 수정 페이지입니다.

### 핵심 체크

1. 먼저 기존 글을 불러온다.
2. 입력창에 기존 데이터가 채워진다.
3. 수정 후 `PUT` 또는 `PATCH` 요청을 보낸다.
4. 저장 후 다시 상세 페이지로 이동한다.

---

## 실습 팁

### 오류가 났을 때 확인 순서

1. import가 빠지지 않았는가?
2. router path가 맞는가?
3. `/api/boards` 주소가 맞는가?
4. proxy가 맞는가?
5. `route.params.id`가 실제로 존재하는가?
6. `response.data`를 올바른 변수에 넣었는가?

### 자주 나오는 실수

- `boards.value` 대신 `boards = ...`로 작성
- `@click="submit()"`와 `@click="submit"` 차이를 헷갈림
- `route`와 `router`를 반대로 사용
- `:key` 누락
- `/api`를 빼먹고 `/boards`로 직접 요청
