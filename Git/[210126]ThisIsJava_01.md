# 1.자바 시작하기



## 1.1 프로그래밍 언어란?

* 기계어
  * 컴퓨터가 이해할 수 있는 언어(0과1로 이루어진 언어)

* 고급 언어, 저급 언어
  * 고급 언어 - 사람이 쉽게 이해할 수 있는 언어(C, C++, Java)
  * 저급 언어 - 기계어에 가까운 언어(대표적으로 어셈블리어)

* 작성(사용자) → 소스 → 컴파일러 → 기계어(0,1) → 실행(기계어)



## 1.2 자바란?

### 1.2.1 자바 소개

* 1995년도에 처음 썬 마이크로시스템즈에서 자바 언어 발표

* 19991년 썬의 엔지니어들에 의해서 고안된 오크(Oak)에서 시작

* 오크는 가전제품 목적이었으나, 인터넷의 등장과 함께 인터넷 프로그래밍 언어로 사용되며, 이름도 자바로 변경됨

* 메모리 및 CPU를 지나치게 많이 사용했기에 C++언어에 비해 아주 열세
* 인터넷이 활성화되면서 앱 애플리케이션 구축용 언어로 자바 급부상
  *  다양한 서버 운영 체제에서 단 한 번의 작성으로 모든 곳에 실행 가능한 유일했던 언어



### 1.2.2 자바의 특징



####   1) 이식성이 높은 언어이다.

* 이식성(서로 다른 실행 환경을 가진 시스템 간에 프로그램을 옮겨 실행할 수 있는 것)

* 이식성이 높다(MS 윈도우에서 실행하는 프로그램을 리눅스 or 유닉스에서 실행할 수 있다)

* MS 윈도우에서 실행되는 대부분의 프로그램은 MS 윈도우 환경에 최적화되어 있기에, 유닉스나 리눅스에서 실행하려면 프로그램 소스 파일을 수정한 후, 재 컴파일 과정을 거쳐야 함

* 자바 언어로 개발된 프로그램은 소스 파일을 수정하지 않아도, 자바 실행 환경이 설치되어 있는 모든 운영체제에서 실행이 가능



####   2) 객체 지향 언어이다.

* 객체 지향 프로그래밍(OOP : Object Oriented Programming)
  * 부품에 해당하는 객체들을 먼저 만들고, 하나씩 조립해서 전체 프로그램을 완성하는 기법
* 100% 객체 지향 언어
* 클래스 작성(객체를 만들기 위한 설계도)
* 객체와 객체를 연결하여 프로그램을 제작
* 캡슐화, 상속, 다형성 기능을 완벽하게 지원



####   3) 함수적 스타일 코딩을 지원한다.

* 함수적 프로그래밍(대용량 데이터의 병렬 처리, 이벤트 지향 프로그래밍 적합)

* 람다식을 자바 8부터 지원
* 람다식(Lambda Expressions)
  * 이름 없이 만들어진 함수(람다함수, 람다식, 람다)
  * 컬렉션의 요소의 필터링, 매핑, 집계 처리가 쉽다
  * 코드가 매우 간결해짐



####   4) 메모리를 자동으로 관리한다.

* C++은 메모리에 생성된 객체를 제거하기 위해 개발자가 직접 코드를 작성해야 함
  * 이 작업을 성실하게 해주지 않으면, 프로그램이 불완전해지고 갑자기 다운되는 현상을 겪게 됨

* 자바는 개발자가 직접 메모리에 접근할 수 없도록 설계

* 메모리는 자바가 직접 관리함

* 객체 생성 시 자동으로 메모리 영역을 찾아 할당, 사용 완료 후에 쓰레기 수집기(Garbage Collector)를 실행시켜

​    자동으로 사용하지 않는 객체를 제거함

* 개발자는 메모리 관리의 수고를 덜고, 핵심 기능 코드 작성에 집중할 수 있다.



####   5) 다양한 애플리케이션을 개발 할 수 있다.

* 윈도우, 리눅스, 유닉스, 맥 등 다양한 OS에서 실행되는 프로그램 개발 가능

* 콘솔 프로그램, 윈도우 애플리케이션, 서버용 웹 애플리케이션, 모바일용 안드로이드 앱 등 개발 가능

