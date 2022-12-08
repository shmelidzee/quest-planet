<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <link rel="stylesheet" href="css/styles.css">
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>
    <title>Quest planet</title>
</head>
<body class="background-dialog">

<div class="dialog__wrapper">

    <div class="dialog_bg">
        <p class="player1">Л1:</p>
        <p class="player2">Л2:</p>
    </div>

    <div class="dialog_buttons">
        <form action="dialog" method="post">
            <button class="btn-dialog" name="first-button" value="1">Кнопка 1</button>
            <button class="btn-dialog" name="second-button" value="2">Кнопка 2</button>
        </form>
    </div>

</div>

</body>
</html>