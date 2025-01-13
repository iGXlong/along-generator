<!DOCTYPE html>
<html>
<head>
    <title>测试标题</title>
</head>
<body>
<h1>欢迎</h1>
<ul>
    <#-- 循环渲染导航条 -->
    <#list menuItems as item>
        <li><a href="${item.url}">${item.label}</a></li>
    </#list>
</ul>
<#-- 底部版权信息（注释部分，不会被输出）-->
<footer>
    ${currentYear} 测试. All rights reserved.
</footer>
</body>
</html>