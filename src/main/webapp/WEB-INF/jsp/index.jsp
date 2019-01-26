<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Main</title>
    <script src="js/script.js"></script>
    <!--link rel="stylesheet" href="css/bootstrap.min.css" crossorigin="anonymous"-->
    <link rel="stylesheet" href="css/base.css">

</head>
<body onload="Init()">
<div id="head" style="align-content: left">
    <img id=img_logo"" src="../static/img/Logo.png" style="width: 40%; height: 100%;">
    <p id="now_date" style="text-align: right;">21.08.2020</p>
    <p id="now_time" style="text-align: right">17:32:54</p>
</div>
<div style="text-align: center">
    <p style="">Номер талона</p>
    <p id="talon_no" style="text-align: center"></p>
</div>
<div style="text-align: left; margin: 0 70px;">
    <p class="text_main">Тип услуги:</p>
    <p>Тип услуги -> Услуга</p>
    <br>
    <p class="text_main">Перд вами человек:</p>
    <p id="all_usr_count"></p>
    <br>
    <p class="text_main">Примерное время ожидания:</p>
    <p id="waiting_time"></p>
</div>
</body>
</html>