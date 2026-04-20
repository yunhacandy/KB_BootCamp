# Vue3 Board PBL - TODO 프로젝트

이 프로젝트는 **Vue.js를 학습하고, 연습하는 과정에서 직접 빈칸을 채우고, 실행하면서 문제를 해결하는 **PBL(Problem Based Learning)\*\* 실습용 게시판 프로젝트입니다.

## 학습 목표

- `json-server`로 가짜 REST API 서버를 띄울 수 있다.
- `axios`로 목록/상세/등록/수정/삭제 요청을 보낼 수 있다.
- `vue-router`로 페이지 이동과 파라미터 처리를 할 수 있다.
- `v-for`, `:key`, `props`, `@click`를 실습할 수 있다.
- 프론트엔드 CRUD 흐름을 전체적으로 설명할 수 있다.

---

## 기능 범위

- 게시글 목록 조회
- 게시글 상세 조회
- 게시글 등록
- 게시글 수정
- 게시글 삭제

---

## 실행 방법

### 1) 패키지 설치

```bash
npm install
```

### 2) json-server 실행

```bash
npx json-server --watch db.json --port 3000
```

또는

```bash
npm run api
```

### 3) Vue 개발 서버 실행

```bash
npm run dev
```

---

## 왜 proxy를 쓰나요?

Vue 개발 서버는 보통 5173 포트, json-server는 3000 포트를 사용합니다.  
브라우저에서 서로 다른 포트로 요청하면 CORS 문제가 생길 수 있으므로 `vite.config.js`의 proxy 설정을 이용해 `/api` 요청을 3000번 서버로 우회시킵니다.

예:

- 프론트 코드: `/api/boards`
- 실제 전달: `http://localhost:3000/boards`

---

## TODO 학습 순서 추천

1. `db.json` 구조 확인
2. `vite.config.js` proxy 확인
3. `src/router/index.js` 확인
4. `BoardList.vue` 목록 조회 완성
5. `BoardDetail.vue` 상세 + 삭제 완성
6. `BoardCreate.vue` 등록 완성
7. `BoardEdit.vue` 수정 완성
8. 전체 흐름 테스트

---

## 제출 전에 꼭 점검할 것

- 목록이 화면에 잘 보이는가?
- 제목 클릭 시 상세 화면으로 이동하는가?
- 등록 후 목록으로 돌아오는가?
- 수정 후 상세 화면으로 이동하는가?
- 삭제 후 목록으로 돌아오는가?
- 브라우저 새로고침 후에도 `db.json` 데이터가 반영되는가?

---

## 프로젝트 구조

```bash
vue-board-pbl-student-todo/
├─ db.json
├─ package.json
├─ vite.config.js
├─ src/
│  ├─ main.js
│  ├─ App.vue
│  ├─ router/
│  │  └─ index.js
│  ├─ components/
│  │  └─ BoardListItem.vue
│  └─ pages/
│     ├─ BoardList.vue
│     ├─ BoardDetail.vue
│     ├─ BoardCreate.vue
│     └─ BoardEdit.vue
└─ docs/
   ├─ student-checklist.md
   └─ file-explanation.md
```

---

## 실습 규칙

- TODO 주석을 따라 한 단계씩 완성하세요.
- 한 번에 다 고치지 말고 **한 기능씩 실행 확인**하세요.
- 오류가 나면 콘솔 로그를 먼저 확인하세요.
- 막히면 “현재 파일 역할 → 현재 데이터 → 현재 경로 → 현재 API 주소” 순서로 점검하세요.

---

## 권장 발표 질문

- `ref()`는 왜 사용하는가?
- `onMounted()`는 왜 필요한가?
- `useRoute()`와 `useRouter()`의 차이는 무엇인가?
- `v-for`에서 `:key`가 왜 필요한가?
- `PUT`과 `PATCH`의 차이는 무엇인가?
- 프론트엔드에서 삭제 후 왜 다시 화면 이동이 필요한가?

---
