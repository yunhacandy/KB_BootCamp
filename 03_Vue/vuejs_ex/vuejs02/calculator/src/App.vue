<script>
export default {
  data() {
    return {
      cur: '', //현재 입력값
      output: '', //화면 출력값
    };
  },
  methods: {
    operation(event) {
      // console.log('click');
      const n = event.currentTarget.value;

      //C버튼  reset  => cur , output
      if (n === 'C') {
        this.cur = '';
        this.output = '';
        return;
      }
      // = 버튼
      if (n === '=') {
        this.calculate();
        return;
      }

      this.cur = this.cur === null ? n : (this.cur += n);

      // 숫자, 연산자, .  확인

      this.output = this.cur;
    },
    calculate() {
      let operator = '';

      // cur 안에 연산자를 찾기
      if (this.cur.includes('+')) {
        operator = '+';
      } else if (this.cur.includes('*')) {
        operator = '*';
      } else if (this.cur.includes('-')) {
        operator = '-';
      } else if (this.cur.includes('/')) {
        operator = '/';
      } else {
        return;
      }

      //연산자를 기준으로 문자열 분리  split()
      const parts = this.cur.split(operator);
      const left = Number(parts[0]);
      const right = Number(parts[1]);
      //연산 결과값을 저장할 변수 선언 : result =>초기화
      let result = 0;

      if (operator === '+') {
        result = left + right;
      } else if (operator === '-') {
        result = left - right;
      } else if (operator === '*') {
        result = left * right;
      } else if (operator === '/') {
        result = left / right;
      }

      this.output = String(result);
      this.cur = String(result);
    },
  },
};
</script>
<template>
  <div class="calculator">
    <form name="forms">
      <input type="text" v-model="output" name="output" readonly />
      <input type="button" class="clear" value="C" @click="operation($event)" />
      <input
        type="button"
        class="operator"
        value="/"
        @click="operation($event)"
      />
      <input type="button" value="1" @click="operation($event)" />
      <input type="button" value="2" @click="operation($event)" />
      <input type="button" value="3" @click="operation($event)" />
      <input
        type="button"
        class="operator"
        value="*"
        @click="operation($event)"
      />
      <input type="button" value="4" @click="operation($event)" />
      <input type="button" value="5" @click="operation($event)" />
      <input type="button" value="6" @click="operation($event)" />
      <input type="button" class="operator" value="+" @click="operation($event)" />
      <input type="button" value="7" @click="operation($event)" />
      <input type="button" value="8" @click="operation($event)" />
      <input type="button" value="9" @click="operation($event)" />
      <input
        type="button"
        class="operator"
        value="-"
        @click="operation($event)"
      />
      <input type="button" class="dot" value="." @click="operation($event)" />
      <input type="button" value="0" @click="operation($event)" />
      <input
        type="button"
        class="operator result"
        value="="
        @click="operation($event)"
      />
    </form>
  </div>
</template>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background-color: #ffffff;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.calculator {
  width: 287px;
  border: 1px solid #333;
  background-color: #ccc;
  padding: 5px;
}

.calculator form {
  display: grid;
  grid-template-columns: repeat(4, 65px);
  grid-auto-rows: 65px;
  grid-gap: 5px;
}

.calculator form input {
  border: 2px solid #333;
  cursor: pointer;
  font-size: 19px;
}

.calculator form input:hover {
  box-shadow: 1px 1px 2px #333;
}

.calculator form .clear {
  background-color: #ed4848;
}

.calculator form .operator {
  background-color: orange;
}

.calculator form .dot {
  background-color: green;
}

.calculator form input[type='text'] {
  grid-column: span 4;
  text-align: right;
  padding: 0 10px;
}

.calculator form .clear {
  grid-column: span 3;
}

.calculator form .result {
  grid-column: span 2;
}
</style>
