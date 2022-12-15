<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ru">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
  <link rel="stylesheet" href="css/styles.css">
  <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>
  <title>Quest planet</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
          integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
          crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
          integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
          crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
          integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
          crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
          integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
          crossorigin="anonymous"></script>
</head>

<body class="background-dialog-win">
<img src="assets/img/statistics_button.png" alt="stats" data-toggle="modal" data-target="#exampleModalLong"
     class="d-flex ml-auto stats_button">

<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Информация по вашему акканту</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>Ваше имя: <%=session.getAttribute("userName")%></p>
        <p>Ваш ID: <%=session.getAttribute("userId")%></p>
        <p>Дата создания аккаунта: <%=session.getAttribute("userSignUp")%></p>
        <p>Вы выиграли: <%=session.getAttribute("userWin")%> раз</p>
        <p>Ва проиграли: <%=session.getAttribute("userLoss")%> раз</p>
      </div>

      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">OK</button>
      </div>
    </div>
  </div>
</div>

<div class="dialog__wrapper">
  <div class="dialog_bg-win">

    <c:forEach var="message" items="${list}">
      <p class="author">${message}</p>
    </c:forEach>

  </div>
      <div class="dialog_buttons-win">
          <form action="last" method="get">
              <button class="btn-dialog-win" name="button-choose" value="1">Пройти еще раз</button>
          </form>
        <button class="btn-dialog-win" onclick="return location.href = 'https://www.youtube.com/'">Посмотреть ютубчик!</button>
      </div>
</div>

</body>
</html>