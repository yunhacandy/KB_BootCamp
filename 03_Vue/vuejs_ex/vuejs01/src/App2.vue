<script setup>
import FrontWheel from "@/components/FrontWheel.vue";
import RealWheel from "@/components/RealWheel.vue";
import CarBody from "@/components/CarBody.vue";
</script>
<template>
  <div class ="car">
    <div class="wheel-container">
      <FrontWheel/>
      <RealWheel/>
    </div>
    <div class ="body">
      <CarBody/>
    </div>
  </div>
</template>
<style scoped>
.car {
  position: relative;
  width: 400px;
  margin: 100px auto;
}
.wheel-container {
  display: flex;
  justify-content: space-between;
}
.body {
  position: absolute;
  top: -100px;
  left: 50%;
  transform: translateX(-50%);

  width: 350px;
  height: 100px;
  background-color: yellow;
}
</style>