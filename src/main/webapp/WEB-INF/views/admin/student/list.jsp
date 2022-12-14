<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<main id="main" class="main">
	<div class="row" style="margin: 0px;">
		<!-- Hiển thị thông báo -->
		<%@include file="/common/info.jsp"%>
		<!-- Kết thúc hiển thị thông báo -->

		<section class="section">
			<div class="row">
				<table class="table table-striped table-bordered table-hover"
					id="sample_2">
					<thead>
						<tr>
							<th>Tên Đăng Nhập</th>
							<th>Mã số sinh viên</th>
							<th>Họ tên</th>
							<th>Ảnh đại diện</th>
							<th>Ngày sinh</th>
							<th>Địa chỉ</th>
							<th>Giới tính</th>
							<th>Điện thoại</th>
							<th>Lớp</th>
							<th>Khoa</th>
							<th>Trạng thái</th>
							<th>Hành động</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${students}">
							<tr class="odd gradeX">
								<td>${item.username}</td>
								<td>${item.mssv}</td>
								<td>${item.name}</td>
								<td><c:url value="${item.image}" var="imgUrl"></c:url> <img
									width="100px" height="100px" src="${imgUrl}"></td>
								<td>${item.dob}</td>
								<td>${item.address}</td>
								<td>${item.gender == '1' ?'Nam':'Nữ'}</td>
								<td>${item.phone}</td>
								<td>${item.facultyId}</td>
								<td>${item.studentClassId}</td>
								<td><c:if test="${item.deleted == 1}">
										<span class="label label-sm label-success"> Hoạt động </span>
									</c:if> <c:if test="${item.deleted ==0}">
										<span class="label label-sm label-warning"> Khóa</span>
									</c:if></td>
								<td><a style="margin: auto;"
									href="<c:url value='/admin/student/edit/${item.id}'/>"
									type="button" class="btn btn-warning"> Revise </a> <a
									href="<c:url value='/admin/student/delete/${item.id}'/>"
									type="button" class="btn btn-danger"> Delete </a> <%-- 						<a
									href="<c:url value='/admin/student/edit/${item.id}'/>"
									class="center">Edit</a> 
									
									
									| <a
									href="<c:url value='/admin/student/delete/${item.id}'/>"
									class="center">Delete</a> --%></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="<c:url value='/admin/student/add'/>" class="center">Add</a>
			</div>
		</section>
	</div>
</main>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<!-- <button type="button" class="btn btn-danger">
	<i class="bi bi-exclamation-octagon"></i>
</button> -->
