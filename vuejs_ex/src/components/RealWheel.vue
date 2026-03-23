<script setup>
  import Tire from "./Tire.vue";
  const message = "Hello";
  const welcome = () => {
    window.alert(message);
  }
</script>
<template>
  <div class="real-wheel">
    <span>RealWheel</span>
    <Tire color ="RED"/>
  </div>
</template>
<style scoped>
.real-wheel {
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