import { createRouter, createWebHistory } from 'vue-router';
import BoardList from '@/pages/BoardList.vue';
import BoardDetail from '@/pages/BoardDetail.vue';
import BoardCreate from '@/pages/BoardCreate.vue';
import BoardEdit from '@/pages/BoardEdit.vue';

const routes = [
  // TODO-02
  // 아래 라우터 설정을 읽고, 각 path / name / component가 무슨 역할인지 설명해 보세요.
  // 설명을 할 줄 안다면, 아래 라우터객체들을 주석처리하고 직접 하드코딩해 보세요
  { path: '/', name: 'board-list', component: BoardList },
  { path: '/create', name: 'board-create', component: BoardCreate },
  {
    path: '/detail/:id',  //url 주소 (필수)
    name: 'board-detail', //라우터 식별 이름, url 대신 이름으로 이동 가능 (필요시.. 별명 같은 느낌)
    component: BoardDetail, //해당 URL에서 보여줄 화면
    props: true,  //url 파라미터 값을 컴포넌트의 props로 전달해주는 옵션
    /*
    props를 사용 안하면 아래처럼
    import { useRoute } from 'vue-router'

    const route = useRoute()
    const id = route.params.id
    */
  },
  { path: '/edit/:id', name: 'board-edit', component: BoardEdit, props: true },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
