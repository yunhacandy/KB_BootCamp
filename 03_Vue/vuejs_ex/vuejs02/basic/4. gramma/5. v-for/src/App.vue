<template>
  <div style="width: 200px">
    <ol>
      <!-- v-for 디렉티브를 사용하여 items 배열의 각 요소를 반복 -->
      <li v-for="item in items">{{ item }}</li>
    </ol>
  </div>
</template>

<script>
import { reactive } from 'vue'

export default {
  // Composition API
  setup() {
    const items = reactive({ 1: '1번 객체', 2: '2번 객체', 3: '3번 객체' })
    return {
      items,
    }
  },
}
</script>
