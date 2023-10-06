
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

<img src="https://github.com/talkingOrange/jblog/assets/88815795/ae518757-b86f-4842-a886-5391450d4430" width="49%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/a9efdbb3-4a69-4e1d-9a00-33483300af13" width="50%">

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

- 가장 최신에 작성한 글 확인 ✅

- 카테고리별 검색 가능 ✅: /jblog03/{id}?c={category_no} , /jblog03/{id}?c={category_no}&n={post_no}

<img src="https://github.com/talkingOrange/jblog/assets/88815795/f39b8fd2-d866-4024-b508-1e655c6759d5" width="49%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/cf8b432d-9416-4baf-a0ed-ab40ce101d4f" width="50%">


- 글 상세보기 ✅: /jblog03/{id}?n={post_no}

![image](https://github.com/talkingOrange/jblog/assets/88815795/c6466b63-f06e-42a1-ab68-1bb246940e6e)


### 👉 블로그 관리; 기본설정: /jblog03/{id}/admin/basic

![image](https://github.com/talkingOrange/jblog/assets/88815795/a7582684-3c61-4b66-a9b6-93a15a515379)

- Read ✅

- Update ✅


 1. 제목만 변경 가능 👌
    - 변경 시, Header와 Footer 동시 변경 ✨

![image](https://github.com/talkingOrange/jblog/assets/88815795/d9512d9d-76e2-48a9-964e-06de44157971)

2. 이미지 변경 👌

<img src="https://github.com/talkingOrange/jblog/assets/88815795/46b458ad-74e1-4666-b71f-c3077d246c58" width="49%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/a02c0a6e-464b-4120-870b-6ac08c6e6287" width="50%">




### 👉 블로그 관리; 카테고리: /jblog03/{id}/admin/category


- Read ✅
  + 기본 카테고리로 [미분류] 생성 👌
  + 기본 카테고리는 삭제 불가 👌

![image](https://github.com/talkingOrange/jblog/assets/88815795/b20f9c5f-b8d0-4dcf-b2aa-45ae21f14a01)


- Create ✅

<img src="https://github.com/talkingOrange/jblog/assets/88815795/c274ee72-7f6a-4ffa-8767-8d68f0452b95" width="49%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/e915c26f-32c9-4a7a-9963-416043287a4d" width="50%">

- Update ✅

 + 글 작성 시, post 수 + 1 👌

- Delete ✅

 + 카테고리 삭제 시, 해당 카테고리로 작성된 글 자동 삭제 👌


### 👉 블로그 관리; 글작성: /jblog03/{id}/admin/write


![image](https://github.com/talkingOrange/jblog/assets/88815795/3dc633d9-6cd4-4082-b2d3-67f2ab93dc4c)

- Create ✅ : 성공 시, redirect:/{id} 👌

<img src="https://github.com/talkingOrange/jblog/assets/88815795/2da5401c-228c-4f13-aea8-350c5416841e" width="49%">
<img src="https://github.com/talkingOrange/jblog/assets/88815795/918bc718-dfb8-46d2-8b46-0757a2b19ab1" width="50%">




### 👉  로그아웃: redirect:/jblog03/

![image](https://github.com/talkingOrange/jblog/assets/88815795/af78720d-842d-47aa-a18c-d6b4c961070c)





---



# 🧡 DB 설계 🧡

![image](https://github.com/talkingOrange/jblog/assets/88815795/fc0f4179-abca-467a-81e4-0ad0999219c5)


- SQL 테이블 생성

```
-- 사용자(user) 테이블 생성
CREATE TABLE user (
    id VARCHAR(45) PRIMARY KEY NOT NULL,
    name VARCHAR(45) NOT NULL,
    password VARCHAR(64) NOT NULL
);

-- 1:1 식별 관계 
 
 create table blog(
blog_id VARCHAR(45) PRIMARY KEY NOT NULL,
 title varchar(200) not null,
 image varchar(200) not null,

 foreign key (blog_id) references user (id)
 );
 
 -- 1:다 비식별 관계
 
 create table category(
  no int not null auto_increment,
 name varchar(45) not null,
description varchar(200) not null,
blog_id VARCHAR(45) NOT NULL,
postNum Long NOT NULL default 0,
 
primary key(no),
foreign key (blog_id) references blog (blog_id) ON DELETE CASCADE
 );
 
 
 -- 1: 다 비식별 관계
 
create table post(
no int not null auto_increment,
 title varchar(200) not null,
contents TEXT not null,
   category_no int not null,
   date DATE NOT NULL,
   
primary key(no),
foreign key (category_no) references category (no) ON DELETE CASCADE
 );
 

```


- 트리거

```
DELIMITER //

CREATE TRIGGER CreateUserBlogTitle
AFTER INSERT ON user
FOR EACH ROW
BEGIN
    INSERT INTO blog (blog_id, title, image) VALUES (NEW.id, CONCAT(NEW.id, '님의 블로그'), 'assets/images/spring-logo.jpg');
END;
//

DELIMITER ;
```

