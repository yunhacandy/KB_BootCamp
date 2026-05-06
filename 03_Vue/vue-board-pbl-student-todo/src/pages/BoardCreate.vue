<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()

// TODO-16
// 등록 폼에서 사용할 board 데이터를 정의하세요.
const board = ref({
  title: '',
  content: '',
  writer: ''
})

const submit = async () => {
  try {
    // TODO-17
    // POST 요청으로 새 게시글을 등록하세요.
    // createdAt은 오늘 날짜 문자열을 추가해도 좋습니다.
    await axios.post('/api/boards', {
      ...board.value, //... -> 스프레드 문법: 객체 안의 내용을 펼쳐서 복사하는 문법, board.value 안에 있는 속성들을 펼쳐서 넣어라
      createdAt: new Date().toISOString().slice(0, 10)
    })

    // TODO-18
    // 등록 완료 후 목록 페이지('/')로 이동하세요.
    router.push('/')
  } catch (error) {
    console.error('등록 실패:', error)
  }
}

const back = () => {
  // TODO-19
  // 취소 버튼 클릭 시 목록으로 이동하세요.
  router.push('/')
}
</script>

<template>
  <section>
    <h2>게시글 등록</h2>

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
      <!-- TODO-20
          템플릿에서 이벤트 핸들러가 submit / back에 올바르게 연결되어 있는지 확인하세요.
      -->
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
input, textarea {
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
