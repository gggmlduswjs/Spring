<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    body {
        margin: 0;
        padding: 0;
        background: linear-gradient(135deg, #fbefff, #e7f2ff);
        font-family: "Noto Sans KR", sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
    }

    .card {
        width: 480px;
        background: white;
        padding: 40px 35px;
        border-radius: 18px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.08);
        animation: fadeIn 0.8s ease-out;
    }

    h4 {
        font-size: 26px;
        margin-bottom: 25px;
        font-weight: 700;
        color: #6b1ab7;
    }

    .username {
        font-size: 19px;
        margin-bottom: 5px;
    }

    .today-date {
        font-size: 15px;
        color: #555;
        margin-bottom: 20px;
    }
.luck-box {
        margin-top: 15px;
        padding: 18px 20px;
        background: #f5f0ff;
        border-left: 6px solid #8448e5;
        border-radius: 12px;
    }

    .luck-title {
        font-size: 17px;
        margin-bottom: 10px;
        font-weight: bold;
        color: #4a2caa;
    }

    .luck-content {
        font-size: 16px;
        line-height: 1.6;
        font-weight: 500;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(15px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>
<body>
	<div class="card">
    <h4>✨ 오늘의 운세 ✨</h4>

    <p class="username">안녕하세요 <strong>${name}</strong>님!</p>
    <p class="today-date">오늘은 <strong>${today}</strong> 입니다.</p>

    <div class="luck-box">
        <p class="luck-title">🔮 오늘의 메시지</p>
        <p class="luck-content">${luckText}</p>
    </div>

    <p style="margin-top: 25px; font-size: 15px; text-align:center; color:#666;">
        좋은 하루 보내세요! 😊
    </p>
</div>
</body>
</html>