<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
<link rel="stylesheet" href="/YummyMap/css/member/register.css">
<link rel="stylesheet" href="/YummyMap/css/w3.css">

<link rel="stylesheet" href="/YummyMap/css/bootstrap.min.css">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</head>
<style>

</style>
<body>
  <div class="">
    <div class="container border  all-mar all-wid" style="width: 600px">
      <div class="text-center">
      <img class="img" src="./img/logo_ex.png">
    </div>
    <br>
    <h2 class="login text-right mr-5"> 회원가입하기</h2>
    <br>
    <div class="ml-5 body-wid ">
        <h5 class="input-tit-mar">아이디  </h5>
        <input type="text" class="input-wid">
        <br><br>
        <h5 class="input-tit-mar2">비밀번호  </h5>
        <input type="text" class="input-wid">
        <br><br>
        <h5 class="input-tit-mar2">비밀번호 재입력 </h5>
        <input type="text" class="input-wid">
        <h6 class="title-mar">비밀번호가 일치합니다.</h6>  
        <br>
        <h5 class="">휴대폰 번호 입력  </h5>
          <div class="btn-group">
            <button type="button" class="btn btn-secondary dropdown-toggle btn-wid" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">010</button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <a class="dropdown-item" href="#">Something else here</a>
                <div class="dropdown-divivder"></div>
                <a class="dropdown-item" href="#">Separated link</a>
              </div>
              &nbsp;&nbsp;&nbsp;
            <h5> - </h5>
            &nbsp;&nbsp;
             <input type="text" class="" style="width: 150px;">
             &nbsp;&nbsp;
            <h5> - </h5>
            &nbsp;&nbsp;
            <input type="text" class="" style="width: 150px;">
          </div>
      </div>
      <br>

      <h5 class="ml-5 body-wid">이메일 주소 입력  </h5>
        <input type="text" class="" style="margin-left: 45px; width: 180px;">
        @

            <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="width: 150px;">
              gmail.com
            </button>

              <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <a class="dropdown-item" href="#">Something else here</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Separated link</a>
              </div>

          <button type="button" class="btn btn-info ">인증메일받기</button>
     <br>
     <br>
     <h5 class="ml-5 body-wid" >이메일 인증번호 입력  </h5>
     <input type="text" class="input-wid" style="margin-left: 45px;">
        <div>
          <br>
          <h5 class="ml-5 body-wid">생년월일 입력  </h5>
          <div style="margin-left: 45px;">
                  <select id="birth" style="width: 140px;">
                    <option value="#">연도</option>
                    <option value="1950">1950</option>
                    <option value="1951">1951</option>
                    <option value="1952">1952</option>
                    <option value="1953">1953</option>
                    <option value="1954">1954</option>
                    <option value="1955">1955</option>
                    <option value="1956">1956</option>
                    <option value="1957">1957</option>
                    <option value="1958">1958</option>
                    <option value="1959">1959</option>
                    <option value="1960">1960</option>
                    <option value="1961">1961</option>
                    <option value="1962">1962</option>
                    <option value="1963">1963</option>
                    <option value="1964">1964</option>
                    <option value="1965">1965</option>
                    <option value="1966">1966</option>
                    <option value="1967">1967</option>
                    <option value="1968">1968</option>
                    <option value="1969">1969</option>
                    <option value="1970">1970</option>
                    <option value="1971">1971</option>
                    <option value="1972">1972</option>
                    <option value="1973">1973</option>
                    <option value="1974">1974</option>
                    <option value="1975">1975</option>
                    <option value="1976">1976</option>
                    <option value="1977">1977</option>
                    <option value="1978">1978</option>
                    <option value="1979">1979</option>
                    <option value="1980">1980</option>
                    <option value="1981">1981</option>
                    <option value="1982">1982</option>
                    <option value="1983">1983</option>
                    <option value="1984">1984</option>
                    <option value="1985">1985</option>
                    <option value="1986">1986</option>
                    <option value="1987">1987</option>
                    <option value="1988">1988</option>
                    <option value="1989">1989</option>
                    <option value="1990">1990</option>
                    <option value="1991">1991</option>
                    <option value="1992">1992</option>
                    <option value="1993">1993</option>
                    <option value="1994">1994</option>
                    <option value="1995">1995</option>
                    <option value="1996">1996</option>
                    <option value="1997">1997</option>
                    <option value="1998">1998</option>
                    <option value="1999">1999</option>
                    <option value="2000">2000</option>
                    <option value="2001">2001</option>
                    <option value="2002">2002</option>
                    <option value="2003">2003</option>
                    <option value="2004">2004</option>
                    <option value="2005">2005</option>
                    <option value="2006">2006</option>
                    <option value="2007">2007</option>
                    <option value="2008">2008</option>
                    <option value="2009">2009</option>
                    <option value="2010">2010</option>
                    <option value="2011">2011</option>
                    <option value="2012">2012</option>
                    <option value="2013">2013</option>
                    <option value="2014">2014</option>
                    <option value="2015">2015</option>
                    <option value="2016">2016</option>
                    <option value="2017">2017</option>
                    <option value="2018">2018</option>
                    <option value="2019">2019</option>
                    <option value="2020">2020</option>
                </select> <span style="font-size: 18px;"> 년</span> <select id="생년월일" style="width: 140px;">
                    <option value="#">월</option>
                    <option value="1">1월</option>
                    <option value="2">2월</option>
                    <option value="3">3월</option>
                    <option value="4">4월</option>
                    <option value="5">5월</option>
                    <option value="6">6월</option>
                    <option value="7">7월</option>
                    <option value="8">8월</option>
                    <option value="9">9월</option>
                    <option value="10">10월</option>
                    <option value="11">11월</option>
                    <option value="12">12월</option>
                </select> <span style="font-size: 18px;"> 월 </span> <select id="생년월일" style="width: 140px;">
                    <option value="#">일</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option value="31">31</option>
                </select>
              </div>
              <br>
              <div style="margin-left: 45px;">
                <div>
                <button type="button" class="btn btn-primary " style="width: 232px;">회원가입</button>
                <button type="button" class="btn btn-primary " style="width: 232px;">홈으로</button>
                </div>
                <br>
                <div>
                  <button type="button" class="btn btn-success btn3-wid">Naver 계정으로 회원가입</button>
                </div>
                <br>
                <div>
                  <button type="button" class="btn btn-warning btn3-wid" >Kaokao 계정으로 회원가입</button>
                </div>
              </div>
             </div>
        </div>
  </div>  
</body>
</html>