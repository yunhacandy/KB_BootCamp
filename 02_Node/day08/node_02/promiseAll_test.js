//회원가입 3단계
// 1. api 호출되면 db에 회원 정보 저장
// 2. 이메일 보내고
// 3. 성공메시지 보여줌
// 해당 시나리오를 프로미스 객체로 작성

const DB = []; //회원 정보 저장

//가입 요청한 회원의 정보 저장 함수
function saveDB(user) {
  const oldDBSize = DB.length; //변경 전
  DB.push(user); //saveDB로 전달받은 사용자 정보를 DB배열에 저장
  console.log(`save ${user.name} to DB`);

  return new Promise((resolve, reject) => {
    if (DB.length > oldDBSize) {
      resolve(user);
    } else {
      reject(new Error('Save DB Error!'));
    }
  });
}

// 정보 저장 후 이메일 발송 함수
function sendEmail(user) {
  console.log(`email to ${user.email}`);
  return new Promise((resolve) => {
    resolve(user);
  });
}

// 성공 메시지 출력
function getResult(user) {
  return new Promise((resolve, reject) => {
    resolve(`success register ${user.name}님!`);
  });
}

function registerByPromise(user) {
  //비동기 호출이지만, 순서 지켜서 실행
  const result = saveDB(user).then(sendEmail).then(getResult);
  //아직 완료되지 않았으므로 지연(pending) 상태
  console.log(result);
  return result;
}

const myUser = {
  email: 'a@b.com',
  password: '1234',
  name: '윤하',
};

allResult = Promise.all([saveDB(myUser), sendEmail(myUser), getResult(myUser)]);

allResult.then(console.log);
