import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import { fileURLToPath, URL } from 'node:url'

export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    proxy: {
      // TODO-01
      // 목표:
      // 1) '/api'로 시작하는 요청을 json-server(3000번 포트)로 전달하세요.
      // 2) '/api/boards' -> 실제 서버에서는 '/boards'가 되도록 rewrite 하세요.
      '/api':{
        target: 'http://localhost:3000',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api/, ''),
      },
    },
  },
});
