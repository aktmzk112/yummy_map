<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"/>
    <link  rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
    <link rel="stylesheet" href="/YummyMap/css/board/boardWrite.css">
    <link rel="stylesheet" href="/YummyMap/css/nav.css">
    <script type="text/javascript" src="/YummyMap/js/jquery-3.5.0.min.js"></script>
    <script type="text/javascript" src="/YummyMap/js/bootstrap.bundle.min.js"></script>
<style>

</style>
</head>
<body>
  <!-- nav 영역입니다-->
<div class="bg-white border-bottom fixed-top nav-body">
  <div class=" mt-2 nav-btn">
      <div class="member_nav text-right mt-3">
          <div class="ctQZg">
              <div class="_47KiJ">
                  <div class="XrOey"><a class="_0ZPOP kIKUG _4700r " href="#"><svg aria-label="활동 피드"
                              class="_8-yf5 " fill="#262626" height="24" viewBox="0 0 48 48" width="24">
                              <path
                                  d="M34.6 6.1c5.7 0 10.4 5.2 10.4 11.5 0 6.8-5.9 11-11.5 16S25 41.3 24 41.9c-1.1-.7-4.7-4-9.5-8.3-5.7-5-11.5-9.2-11.5-16C3 11.3 7.7 6.1 13.4 6.1c4.2 0 6.5 2 8.1 4.3 1.9 2.6 2.2 3.9 2.5 3.9.3 0 .6-1.3 2.5-3.9 1.6-2.3 3.9-4.3 8.1-4.3m0-3c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5.6 0 1.1-.2 1.6-.5 1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z">
                              </path>
                          </svg></a>
                      <div class="_0Sl_t">
                          <div class="poA5q" style="margin-left: -423px;"></div>
                      </div>
                  </div>
                  <div class="XrOey"><a href="#"><svg aria-label="프로필" class="_8-yf5 " fill="#262626" height="24"
                              viewBox="0 0 48 48" width="24">
                              <path
                                  d="M24 26.7c7.4 0 13.4-6 13.4-13.4S31.4 0 24 0 10.6 6 10.6 13.4s6 13.3 13.4 13.3zM24 3c5.7 0 10.4 4.6 10.4 10.4S29.7 23.7 24 23.7s-10.4-4.6-10.4-10.4S18.3 3 24 3zm9.1 27.1H14.9c-7.4 0-13.4 6-13.4 13.4v3c0 .8.7 1.5 1.5 1.5s1.5-.7 1.5-1.5v-3c0-5.7 4.6-10.4 10.4-10.4h18.3c5.7 0 10.4 4.6 10.4 10.4v3c0 .8.7 1.5 1.5 1.5s1.5-.7 1.5-1.5v-3c-.1-7.4-6.1-13.4-13.5-13.4z">
                              </path>
                          </svg></a></div>
              </div>
              <!-- <a href="#" class="badge badge-light nav-item" id="join">Join</a>-->
              <a href="#" class="badge badge-light nav-item" id="login">LOGIN</a>
              <a href="#" class="badge badge-light nav-item" id="logout">LOGOUT</a>
          </div>
      </div>
  </div>
  <a class="navbar-brand tcolor logo" href="#" id="">
      YUMMY MAP
  </a>
  <div class="b-subtitle text-left"><p class="pt-3">커뮤니티</p></div>
  <div class=" nav-item-1 d-flex justify-content-end">
      <a class="navbar-brand nav-item-size" href="#" id="">
          <i class="fas fa-gamepad"></i>
      </a>
      <a class="navbar-brand nav-item-size" href="#">
          <i class="far fa-clipboard"></i>
      </a>
  </div>
</div>
<!-- nav 마지막 입니다-->

<!-- body 시작 입니다-->
  <div class="main-body">
    <div class="txt-line mb-4">
      <form action="cttxt" method="POST" id="frm">
        <div class="form-group d-flex">
          <div class="dropdown">
            <a class="btn btn-secondary dropdown-toggle cat pt-2" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              카테고리선택
            </a>
            <div class="dropdown-menu cat-txt" aria-labelledby="dropdownMenuLink">
              <div class="dropdown-item cat-item" href="#">한식</div>
              <div class="dropdown-item cat-item" href="#">중식</div>
              <div class="dropdown-item cat-item" href="#">일식</div>
            </div>
          </div>
          <input type="hidden" name="cat" id="cat" value="">
          <input type="text" class="form-control ml-1" id="title" name="title" placeholder="제목">
        </div>
        <div class="form-group mt-2">
            <textarea class="form-control" id="txt"" rows="15" name="txt" style="resize: none;"></textarea>
        </div>
        <button type="button" class="btn btn-primary btn-sm" id="submitBtn">완료</button>
        <button type="button" class="btn btn-secondary btn-sm" id="exitBtn">취소</button>
        </form>
    </div>
  </div>
<!-- body 마지막 입니다-->
</body>
<script type="text/javascript">
$(document).ready(function () {
  $('.cat-item').click(function(){
    let cat = $(this).html();
    $('#cat').val(cat);
  });
});
</script>
</html>