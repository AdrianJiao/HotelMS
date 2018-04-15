<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set  value="${pageContext.request.contextPath}" scope="page" var="ctx"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title></title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="${ctx}/js/echarts/echarts.min.js"></script>
</head>
<style>

</style>
<body>

<div id="main" style="width: 95%;height:82%;"></div>


<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '收益金额折线图'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['散客','团队']
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {
            type : 'category',
            boundaryGap : false,
            data: ['${year[11]}','${year[10]}','${year[9]}','${year[8]}','${year[7]}','${year[6]}',
                '${year[5]}','${year[4]}','${year[3]}','${year[2]}','${year[1]}','${year[0]}']
        },
        yAxis:[{
            type : 'value'
        }] ,
        series: [
            {
                name:'散客',
                type:'line',
                stack: '总量',
                areaStyle: {normal: {}},
                data:[ ${sanke[11]}, ${sanke[10]}, ${sanke[9]},
                    ${sanke[8]}, ${sanke[7]}, ${sanke[6]}, ${sanke[5]},
                    ${sanke[4]}, ${sanke[3]}, ${sanke[2]}, ${sanke[1]},${sanke[0]}]
            },
            {
                name:'团队',
                type:'line',
                stack: '总量',
                label: {
                    normal: {
                        // show: true,
                        // position: 'top'
                    }
                },
                areaStyle: {normal: {}},
                data:[ ${tuandui[11]}, ${tuandui[10]}, ${tuandui[9]},
                    ${tuandui[8]}, ${tuandui[7]}, ${tuandui[6]}, ${tuandui[5]},
                    ${tuandui[4]}, ${tuandui[3]}, ${tuandui[2]}, ${tuandui[1]},${tuandui[0]}]
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>