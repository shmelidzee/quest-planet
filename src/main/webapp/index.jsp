<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

    <title>Quest planet</title>
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.gstatic.com"/>

    <link href="https://fonts.googleapis.com/css2?family=Tinos:ital,wght@0,400;0,700;1,400;1,700&amp;display=swap"
          rel="stylesheet"/>
    <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400;1,500;1,700&amp;display=swap"
          rel="stylesheet"/>

    <link href="css/styles.css" rel="stylesheet"/>


</head>
<body>
<video class="bg-video" playsinline="playsinline" autoplay="autoplay" muted="muted" loop="loop">
    <source src="assets/mp4/bg.mp4" type="video/mp4"/>
</video>

<div class="masthead">
    <div class="masthead-content text-white">
        <div class="container-fluid px-4 px-lg-0">
            <h1 class="fst-italic lh-1 mb-4">Приветсвуем Вас, капитан!</h1>
            <p class="mb-5">Представьтесь и мы начнем наше путешествие!</p>

            <form action="start" method="post" id="contactForm" data-sb-form-api-token="API_TOKEN">
                <div class="row input-group-newsletter">
                    <div class="col">
                        <input required class="form-control" id="name" type="text" name="userName"
                               placeholder="Представтесь..."/>
                    </div>

                    <div class="col-auto">
                        <button class="btn btn-primary" id="submitButton" type="submit" value="ok">
                            Представиться!
                        </button>
                    </div>
                </div>

                <div class="d-none" id="submitErrorMessage">
                    <div class="text-center text-danger mb-3 mt-2">Error sending message!</div>
                </div>

            </form>

        </div>
    </div>
</div>


<div class="social-icons">
    <div class="d-flex flex-row flex-lg-column justify-content-center align-items-center h-100 mt-3 mt-lg-0">
        <a class="btn btn-dark m-3" href="https://www.linkedin.com/in/pavel-moiseenko-0b9754231" target="_blank"><i
                class="fa-brands fa-linkedin"></i></a>
        <a class="btn btn-dark m-3" href="https://github.com/shmelidzee" target="_blank"><i
                class="fa-brands fa-github"></i></a>
        <a class="btn btn-dark m-3" href="https://t.me/paul_moiseenko" target="_blank"><i
                class="fa-brands fa-telegram"></i></a>
    </div>
</div>


</body>