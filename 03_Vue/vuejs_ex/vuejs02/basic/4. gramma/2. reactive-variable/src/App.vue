<!-- 데이터 결합을 통한 사용자 입력 처리 예제
  v-model, v-bind는 컴포넌트에서 선언한 변수와 html의 태그의 속성을 결합할 수 있는 디렉티브
  v-bind는 html의 태그의 속성과 컴포넌트에서 선언한 변수를 결합할 때 사용 (템플릿을 통해 변수값 변경 불가)
  v-model은 html의 태그의 속성과 컴포넌트에서 선언한 변수를 양방향으로 결합할 때 사용 (템플릿을 통해 변수값 변경 가능)
-->
<template>
  <p>줄임말과 원래말을 입력하세요.</p>
  <input type="text" v-bind:value="abbr" />
  <input type="text" v-model="normal" />
  <hr />
  <abbr v-bind:title="normal">{{ abbr }}</abbr>
</template>

<script>
import { ref } from 'vue'

export default {
  // Composition API
  setup() {
    const abbr = ref('WWW')
    const normal = ref('World Wide Web')
    return {
      abbr,
      normal,
    }
  },
}
</script>
