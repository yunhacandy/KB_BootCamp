import { createRouter, createWebHistory } from 'vue-router';
import BoardCreate from '@/pages/BoardCreate.vue';
import BoardDetail from '@/pages/BoardDetail.vue';
import BoardEdit from '@/pages/BoardEdit.vue';
import BoardList from '@/pages/BoardList.vue';
//route 통해서 pages 매칭하기

const routes = [
  // path: url 주소 (필수)
  // name: 라우터 식별 이름 (선택)
  // component: url에서 보여줄 화면
  // props: url 파라티터 값을 컴포넌트의 props로 전달
  { path: '/', name: 'board-list', component: BoardList },
  { path: '/create', name: 'board-create', component: BoardCreate },
  {
    path: '/detail/:id',
    name: 'board-detail',
    component: BoardDetail,
    props: true,
  },
  { path: '/edit/:id', name: 'board-edit', component: BoardEdit, props: true },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
