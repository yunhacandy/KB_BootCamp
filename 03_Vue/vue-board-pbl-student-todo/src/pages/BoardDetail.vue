<script setup>
import { ref, onMounted, computed } from 'vue'
import { useRoute, useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()
const route = useRoute()

// TODO-06
// currentRoute를 별도로 확인하기 위한 computed 값을 만들어 보세요.
const currentRoute = computed(() => route.fullPath)
//라우터가 정상 작동하는지 확인용

// TODO-07
// 단일 게시글 데이터를 저장할 ref를 정의하세요.
const board = ref({
  id: null,
  title: '',
  content: '',
  writer: '',
  createdAt: ''
})

const load = async () => {
  try {
    // TODO-08
    // route.params.id 에서 id를 추출하세요.
    const id = route.params.id

    // TODO-09
    // axios로 상세 조회 코드를 작성하세요.
    // 힌트: GET /api/boards/:id
    const response = await axios.get(`/api/boards/${id}`)
    //id가 계속 바뀌니까 이렇게 id를 표시

    // TODO-10
    // 응답 데이터로 board를 세팅하세요.
    board.value = response.data
    //서버에서 받은 게시글 데이터를 board 변수에 저장
    
  } catch (error) {
    console.error('상세 조회 실패:', error)
  }
}

const moveEdit = () => {
  // TODO-11
  // 수정 페이지(/edit/:id)로 이동하세요.
  router.push(`/edit/${board.value.id}`)
}

const remove = async () => {
  try {
    // TODO-12
    // 삭제 기능을 완성하세요.
    // 힌트: DELETE /api/boards/:id
    await axios.delete(`/api/boards/${board.value.id}`)

    // TODO-13
    // 삭제가 끝나면 목록 페이지('/')로 이동하세요.
    router.push('/')  //router.push가 이동 느낌
  } catch (error) {
    console.error('삭제 실패:', error)
  }
}

const back = () => {
  // TODO-14
  // 이전 화면 또는 목록으로 돌아가는 코드를 작성하세요.
  router.push('/')
}

onMounted(load)
</script>

<template>
  <section class="detail-page">
    <h2>게시글 상세</h2>

    <p class="route-check">
      현재 경로 확인: {{ currentRoute }}
    </p>

    <div class="detail-box">
      <h3>{{ board.title }}</h3>
      <p class="meta">
        작성자: {{ board.writer }} / 작성일: {{ board.createdAt }}
      </p>
      <p class="content">{{ board.content }}</p>
    </div>

    <div class="button-row">
      <!-- TODO-15
          아래 버튼들의 이벤트 핸들러 연결을 확인하고,
          왜 @click으로 메서드를 등록하는지 설명해 보세요.
      -->
      <button @click="moveEdit">수정</button>
      <button @click="remove">삭제</button>
      <button @click="back">목록으로</button>
    </div>
  </section>
</template>

<style scoped>
.detail-box {
  border: 1px solid #e5e7eb;
  border-radius: 12px;
  padding: 20px;
  margin: 16px 0;
}
.meta {
  color: #6b7280;
  font-size: 14px;
}
.content {
  white-space: pre-wrap;
  margin-top: 16px;
  line-height: 1.6;
}
.button-row {
  display: flex;
  gap: 10px;
}
.button-row button {
  border: none;
  padding: 10px 14px;
  border-radius: 8px;
  cursor: pointer;
}
.route-check {
  color: #2563eb;
}
</style>
