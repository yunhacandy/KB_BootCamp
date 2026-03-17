var obj = { result:0 };
obj.add = function(x,y) {
  const inner = () => { //const로 선언한 inner는 화살표 함수이므로 this가 obj를 가리킴
    this.result = x+y;
  }
  inner()
}
obj.add(3,4)

console.log(obj)        // { result: 7 }