* 에디션(Edition)
  * 다양한 운영체제에서 사용할 수 있는 개발 도구, API



####   6) 멀티 스레드(Multi-Thread)를 쉽게 구현할 수 있다.

* 멀티 스레드가 필요한 경우
  * 하나의 프로그램이 동시에 여러 가지 작업을 처리해야할 경우
  * 대용량 작업을 빨리 처리하기 위한 서브 작업으로 분리해서 병렬 처리할 경우
* 스레드 생성 및 제어와 관련된 라이브러리 API를 제공하기에, 운영체제와 상관없이 멀티 스레드를 쉽게 구현 가능

  

####   7) 동적 로딩(Dynamic Loading)을 지원한다.

* 애플리케이션이 실행될 때 모든 객체가 생성되지 않고, 객체가 필요한 시점에 클래서를 동적 로딩해서 객체를 생성함

* 개발 완료 후 유지보수(수정)가 발생하더라도 해당 클래스만 수정하면 되므로 전체 애플리케이션을 다시 컴파일할 필요가 없음

* 유지보수를 쉽고 빠르게 진행할 수 있음



####   8) 막강한 오픈소스 라이브러리가 충분하다.

* 오픈소스 언어이기에, 검증된 오픈 소스 라이브러리를 사용하면, 개발 기간을 단축하면서 안전성이 높은 애플리케이션을 쉽게 개발할 수 있음



###   1.2.3 자바 가상 기계(JVM)

* 자바는 완전한 기계어가 아닌, 바이트 코드이기 때문에 가상의 운영체제가 필요함

* JVM(Java Virtual Machine)은 자바에서 가상의 운영체제 역할을 함

* 바이트 코드는 모든 JVM에서 동일한 실행 결과를 보장하지만, JVM은 운영체제에 종속적임

* JVM은 운영체제에 맞게 설치되어야 함

* Write once, run anywhere. (한 번 작성하면 어디서든 실행된다)

* C, C++보다는 속도가 느리다는 단점



##  1.3 자바 개발 환경 구축

###   1.3.1 자바 개발 도구(JDK) 설치



* JRE = JVM + 표준 클래스 라이브러리

* JDK = JRE + 개발에 필요한 도구



###   1.3.2 API 도큐먼트

* API(Application Programming Interface) - JDK에서 제공하는 표준 클래스 라이브러리

* dose.oracle.com/javase/8/docs/api/



##  1.4 자바 프로그램 개발 순서

###   1.4.1 소스 작성에서부터 실행까지

   1) .java 소스 파일 작성

   2) 컴파일러(javac.exe)로 바이트 코드 파일(.class) 생성

   3) JVM 구동 명령어(java.exe)로 실행



##  1.5 주석과 실행문

###   1.5.1 주석 사용하기

* 코드에 설명을 붙인 것

* 주석 기호

​    // (행주석)

   /*~*/ (범위 주석)

* 주석문은 코드 내 어디서든 작성이 가능하지만, 문자역("")내부에는 올 수 없음



###   1.5.2 실행문과 세미콜론(;)

* 실행문(변수 선언, 값 저장, 메소드 호출에 해당하는 코드)

* 마지막에 반드시 세미콜론(;)을 붙여서 실행문이 끝났음을 표시



##  1.6 이클립스 설치

###   1.6.1 이클립스 소개

* 통합 개발 환경 제공(프로젝트 생성, 자동 코드 완성, 디버깅 기능)





* Java SE(Standard Edition) - 기본 에디션
  * 자바 가상 기계(JVM : Java Virtual Machine)를 비롯하여 자바 프로그램 개발에 필수적인 도구와 라이브러리 API를 정의
  * 클라이언트, 서버 프로그램에 상관 없이 자바 프로그램을 개발, 실행하기 위해서는 JDK를 설치해야 함



* Java EE(Enterpise Edition) - 서버용 애플리케이션 개발 에디션

* 분산 환경(네트워크, 인터넷)에서 서버용 애플리케이션을 개발하기 위한 도구 및 라이브러리 API를 정의

* 서버용 애플리케이션
  * Servlet/JSP를 이용한 웹 애플리케이션, 분산 처리 컴포넌트인 EJB, XML 웹 서비스

