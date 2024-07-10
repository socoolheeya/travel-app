# Travel app

### 설명

### Travel app은 여행 관련 정보를 제공하는 서비스입니다.


### Git

#### Submodule 추가하기
```bash
# 메인 저장소에서 서브모듈을 추가
git submodule add <repository_url> <path_to_submodule>
git submodule init
git submodule update
```
#### Submodule 업데이트하기
```bash
# 서브모듈을 최신 커밋으로 업데이트
cd <path_to_submodule>
git checkout master
git pull origin master
cd ..
git add <path_to_submodule>
git commit -m "Update submodule"
```


##### 서브모듈 삭제
```bash
git submodule deinit -f <path_to_submodule>
git rm -f <path_to_submodule>
rm -rf .git/modules/<path_to_submodule>
git commit -m "Remove submodule"
```

