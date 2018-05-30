#Schedule with Springboot

## @profile을 이용하여 bean 생성
- -Dspring.profiles.active 값을 multi로 줄 수 있는 점을 활용
- -Dspring.profiles.active=local,haha 로 local 환경과 적용과 haha profile을 사용 할 수 있음
- 서버 구동 시 profile 값에 따라 원하는 bean만 로드 시키고 해당 bean만 schedule 하는 구조로 구성
- rest api로 shutdown 처리 -> actuator 사용 가능.