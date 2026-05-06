<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
import BoardListItem from '@/components/BoardListItem.vue';

const boards = ref([]); //값이 변하면 화면 자동 업데이트

const load = async () => {
  try {
    //게시글 목록 조회하는 axios 코드 완성
    const response = await axios.get('/api/boards');
    //async는 서버와 통신하는 도구
    //await는 비동기 코드가 바로 실행되는거처럼 보이게 하려고..

    boards.value = response.data;
  } catch (error) {
    console.error('목록 조회 실패 : ', error);
  }
};

onMounted(load); //화면에 생성된 직후 실행되는 함수
</script>

<template>
  <section>
    <div class="page-header">
      <h2>게시글 목록</h2>
      <RouterLink to="create" class="write-botton">글쓰기</RouterLink>
    </div>
    <!-- 매칭해주기..!! -->

    <p class="guide">
      아래 TODO를 완성하려며 v-for, :key, props 바인딩을 함께 점검하세요.
    </p>

    <BoardListItem
      v-for="board in boards"
      :key="board.id"
      v-bind:board="board"
    />
    <!-- 현재 반복 중인 board 데이터를 컴포넌트에게 전달 -->

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
