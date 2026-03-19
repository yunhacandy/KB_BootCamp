let arr = [10,20,30,40];
let [a1,a2,a3] = arr;   //구조분해 할당
console.log(a1, a2, a3);

let p1 = { name:"홍길동", age:20, gender:"M" };
let { name: n, age:a, gender } = p1;
console.log(n, a, gender);  //gender는 변수명과 프로퍼티명이 같으면 생략 가능
