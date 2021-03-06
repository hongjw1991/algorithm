>## 1.깊이 우선 탐색(DFS = Depth First Search)
##	* 이미지는 아래와 같음
	<img src="/TopCoder/src/exhaustiveSearch/image/dfs.png" />
##	* 기본적인 구현 방법(스택사용)
####		- 탐색은 정점 1(A)에서 시작. 그곳에서부터 아래로 갈 수 있는 곳을 찾음
####		- 왼쪽 방향부터 발견, 2라고 하면 탐색이 끝났을 때, 정점 1로 다시 돌아옴
####		- 즉, 1을 탐색하고 있었다는 정보를 저장해야함.
####		- 배열에 해당 정보를 저장하는데, 왼쪽의 정보는 시작 지점으로부터 가까운 정점이며, 오른쪽의 정보는 더 이상 정점이 없을 때 이전 위치로 돌아오기 위해 사용됨.

###	* 재귀함수를 이용한 구현
####		- 정점을 조사한 정보를 저장하는 것은 매우 귀찮음. 전후 처리 코드가 필요하여 번잡
####		- 피보나치수열이 가장 대표적 예

###	* 사용하는 경우
####		- 모든 경로를 탐색 후 결과를 확인해야 하는 경우
####		- 문자열 등을 탐색시 "사전 순서로 앞에 오는 것"처럼 앞부터 검색하는 것이 빠른 경우

>## 2. 너비 우선 탐색(BFS = Breadth First Search)
###	* 기본적인 구현 방법
####		- 이전 정점으로 돌아올 필요가 없다.
####		- 가까운 순서로 탐색하니 나중에 발견한 정점은 나중에 탐색
####		- 너비 우선 탐색은 메모리에 추가된 정점 중 오래된 것부터 차례대로 탐색
####		- 최단 경로 문제 등에 많이 사용됨.

###	* 사용하는 경우
####		- 시작 지점에서 가장 가까운 것을 구하고 싶은 경우
####		- 탐색 범위 자체는 넓더라도 어느 정도 근처에 구하고 싶은 해가 존재하는 것을 알고 있는 경우
####		- 탐색 범위가 굉장히 넓으며 깊이 우선 탐색 사용시 스택이 대량으로 사용되는 경우