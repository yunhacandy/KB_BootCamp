<script setup>
defineProps({
  board: {
    type: Object,
    required: true
  }
})
</script>

<template>
  <article class="board-item">
    <RouterLink :to="`/detail/${board.id}`" class="title-link">
      {{ board.title }}
    </RouterLink>
    <p class="meta">
      작성자: {{ board.writer }} / 작성일: {{ board.createdAt }}
    </p>
  </article>
</template>

<style scoped>
.board-item {
  padding: 16px 0;
  border-bottom: 1px solid #e5e7eb;
}
.title-link {
  font-size: 18px;
  font-weight: 700;
  text-decoration: none;
  color: #111827;
}
.meta {
  margin-top: 8px;
  color: #6b7280;
  font-size: 14px;
}
</style>
