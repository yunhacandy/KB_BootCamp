var obj = { result:0 };
obj.add = function(x,y) {
  function inner() {
    this.result = x+y;
  }
  inner();  // inner() 함수는 일반 함수로 호출되므로 this는 전역 객체를 가리킴
}
obj.add(3,4)

console.log(obj)        // { result: 0 }
console.log(result)     // 7