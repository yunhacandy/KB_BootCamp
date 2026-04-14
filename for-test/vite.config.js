import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import { fileURLToPath, URL } from 'node:url';
// fileURLToPath : 파일 경로 변환
// URL : 경로 생성

export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)), // @ : src 폴더, vite 내부적으로 URL 방식 경로 사용하게 설정
    },
  },
  server: {
    proxy: {
      // 포트가 다르면 CORS문제 발생할 수 있음. VITE가 중간에 요청을 대신 전달
      '/api': {
        // '/api'로 시작하는 요청만 처리
        target: 'http://localhost:3000', // 요청을 보낼 실제 서버 주소 (json-server 위치)
        changeOrigin: true, // 요청 출처 변경 (CORS 방지)
        rewrite: (path) => path.replace(/^\/api/, ''), // '/api' 제거해서 실제 json-server 주소랑 맞추기
      },
    },
  },
});
