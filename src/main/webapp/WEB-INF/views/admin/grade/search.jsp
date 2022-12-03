<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<div class="row" style="margin: 0px;">
	<!-- Hiển thị thông báo -->
	<%@include file="/common/info.jsp"%>
	<div class="row mt-2 mb-2">
		<div class="col-md-6">
			<form action="/admin/grade/search">
				<div class="input-group">
					<input type="text" class="form-control ml-2" name="subjectId" id="subjectId"
						placeholder="Nhập từ khóa tìm kiếm" />
					<button class="btn btn-outline-primary ml-2">Search</button>
				</div>

			</form>
		</div>
		<div class="col-md-6">
			<form action="/admin/grade/add">
				<div class="input-group">
					<button class="btn btn-outline-primary ml-2">New Student</button>
				</div>
			</form>
		</div>
	</div>
	<!-- Kết thúc hiển thị thông báo -->
	<table class="table table-striped table-bordered table-hover"
		id="sample_2">
		<thead>
			<tr>
				<th>Mã điểm</th>
				<th>MSSV</th>
				<th>Điểm</th>
				<th>Mã môn học</th>
				<th>Trạng thái</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${grades}">
				<tr class="odd gradeX">
					<td>${item.id}</td>
					<td>${item.mssv}</td>
					<td>${item.grade}</td>
					<td>${item.subjectId}</td>
					<td><a href="<c:url value='/admin/grade/edit/${item.id}'/>"
						class="center">Edit</a> | <a
						href="<c:url value='/admin/grade/delete/${item.id}'/>"
						class="center">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>