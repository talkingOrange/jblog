
# ❤️ SpringMVC JBlog ❤️

## 전체 기능 설명

- 블로그 시스템
- 회원가입 가능 
- 회원가입 시, 해당 사용자의 블로그가 자동 생성
- 생성된 블로그는 블로그 주인뿐만 아니라 인증 없는 외부 접근이 가능
- 인증된 사용자가 자신의 블로그에 접근하면 관리메뉴가 나타나고 관리 메뉴를 통해 블로그 관리페이지에 접근
- 관리 페이지에서 블로그의 여러 설정을 변경 가능

---

## 결과 화면 및 상세 기능 설명

### 👉 사용자의 잘못된 입력 1: /jblog03/aaa 

- 404 error ❌ 500 error ❌ main 🙆‍♀️

![image](https://github.com/talkingOrange/jblog/assets/88815795/7e77636e-376d-4939-b4f8-225af3261634)


### 👉 사용자의 잘못된 입력 2: (사용자ID:dpqmsdl0614인 상황) /jblog03/sonrisa-bonita/admin/basic

- redirect:/dpqmsdl0614 🙆‍♀️

![image](https://github.com/talkingOrange/jblog/assets/88815795/a1867b8b-9f40-4149-b2c0-97711eebbbe8)


---

### 👉 회원가입: /jblog03/user/join

![image](https://github.com/talkingOrange/jblog/assets/88815795/cd159b38-3660-42f6-b28f-a34f3f948f2e)

- 입력창 Empty 및 글자수 체크 ✅

<img src="https://github.com/talkingOrange/jblog/assets/88815795/ae518757-b86f-4842-a886-5391450d4430" width="47%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/a9efdbb3-4a69-4e1d-9a00-33483300af13" width="47%">

### 👉 회원가입완료: /jblog03/user/joinsuccess

![image](https://github.com/talkingOrange/jblog/assets/88815795/4ba722d2-04fa-4101-90a0-f2f88d2d4778)

- 로그인 이동 버튼 ✅

![image](https://github.com/talkingOrange/jblog/assets/88815795/4fb6288e-0659-41ad-b413-acbf2282d129)


### 👉 로그인: /jblog03/user/login

- 로그인 실패 ✅

![image](https://github.com/talkingOrange/jblog/assets/88815795/55e6473b-2fe0-4533-9fb2-ad5668b7621b)
 

- 로그인 성공 ✅ : redirect:/jblog03/

![image](https://github.com/talkingOrange/jblog/assets/88815795/12a1df2a-2a65-4bab-a24c-399946df8dec)



### 👉 블로그: /jblog03/{id}

- 회원가입한 유저, 자동 블로그 생성 ✅
  + 기본 카테고리 추가 및 기본 타이틀, 이미지 설정 👌
  
 ![image](https://github.com/talkingOrange/jblog/assets/88815795/05cb5f9d-e768-41b7-a56b-4a344d910e07)


- 블로그 관리 버튼 유무 ✅

1. 내 블로그인 경우, [블로그 관리] [로그아웃] 버튼 생성 👌

![image](https://github.com/talkingOrange/jblog/assets/88815795/9fc376b7-7073-4bc1-96cd-eb1080ad8e79)

 
   2. 타인 블로그인 경우, [내블로그] [로그아웃] 버튼 생성 👌

![image](https://github.com/talkingOrange/jblog/assets/88815795/2acb2a5a-54df-4ecc-8946-0a211c9b19b9)


   3. 로그인 하지 않은 유저의 경우, [로그인] 버튼 생성 👌

![image](https://github.com/talkingOrange/jblog/assets/88815795/1c16f03f-eaa2-4d22-892f-1e4a1acd4383)



### 👉 블로그 관리; 기본설정: /jblog03/{id}/admin/basic

![image](https://github.com/talkingOrange/jblog/assets/88815795/a7582684-3c61-4b66-a9b6-93a15a515379)

- Read ✅

- Update ✅


 1. 제목만 변경 가능 👌
    - 변경 시, Header와 Footer 동시 변경 ✨

![image](https://github.com/talkingOrange/jblog/assets/88815795/d9512d9d-76e2-48a9-964e-06de44157971)

2. 이미지 변경 👌

<img src="https://github.com/talkingOrange/jblog/assets/88815795/46b458ad-74e1-4666-b71f-c3077d246c58" width="47%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/a02c0a6e-464b-4120-870b-6ac08c6e6287" width="47%">




### 👉 블로그 관리; 카테고리: /jblog03/{id}/admin/category


- Read ✅

![image](https://github.com/talkingOrange/jblog/assets/88815795/b20f9c5f-b8d0-4dcf-b2aa-45ae21f14a01)


- Create ✅

<img src="https://github.com/talkingOrange/jblog/assets/88815795/c274ee72-7f6a-4ffa-8767-8d68f0452b95" width="47%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/e915c26f-32c9-4a7a-9963-416043287a4d" width="47%">

- Update ✅

 + 글 작성 시, post 수 + 1

- Delete ✅

 + 카테고리 삭제 시, 해당 카테고리로 작성된 글 자동 삭제


























- 로그인 상태에 따른 글쓰기 버튼 유무 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/3ce54163-a743-45fb-8612-cea990830f68" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/b3574242-5acb-484f-88c0-a0829049007c" width="47%">


- `?page=?` : 페이징 - limit 5 / pagination count 5 / ▶ / ◀ ✅ 

<img src="https://github.com/talkingOrange/mysite/assets/88815795/51dba298-8b43-4d61-959a-acb9e59af8ba" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/12e1efda-5943-41f2-830f-867b538ced45" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/428a216f-2a94-4b70-a705-ac06f983d925" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/c9d5fc2b-09d8-4b12-8bee-b8130206f00c" width="47%">

- 답글 / 조회수 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/d7df268a-ef4a-4141-ad66-270d20aa0ee4" width="95%">


---

#### 👉 글 보기: mysite/board?a=view&no=?

- 로그인 상태에 따른 답글달기 버튼 유무 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/72d38fcc-9f7e-436b-8c05-d563a3822359" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/2fb28997-8a5b-46de-b653-1e8c3757dd80" width="47%">


- 내 글 유무에 따른 글수정 버튼 유무 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/fd4b847c-8e18-42a2-b6ab-bf89ab9ca69b" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/037b11ce-c652-4d44-bbd0-9d27035e2acb" width="47%">


---

#### 👉 글 쓰기: mysite/board?a=writeform

- 등록 버튼 클릭 시, /board 페이지로 이동 후 작성글 확인 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/7047dd6e-4d2e-4079-861b-020392e2b156" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/7df912cf-524e-49bf-86c7-74422b7b6a5d" width="47%">

- 취소 버튼 클릭 시, /board 페이지로 이동 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/8cab109f-3b34-49d5-8f97-6872c222fe36" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/1006cecf-b748-48fd-b764-815429b2c3fb" width="47%">


---

#### 👉 답글 달기: mysite/board?a=writeform&no=?


- 등록 버튼 클릭 시, /board 페이지로 이동 후 작성글 확인 ✅

  (+) 답글, 답답글, 답답답글... 가능

<img src="https://github.com/talkingOrange/mysite/assets/88815795/784a17ec-4b53-43fa-b125-e507228353ce" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/3354ecf1-61ea-4c20-a81b-a429291c9b9c" width="47%">

- 취소 버튼 클릭 시, /board 페이지로 이동 ✅
 
---

#### 👉 글 수정: mysite/board?a=modifyform&no=?


- 수정 버튼 클릭 시, /board?a=modify&no=? 페이지로 이동 후 수정글 확인 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/c26a7795-2acb-45e0-b065-b45a116154aa" width="47%">
<img src="https://github.com/talkingOrange/mysite/assets/88815795/c00a931c-754b-4269-989b-0891d434de1d" width="47%">

- 취소 버튼 클릭 시, /board?a=view&no=? 페이지로 이동 ✅
 
---

#### 👉 글 삭제: mysite/board?page=?

- 해당 사용자에게만 삭제 버튼 생성 ✅

<img src="https://github.com/talkingOrange/mysite/assets/88815795/dd55573c-cd2e-42d2-bef5-7cedf98d97ff" width="95%">

- 삭제하기 ✅

![삭제gif](https://github.com/talkingOrange/mysite/assets/88815795/a6bfa771-0174-4152-bc91-d720f3068362)



