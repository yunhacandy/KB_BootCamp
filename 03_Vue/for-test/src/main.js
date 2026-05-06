import { createApp } from 'vue';
import router from './router';
import App from './App.vue';

createApp(App)
  .use(router) //use - vue 앱에 플로그인을 등록하는 함수
  .mount('#app'); //mount - vue 앱을 html 화면에 연결하는 함수
