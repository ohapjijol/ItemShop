# ItemShop

## DB 접속 정보
    - 엔드포인트 : itemshop.cphno6qganog.ap-northeast-2.rds.amazonaws.com
    - 사용자 : itemShop
    - 암호 : itemShop
## MyBatis 설정
    - com.shop.item.model 밑에 있는 클래스들은 type-alias가 설정되어 있음
    - map-under-score-to-camel-case=true 의미는 table에서 underscore로 되어있는 테이블명이 class에서 camel-case와 맵핌됨을 의미