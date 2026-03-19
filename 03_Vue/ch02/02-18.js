const d1 = new Date(); //Date가 이미 정의된 객체이므로 변수명으로 사용 가능
let name = "홍길동";
let r1 = `${name}님에게 ${d1.toDateString()}에 연락했다.`;
console.log(r1);

let product = "갤럭시S7";
let price = 199000;
let str = `${product}의 가격은
    ${price}원입니다.`;
console.log(str);