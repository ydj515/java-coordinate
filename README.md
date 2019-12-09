# java-coordinate
좌표계산기 미션을 진행하기 위한 저장소

## RentCar
### 기능 요구사항
#### RentCompany
- create()
    - 생성자를 return
- addCar()
    - List에 생성되는 Car 객체를 add
- generateReport()
    - report를 작성
    
## 좌표 계산기
### 기능 요구사항
#### Main
- run()
    - controller를 실행
    
#### CalculatorPointController
- run()
    - 전체적인 좌표 계산기를 실행
- isOverlapPoints()
    - 입력한 좌표들이 겹치는지 확인
- convertStringToPoint()
    - 입력된 String을 정규식으로 Point객체로 변환 후 List에 담는다
- judgeShape()
    - 입력된 도형이 선, 삼각형, 사각형인지 판단 후 해당 객체 생성

#### PointInputView
- inputPoints()
    - 사용자로부터 좌표를 입력 받음

#### PointOutputView
- printDistance()
    - 선의 거리 출력
- printArea()
    - 다각형 면적을 출력
- printOverlapPoints()
    - 중복된 점이 있다면 중복되었다고 출력

#### Point
- validate()
    - 좌표 값이 24 이하인지 유효성 검증
- getDistance()
    - 점과 점사이 거리를 계산 후 return
- getX()
    - x좌표 return
- getY()
    - y좌표 return

#### Shape
- getResult()
    - 결과 값을 return
    
#### Triangle
- getResult()
    - 결과 값을 return
- calculateSides()
    - 헤론의 공식을 사용하기 위해 각 변 길이를 모두 구한 후 list에 add
- carcluateS()
    - 헤론의 공식의 s 를 구함
    
#### Rectangle
- calculateSides()
    - 사각형의 width, height를 곱하여 return
- getResult()
    - 좌표를 sort 하고, 결과 값을 return
    
#### Line
- getResult()
    - 결과 값을 return