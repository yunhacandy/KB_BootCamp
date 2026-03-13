import http from 'k6/http';

export const options = {
  vus: 100, //가상 유저 100명
  duration: '1s',
};

export default function () {
  http.get('http://localhost:8000');
}
