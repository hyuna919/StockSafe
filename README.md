# StockSafe

> 해외 주식 정보와 향후 예측 주가를 확인할 수 있는 웹 사이트.
> 

NasDaq의 주가 총액 상위 260 종목의 주가 및 상세 정보를 Yahoo Finance API를 통해 실시간으로 제공하고 있습니다.(2022년 08월 23일 기준)

Facebook의 시계열 예측 라이브러리 Prophat을 활용하여 향후 1년 동안의 예측 주가를 제공합니다. 

현재 보유 주식과 관심 주식을 등록하여 편리하게 정보를 확인할 수 있습니다. 

![image](https://user-images.githubusercontent.com/49274191/186612536-83cbee74-91df-4d45-a034-f18929e4cb21.png)

![image](https://user-images.githubusercontent.com/49274191/186612573-eb08857e-6184-4a6b-9642-2d2cdecde13a.png)

## 실행 **방법**

- 백엔드

```python
# application-local.properties, application-auth.properties 수정 후 
/gradlew bootRun --args='--spring.profiles.active=local,auth
```

- 프론트엔드

```jsx
npm install
npm run serve
```

## **개발 환경**

| OS | Ubuntu | 20.04 LTS |
| --- | --- | --- |
| DB | MySQL | 8.x |
| Backend | [![Spring Version][Spring-image]][Spring-url]
[Spring-image]: https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white
[Spring-url]: https://spring.io/ |  |
|  | Java | 8 |
| Persistance Framework | Mybatis |  |
| Frontend | Vue | 3.x |

## **업데이트 내역**

- 0.0.2
    - Mybatis → JPA로 변경 예정
- 0.0.1
    - 기본 기능
    - 주가 예측 기능
    

## 기타

Facebook Prophat 라이센스 .. 

[https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white)

[Spring-image]: [https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white)

[Spring-url]: [https://spring.io/](https://spring.io/)
