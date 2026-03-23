<template>
  <p>{{ counter }}</p>
  <!-- v-if와 v-else를 사용하여 조건에 따라 요소를 표시하거나 숨김 -->
  <p v-if="counter < 5">5보다 작습니다.</p>
  <p v-else>5와 같거나 큽니다.</p>
  <!-- @click 이벤트 리스너를 사용하여 버튼 클릭 시 counter 값을 증가 -->
  <button @click="counter++">클릭하면 숫자가 올라갑니다.</button>
</template>

<script>
import { ref } from 'vue'

export default {
  // Composition API
  setup() {
    // ref() 함수를 통해 선언된 변수는 프록시 객체로 변환되어 관리
    let counter = ref(0)
    return {
      counter,
    }
  },
}
</script>
