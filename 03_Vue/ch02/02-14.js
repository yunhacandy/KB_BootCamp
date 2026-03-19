var obj = { result:0 };
obj.add = function(x,y) {
  function inner() {
    this.result = x+y;
  }
  inner = inner.bind(this); //2. this를 obj로 고정
  inner() //3. this가 obj니까 obj.result에 x+y가 할당됨
}
obj.add(3,4)  //1. 호출되는 순간 this는 obj를 가리킴

console.log(obj)        // { result: 7 }