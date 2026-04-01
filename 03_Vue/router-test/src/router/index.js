import {createRouter, createWebHistory} from 'vue-router';

import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';

const routes = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/', name: 'Home', component: Home},
        { path: '/about', name: 'About', component: About},
        { path: '/videos', name: 'Videos', component: Videos},
        { path: '/members', name: 'Members', component: Members}
    ]
})

export default routes;