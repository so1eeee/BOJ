## 문제 링크
[BOJ_2018_수들의 합 5](https://www.acmicpc.net/problem/2018)

## 알고리즘 분류
- 수학
- 두 포인터

## 문제

어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.

예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.

N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.

## 입력

첫 줄에 정수 N이 주어진다.


## 출력

입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오



## 🤔 문제 해결

이중 for문을 돌면서 문제를 해결한다면 시간초과가 날 수 있기에 **투 포인터** 알고리즘을 활용하였다. 투 포인터를 활용한다면 시간복잡도를 O(N^2)에서 O(N)까지 줄일 수 있다.

주로 투 포인터 방식은 정렬된 배열에서 두 개의 포인터를 이동시키면서 문제를 해결하지만 이 문제에서는 연속된 자연수를 포인터로 사용하였다. 여기서 포인터는 연속된 수의 시작점과 끝점의 역할을 한다.

변수 i는 연속된 자연수들의 시작점이고 끝점은 j가 된다. sum이 범위 내의 숫자들의 합을 계산하고 그 합이 만약에 N이 된다면 가능한 조합이기에 결과값 변수 cnt++ 해주었다.
N을 초과하는 경우 해당 시작점에서 탐색을 멈추고 다음 시작점으로 넘어간다.




| 사용한 언어  | 메모리     | 시간    |
|:--------|:--------|:------|
| Java 11 | 17724KB | 356ms |
