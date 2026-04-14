<script setup>
import ref from 'vue';
import useRouter from 'vue-router';
import axios from 'axios';

const router = useRouter();

//등록 폼에서 사용할 board 데이터 정의
const board = ref({
  title: '',
  content: '',
  writer: '',
});

const submit = async () => {
  //여기서는 등록이라 onMounted(load)가 아니라 submit 사용
  try {
    //POST메소드로 새 게시글 등록
    //createdAt은 오늘 날짜 문자열을 추가
    await axios.post('/api/boards', {
      ...board.value,
      createdAt: new Date().toISOString().slice(0, 10),
    });
    router.push('/'); //등록 완료되면 목록 페이지로 이동
  } catch (error) {
    console.error('상세 조회 실패: ', error);
  }
};

const back = () => {
  router.push('/');
};
</script>

<template>
  <section>
    <h2>게시글 등록</h2>
    <div class="form-group">
      <label for="title">제목</label>
      <input id="title" v-model="board.title" type="text" />
      <!-- v-model: 입력값과 데이터 자동 동기화 -->
    </div>

    <div class="form-group">
      <label for="writer">작성자</label>
      <input id="writer" v-model="board.writer" type="text" />
    </div>

    <div class="form-group">
      <label for="content">내용</label>
      <textarea id="content" v-model="board.content" rows="8"></textarea>
    </div>

    <div class="buttton-row">
      <!-- 이벤트 핸들러 연결 -->
      <button @click="submit">등록</button>
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
