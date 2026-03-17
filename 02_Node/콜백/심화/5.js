for(var i= 0; i<3; i++){
    setTimeout(function(){
        console.log(i);
    },1000);
}
//결과: 3 3 3
//var는 블록이 아닌 함수 단위로 묶여서 반복문이 끝나면 i는 하나만 남음

//let은 블록 스코프라서 바꾸면 0,1,2

//IIFE 방식
for(var i=0; i<3; i++){
    (function(i){
        setTimeout(function(){
            console.log(i);
        },1000);
    })(i);
}
// i를 함수 인자로 복사
// 각 반복마다 새로운 값 고정