<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page language="java" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Gridview in Servlet using jQuery DataTable plugin</title>

<link href="css/demo_table_jui.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<link href="css/demo_page.css" rel="stylesheet" />

<script src="js/jquery.js"></script>
<script src="js/jquery.dataTables.js"></script>
<script>
// Ajax call to Servlet to display data via DataTables
$(document).ready(function() {
        $(".jqueryDataTable").dataTable({
                "sPaginationType" : "full_numbers",
                "bProcessing" : false,
                "bServerSide" : false,
                "sAjaxSource" : "displayData",
                "bJQueryUI" : true,
                "aoColumns" : [
            { "mData": "fname" },
            { "mData": "password" },
            { "mData": "address" },
            { "mData": "pin" }
        ]
    } ); 
} );
</script>
</head>

<body id="dt_example">
<div id="container">
<h1>Ajax based Gridview using jQuery DataTable plugin</h1>
<div id="demo_jui">
        <table class="display jqueryDataTable">
        <thead>
        <tr>
                <th>Company</th>
                <th>Country</th>
                <th>Year</th>
                <th>Revenue</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
        </table>
</div>
</div>
</body>
</html>