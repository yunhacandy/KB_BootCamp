<template>
  <h2>Small Items</h2>
  <!-- computed 값을 사용하여 작은 아이템 표시 -->
  <p v-for="item in small_items_c" :key="item.id">{{ item.text }}</p>
  <p v-for="item in small_items_o" :key="item.id">{{ item.text }}</p>
  <h2>Big Items</h2>
  <p v-for="item in big_items_c" :key="item.id">{{ item.text }}</p>
  <p v-for="item in big_items_o" :key="item.id">{{ item.text }}</p>
</template>

<script>
import { reactive, computed } from 'vue'

export default {
  //Options API
  data() {
    return {
      arr: [
        { id: 1, text: '1번 옵션 아이템' },
        { id: 2, text: '2번 옵션 아이템' },
        { id: 3, text: '3번 옵션 아이템' },
        { id: 4, text: '4번 옵션 아이템' },
        { id: 5, text: '5번 옵션 아이템' },
      ],
    }
  },
  computed: {
    // computed 값을 사용하여 작은 아이템과 큰 아이템을 구분하여 반환
    // computed은 캐싱이 되기 때문에, arr이 변경되지 않으면 계산된 값이 재사용됩니다. (변경되면 자동 재계산)
    // 즉 기존 데이터를 기반으로 새로운 데이터를 생성하기에 성능 향상
    small_items_o() {
      return this.arr.filter((i) => i.id < 3)
    },
    big_items_o() {
      return this.arr.filter((i) => i.id >= 3)
    },
  },
  // Composition API
  setup() {
    const arr = reactive([
      { id: 1, text: '1번 아이템' },
      { id: 2, text: '2번 아이템' },
      { id: 3, text: '3번 아이템' },
      { id: 4, text: '4번 아이템' },
      { id: 5, text: '5번 아이템' },
    ])

    const small_items_c = computed(() => {
      return arr.filter((i) => i.id < 3)
    })
    const big_items_c = computed(() => {
      return arr.filter((i) => i.id >= 3)
    })

    return {
      small_items_c,
      big_items_c,
    }
  },
}
</script>
