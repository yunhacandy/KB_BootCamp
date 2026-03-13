async function myName() {
  return 'Yunha';
}

async function showName() {
  const name = await myName();
  console.log(name);
}

console.log(showName());
