<script setup>
</script>

<template>
  <div class="app-container">
    <header class="top-bar">
      <h1>Vue Board PBL</h1>
      <nav class="menu">
        <!-- RouterLink to 경로, 화면 전환을 위한 링크 생성 -->
        <RouterLink to="/">목록</RouterLink>
        <RouterLink to="/create">글쓰기</RouterLink>
      </nav>
    </header>

    <main class="content-area">
      <!-- RouterView : 각 경로별 컴포넌트를 렌더링할 위치를 지정 -->
      <RouterView />
    </main>
  </div>
</template>

<style scoped>
* {
  box-sizing: border-box;
}
.app-container {
  max-width: 920px;
  margin: 0 auto;
  padding: 24px;
  font-family: Arial, sans-serif;
}
.top-bar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 12px;
  margin-bottom: 24px;
  border-bottom: 2px solid #e5e7eb;
  padding-bottom: 16px;
}
.menu {
  display: flex;
  gap: 14px;
}
.menu a {
  text-decoration: none;
  color: #2563eb;
  font-weight: 700;
}
.menu a.router-link-active {
  color: #111827;
}
.content-area {
  background: #ffffff;
}
</style>
