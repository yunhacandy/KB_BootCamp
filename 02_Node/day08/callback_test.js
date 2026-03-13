//회원가입 3단계
// 1. api 호출되면 db에 회원 정보 저장
// 2. 이메일 보내고
// 3. 성공메시지 보여줌
// 해당 시나리오를 콜백함수로 작성

const DB = []; //회원 정보 저장

//회원가입 api 함수
function register(user) {
  return saveDB(user, function (user) {
    return sendEmail(user, function (user) {
      return getResult(user);
    });
  });
}

//가입 요청한 회원의 정보 저장 함수
function saveDB(user, callback) {
  DB.push(user);
  console.log(`save ${user.name} to DB`);
  return callback(user);
}

// 정보 저장 후 이메일 발송 함수
function sendEmail(user, callback) {
  console.log(`email to ${user.email}`);
  return callback(user);
}

// 성공 메시지 출력
function getResult(user) {
  return `success register ${user.name}님!`;
}

// register()함수는
// saveDB()
// sendEmail()
// getResult()
// 차례로 함수가 실행된다.
// 여기서 보장하는 것은 함수의 실행 순서

const result = register({
  email: 'a@b.com',
  password: '1234',
  name: '윤하',
});
console.log(result);
