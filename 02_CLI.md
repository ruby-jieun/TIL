# CLI

Command Line Interface

커맨드(명령어)를 통해 작동하는 인터페이스

<->GUI(Graphic User Interface, 보통의 프로그램)



## CLI 버전관리

* Working tree(작업트리)
  * Working Tree, Working Eirectory
  * File의 수정, 저장 등의 작업을 하는 Directory로 눈으로 볼 수 있는 Directory
* Staging Area(스테이지)
  * Stage, Staging Area
  * Version으로 만들 File이 대기하는 곳, 눈으로 볼 수 없음
  * `.git/index File`에 저장됨
* Repository(저장소)
  * Repository는 Stage에서 대기하고 있던 File들을 Version으로 만들어 저장하는 곳, 눈으로 볼 수 없음
  * `.git/HEAD Flie`에 저장됨



#### <Version을 만드는 순서>

1. Working Tree에서 문서 작업을 함
2. 작업한 것을 Version으로 만들기 위해 Stage에 저장함
3. Stage에 있던 File을 Version으로 만들기 위한 명령어인 Commit명령으로 처리함



## GUI vs CLI

* GUI(Graphic User Interface): 그래픽 유저 인터페이스 (컴퓨터 사용을 __그래픽__으로 함)
* CLI(Command Line Interface): 명령어(줄) 인터페이스 (컴퓨터 사용을 __명령어__로 함)



## CLI 명령어

Unix 계열 명령여(Linux, Mac) | Windows



#### (1)`pwd`

* print working directory: 현재 위치를 출력/ 현재 폴더의 경로
* ~(gome directory): 홈 디렉토리(git bash 처음 열면 나오는 기본 폴더)



#### (2)`ls`

* ls(list): 현재 폴더의 내용을 출력(list)



#### (3)`cd [폴더명]`

* change directory: 폴더를 이동
* `..`: 상위 폴더
* `.`: 현재 폴더
* `~`: 홈 폴더
* `/`:  루트 폴더



### (4)`mkdir[폴더명]`

* make directory: 폴더를 생성



### (5)`rm [폴더명]`

* rm : remove: 파일 삭제



### (6)`rm -r [폴더명]`

* -r : remove recursive(재귀적으로): 폴더를 삭제



### (7)`touch [파일명]`

* touch : 파일을 생성



### (8)`cp [파일명] [위치]`

* cp(copy): 파일 복사



### (9)`cp -r [폴더명] [위치]`

* 폴더를 복사



### (10)`mv [파일/폴더명] [바꿀파일/폴더명]`

* mv(move):파일/폴더명 변경
* mv [파일/폴더명] [위치]:  파일 또는 폴더를 __이동__

