<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'
import BoardListItem from '@/components/BoardListItem.vue'

const boards = ref([])  //ref([])는 값이 바뀌면 화면도 자동으로 바뀌게 만드는 반응형 변수, 선언해야 함

const load = async () => {
  try {
    // TODO-03
    // 게시글 목록을 조회하는 axios 코드를 완성하세요.
    // 힌트: GET /api/boards
    const response = await axios.get('/api/boards')
    // axios는 서버와 통신하는 도구
    // async, await는 비동기 코드를 순서대로 실행되는 것처럼 보이게 하는 문법

    // TODO-04
    // axios 응답 데이터로 boards를 세팅하세요.
    boards.value = response.data  //response의 데이터를 boards에 뿌리는 느낌
  } catch (error) {
    console.error('목록 조회 실패:', error)
  }
}

onMounted(load)
</script>

<template>
  <section>
    <div class="page-header">
      <h2>게시글 목록</h2>
      <RouterLink to="/create" class="write-button">글쓰기</RouterLink>
    </div>

    <p class="guide">
      아래 TODO를 완성하면서 v-for, :key, props 바인딩을 함께 점검하세요.
    </p>

    <!-- TODO-05
        v-for를 사용하여 boards를 출력하세요.
        각 반복 항목에는 반드시 :key="board.id"를 적용하세요.
        BoardListItem에 :board="board"를 전달하세요.
    -->

    <!-- 
      <div v-어쩌고="값"></div> 구조
      HTML에 Vue 기능 추가

      v-for 반복 출력
      v-bind 속성에 변수 연결
      v-model 입력값 양방향 연결
      v-if 조건이 참일때만 표시
      v-show 보이기/숨기기 (CSS만 변경)

      v-on 이벤트 발생 시 함수 실행
      v-on수식어 이벤트의 기본 동작을 변경

      <form @submit="save"> -> save 실행, 페이지 새로고침 발생
      <form @submit.prevent="save"> -> save 실행, 페이지 새로고침 안함

      v-text 텍스트 출력
      v-html 코드 그대로 출력
    -->

    <BoardListItem
      v-for="board in boards"
      :key="board.id"
      :board="board"
    />
    <!-- boards 배열 반복
        -> board 하나씩 꺼냄
        -> BoardListItem 컴포넌트에 전달
    -->

    <p v-if="boards.length === 0" class="empty-message">
      등록된 게시글이 없습니다.
    </p>
  </section>
</template>

<style scoped>
.page-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.write-button {
  padding: 10px 14px;
  background: #2563eb;
  color: white;
  text-decoration: none;
  border-radius: 8px;
}
.guide {
  margin: 16px 0;
  color: #6b7280;
}
.empty-message {
  margin-top: 20px;
  color: #9ca3af;
}
</style>
