<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>WebQueue</title>
    <style>
        .talon_no span {
            /*background: rgba(0,0,0,0.7); (полупрозрачность)*/
            border-radius: 2px;
            position: absolute;
            right: 0;
            top: 0;
            font-size: 230px;
            padding: 3px 5px;
            width: 100%;
            text-align: center;
            text-shadow: 3px 3px 0 #687569, -1px -1px 14px #687569;
        }

        .talon_no {
            position: relative;
        }

        .time_info span {
            /*background: rgba(0,0,0,0.7); (полупрозрачность)*/
            border-radius: 2px;
            position: absolute;
            right: 0;
            top: 0;
            font-size: 100px;
            padding: 3px 5px;
            width: 100%;
            text-align: center;
            text-shadow: 3px 3px 0 #687569, -1px -1px 14px #687569;
        }

        .time_info {
            position: relative;
        }

        .user_info span {
            /*background: rgba(0,0,0,0.7); (полупрозрачность)*/
            border-radius: 2px;
            position: absolute;
            right: 0;
            top: 0;
            font-size: 100px;
            padding: 3px 5px;
            width: 100%;
            text-align: center;
            text-shadow: 3px 3px 0 #687569, -1px -1px 14px #687569;
        }

        .user_info {
            position: relative;
        }

        .default_text_attr {
            font-family: 'Open Sans', sans-serif;
            color: #09ac1c;
        }
    </style>
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="default_text_attr">
<!-- Save for Web Slices (Дизай.psd) -->
<table id="________01" border="0" cellpadding="0" cellspacing="0" style="width: 100%; height: 100%">
    <tr>
        <td colspan="5">
            <img src="${pageContext.request.contextPath}../../../images/01.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="5">
            <img src="${pageContext.request.contextPath}../../../images/02.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="2" rowspan="2">
            <img src="${pageContext.request.contextPath}../../../images/03.gif" style="width: 100%; height: 100%" alt=""></td>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/04.gif" style="width: 100%; height: 100%" alt=""></td>
        <td colspan="2" rowspan="2">
            <img src="${pageContext.request.contextPath}../../../images/05.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/06.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td rowspan="10">
            <img src="${pageContext.request.contextPath}../../../images/07.gif" style="width: 100%; height: 100%" alt=""></td>
        <td colspan="3" class='talon_no'>
            <img src="${pageContext.request.contextPath}../../../images/08.gif" style="width: 100%; height: 100%" alt="" title="1">
            <span id="talon_no"> ${dto.getTalonCode()} ${dto.getTalonNumber()} </span>
        </td>
        <td rowspan="10">
            <img src="${pageContext.request.contextPath}../../../images/09.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/10.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/11.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/12.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3" class='time_info'>
            <img src="${pageContext.request.contextPath}../../../images/13.gif" style="width: 100%; height: 100%" alt="">
            <span id="waiting_time">${dto.getAverageTime() * dto.getInFront()}</span>
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/14.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/15.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/16.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td colspan="3" class="user_info">
            <img src="${pageContext.request.contextPath}../../../images/17.gif" style="width: 100%; height: 100%" alt="">
            <span id="all_usr_count" style="vertical-align:bottom">${dto.getInFront()}</span>
        </td>
    </tr>
    <tr>
        <td colspan="3">
            <img src="${pageContext.request.contextPath}../../../images/18.gif" style="width: 100%; height: 100%" alt=""></td>
    </tr>
    <tr>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/spacer.gif" width="28" height="1" alt=""></td>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/spacer.gif" width="10" height="1" alt=""></td>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/spacer.gif" width="437" height="1" alt=""></td>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/spacer.gif" width="10" height="1" alt=""></td>
        <td>
            <img src="${pageContext.request.contextPath}../../../images/spacer.gif" width="27" height="1" alt=""></td>
    </tr>
</table>
<!-- End Save for Web Slices -->
</body>
</html>