<script setup>
import { ref, onMounted } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import axios from 'axios';

const route = useRoute();
const router = useRouter();

//수정할 board 정의
const board = ref({
  id: null,
  title: '',
  content: '',
  writer: '',
  createdAt: '',
});

const load = async () => {
  try {
    //id 가져오기
    const id = route.params.id;

    //기존 데이터 가져오기
    const response = await axios.get(`/api/boards/${id}`);
    board.value = response.data;
  } catch (error) {
    console.error('수정용 데이터 조회 실패: ', error);
  }
};

//수정
const submit = async () => {
  try {
    axios.put(`/api/boards/${board.value.id}`, board.value);
    router.push(`/detail/${board.value.id}`);
  } catch (error) {
    console.error('수정 실패: ', error);
  }
};

const back = () => {
  router.push(`/detail/${board.value.id}`);
};

onMounted(load);
</script>

<template>
  <section>
    <h2>게시글 수정</h2>

    <div class="form-group">
      <label for="title">제목</label>
      <input id="title" v-model="board.title" type="text" />
    </div>

    <div class="form-group">
      <label for="writer">작성자</label>
      <input id="writer" v-model="board.writer" type="text" />
    </div>

    <div class="form-group">
      <label for="content">내용</label>
      <textarea id="content" v-model="board.content" rows="8"></textarea>
    </div>

    <div class="button-row">
      <button @click="submit">저장</button>
      <button @click="back">취소</button>
    </div>
  </section>
</template>

<style scoped>
.form-group {
  display: flex;
  flex-direction: column;
  gap: 8px;
  margin-bottom: 16px;
}
input,
textarea {
  padding: 10px 12px;
  border: 1px solid #d1d5db;
  border-radius: 8px;
}
.button-row {
  display: flex;
  gap: 10px;
}
button {
  border: none;
  padding: 10px 14px;
  border-radius: 8px;
  cursor: pointer;
}
</style>
