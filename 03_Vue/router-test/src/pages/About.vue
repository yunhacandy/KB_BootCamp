<template>
  <div class="card card-body">
    <h2>About</h2>
    <p>어바웃 페이지입니다.</p>
    <p>요청 경로 : {{ $route.fullPath }}</p>
  </div>
</template>

<script>
export default {
  name: "About",
  created() {
    console.log("경로는 : ", this.$route);
  }
}
</script>
