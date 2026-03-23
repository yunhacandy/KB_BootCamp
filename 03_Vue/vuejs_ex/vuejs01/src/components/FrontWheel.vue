<script setup>
  // <script>
  // export default {
  //   setup() {
  //     const message = "Hello";
  //     const welcome = () => {
  //         window.alter(message);
  //     }
  //     return {message, welcome};
  //   }
  // }
  // vue3부터는 아래처럼 간단하게 적을 수 있음.
  import Tire from "./Tire.vue";
  const message = "Hello";
  const welcome = () => {
    window.alert(message);
  }
</script>
<template>
  <div class="front-wheel">
    <span>FrontWheel</span>
    <Tire color ="RED"/>
  </div>
</template>
<style scoped>
.front-wheel {
  border: 1px solid black;
  border-radius: 50%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 150px;
  height: 150px;
}
</style>