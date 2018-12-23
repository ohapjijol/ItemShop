# ItemShop
## 매주 모임 장소
- 일요일 2시 충무로역 CAFFE ON THE PLANE
## 필수 Install 및 설치 내역
- NPM/ Yarn Install
- VS code/Eclipse
- Node.js 설치
- Java 8버전
- git 설치
- DB Clinet - 편한걸로
- 스프링 IDE - Intelij, eclipse 편한걸로
- DB - mariaDB
- REST API 방식(Swagger?) - 추후 결정
- Java Build- Gradle

## DB 접속 정보
- 엔드포인트 : itemshop.c3lehcfdsxdf.ap-northeast-2.rds.amazonaws.com
- 사용자 : root
- 암호 : root1234
## MyBatis 설정
- com.shop.item.model 밑에 있는 클래스들은 type-alias가 설정되어 있음
- map-under-score-to-camel-case=true 의미는 table에서 underscore로 되어있는 테이블명이 class에서 camel-case와 맵핌됨을 의미

## UI 정보
- React 기반 Server Side Rendering Framework Next.js
- NPM or Yarn 미설치 시 https://nodejs.org/ko/에서 LTS 버전 설치
- git clone https://github.com/ohapjijol/ItemShop.git
- cmd 실행 후 프로젝트/nextjs 로 이동
- npm install(맨 처음만) 실행
- npm run dev 실행
- http://localhost:3000 접속
