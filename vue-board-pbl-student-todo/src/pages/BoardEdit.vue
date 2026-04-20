<script setup>
import { ref, onMounted } from 'vue'
import { useRoute, useRouter } from 'vue-router'
import axios from 'axios'

const route = useRoute()
const router = useRouter()

// TODO-21
// 수정 페이지에서도 board 상태를 정의하세요.
const board = ref({
  id: null,
  title: '',
  content: '',
  writer: '',
  createdAt: ''
})

const load = async () => {
  try {
    // TODO-22
    // 수정할 게시글의 id를 params에서 추출하세요.
    const id = route.params.id

    // TODO-23
    // 기존 게시글 데이터를 불러오세요.
    const response = await axios.get(`/api/boards/${id}`)
    board.value = response.data
  } catch (error) {
    console.error('수정용 데이터 조회 실패:', error)
  }
}

const submit = async () => {
  try {
    // TODO-24
    // PUT 또는 PATCH로 수정 기능을 완성하세요.
    // 힌트: PUT /api/boards/:id
    await axios.put(`/api/boards/${board.value.id}`, board.value)

    // TODO-25
    // 수정이 끝나면 상세 페이지 또는 목록 페이지로 이동하세요.
    router.push(`/detail/${board.value.id}`)
  } catch (error) {
    console.error('수정 실패:', error)
  }
}

const back = () => {
  // TODO-26
  // 취소 시 상세 페이지로 돌아가세요.
  router.push(`/detail/${board.value.id}`)
}

onMounted(load)
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
      <!-- TODO-27
          수정 페이지에서도 @click 이벤트가 올바르게 연결되어 있는지 확인하세요.
      -->
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
