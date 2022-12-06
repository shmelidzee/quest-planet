<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="servlets.FirstServlet" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

    <title>Quest planet</title>
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>
    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link rel="preconnect" href="https://fonts.gstatic.com"/>
    <link href="https://fonts.googleapis.com/css2?family=Tinos:ital,wght@0,400;0,700;1,400;1,700&amp;display=swap"
          rel="stylesheet"/>
    <link href="https://fonts.googleapis.com/css2?family=DM+Sans:ital,wght@0,400;0,500;0,700;1,400;1,500;1,700&amp;display=swap"
          rel="stylesheet"/>
    <!-- Core theme CSS (includes Bootstrap)-->
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

            <form action="first-servlet" method="post" id="contactForm" data-sb-form-api-token="API_TOKEN">
                <div class="row input-group-newsletter">
                    <div class="col">
                        <input class="form-control" id="name" type="text" name="userName"
                               placeholder="Представтесь..."/>
                    </div>

                    <div class="col-auto">
                        <button class="btn btn-primary disabled" id="submitButton" type="submit" value="ok">
                            Представиться!
                        </button>
                    </div>

                </div>


                <div class="d-none" id="submitSuccessMessage">
                    <div>
                        <div class="col-auto">
                            <button class="btn btn-primary" id="startButton" type="submit" value="ok" style="position: absolute; left: 32%;">
                                Поехали!
                            </button>

                        </div>
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
        <a class="btn btn-dark m-3" href="#!"><i class="fab fa-twitter"></i></a>
        <a class="btn btn-dark m-3" href="#!"><i class="fab fa-facebook-f"></i></a>
        <a class="btn btn-dark m-3" href="#!"><i class="fab fa-instagram"></i></a>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>

