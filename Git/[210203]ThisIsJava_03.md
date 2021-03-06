# [210203]This is Java_03



##### 정확한 계산은 정수 사용

* 정확하게 계산해야 할 때는 부동소수점(실수)타입을 사용하지 않는 것이 좋음
* 부동소수점 타입(float, double)은 0.1을 정확히 표현할 수 없어 근사치로 처리함
* 정확한 계산이 필요하다면 정수 연산으로 변경해서 계산해야함



##### NaN과 Infinity 연산

* `/`,`%` 연산자를 사용할 때, 좌측 피연산자가 정수 타입인 경우 나누는 수인 우측 피연산자는 0을 사용할 수 없음

```bash
5 / 0 -> ArithmeticException 예외 발생
5 % 0 -> ArithmeticException 예외 발생
```

* 실수 타입 `0.0`또는 `0.0f`로 나누면 `/` 연산의 결과는 Infinity(무한대), `%` 연산의 결과는 NaN(Not a Number)을 가짐

  * `/`,`%` 의 연산의 결과가 Infinity,Nan이 나오면 데이터가 엉망이 될 수 있으므로 다음 연산을 수행해서는 안됨

  

**입력값의 NaN 검사**

* 부동소수점(실수)을 입력 받을 때는 반드시 NaN(Not a Number)검사를 해야함
* NaN문자열은 Double.valueOf() 메소드에 의해 double 타입으로 변환되면 NaN이 됨
*  val에는 NaN이 저장됨
* NaN은 산술 연산이 가능하지만, 어떠한 수와 연산되면 결과는 NaN이 산출됨
* Double.isNaN()를 이용해서 변수 val 값이 NaN인지 검사
  * == 연산자를 사용하면 안됨(!=연산자를 제외한 모든 비교 연산자를 사용할 경우 false 값을 리턴함)
  * Double.isNaN() 메소드는 매개값이 NaN이라면 turn을 리턴함



#### 3.4.2 문자열 연결 연산자(+)

* 문자열을 서로 결합하는 연산자
* +연산자는 산술 연산자, 부호 연산자, 문자열 연산자임



#### 3.4.3 비교연산자(<,<=,>,>=,==,!=)

| 연산식 | 설명                             |
| :----- | -------------------------------- |
| ==     | 두 피연산자의 값이 같은지를 검사 |
| !=     | 두 피연산자의 값이 다른지를 검사 |
| >      | 피연산자1이 큰지를 검사          |
| >=     | 피연산자1이 크거나 같은지를 검사 |
| <      | 피연산자1이 작은지를 검사        |
| <=     | 피연산자1이 작거나 같은지를 검사 |



#### 3.4.4 논리 연산자(&&,||,&,|,^,!)

* AND(논리곱)
  * `&&`, `&` (피연산자 모두가 true일 경우에만 연산 결과는 true)
* OR(논리합)
  * `||`,`|`(피연산자 중 하나면 true이면 연산 결과는 true)
* XOR(배타적논리합)
  * `^`(피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산 결과는 true)
* NOT(논리부정)
  * `!`(피연산자의 논리값을 바꿈)



#### 3.4.5 비트 연산자(&,|,^,~,<<,>>,>>>)

* 비트 연산자는 데이터를 비트(bit) 단위로 연산함
* 논리 연산자(`&`,`|`,`^`,`~`)와 비트 이동 연산자(`<<`,`>>`,`>>>`)로 구분함




__비트 논리 연산자(&,|,^)__

* AND(논리곱)`&`(두 비트 모두 1일 경우에만 연산 결과가 1)
* OR(논리합)`|`(두 비트 중 하나만 1이면 연산 결과는 1)
* XOR(배타적 논리합)`^`(두 비트 중 하나는 1이고 다른 하나는 0일 경우 연산 결과는 1)
* NOT(논리부정)`~`(보수)



__비트 이동 연산자(<<,>>,>>>)__

* a<<b (정수 a의 각 비트를 b만큼 왼쪽으로 이동(빈자리는 0으로 채워짐))
* a>>b (정수 a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 정수 a의 최상위 부호 비트(MSB와 같은 값으로 채워짐))
* a>>>b (정수a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 0으로 채워짐))



#### 3.4.6 대입 연산자(=,+=,-=,*=,/=,%=,&=,^=,|=,<<=,>>=,>>>=)

* 변수`=`피연산자 (우측의 피연산자의 값을 변수에 저장)
* 변수`+=`피연산자(우측의 피연산자의 값을 변수의 값과 더한 후에 다시 변수에 저장)
* 변수`-=`피연산자(우측의 피연산자의 값을 변수의 값에서 뺀 후에 다시 변수에 저장)
* 변수`*=`피연산자(우측의 피연산자의 값을 변수의 값과 곱한 후에 다시 변수에 저장)
* 변수`/=`피연산자(우측의 피연산자의 값으로 변수의 값을 나눈 후에 다시 변수에 저장)
* 변수`%=`피연산자(우측의 피연산자의 값으로 변수의 값을 나눈 후에 나머지를 변수에 저장)
* 변수`&=`피연산자(우측의 피연산자의 값과 변수의 값을 &연산 후 결과를 변수에 저장)
* 변수`|=`피연산자(우측의 피연산자의 값과 변수의 값을 | 연산 후 결과를 변수에 저장)
* 변수`^=`피연산자(우측의 피연산자의 값과 변수의 값을 ^ 연산 후 결과를 변수에 저장)
* 변수`<<=`피연산자(우측의 피연산자의 값과 변수의 값을 << 연산 후 결과를 변수에 저장)
* 변수`>>=`피연산자(우측의 피연산자의 값과 변수의 값을 >> 연산 후 결과를 변수에 저장)
* 변수`>>>=`피연산자(우측의 피연산자의 값과 변수의 값을 >>> 연산 후 결과를 변수에 저장)



### 3.5 삼항연산자

* 삼항연산자(?:)는 세 개의 피연산자를 필요로 하는 연산자를 말함
* 조건 연산식이라고도 함
* ? 앞의 조건식에 따라 콜론(:) 앞뒤의 피연산자가 선택됨

