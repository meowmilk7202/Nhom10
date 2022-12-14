<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<div id="main">
	<div style="margin: 0px;">
		<!-- BEGIN EXAMPLE TABLE PORTLET-->
		<div class="portlet">
			<div class="portlet-title">
				<div class="caption">
					<h2>${admin.isEdit ? 'Edit admin' : 'Add New admin' }</h2>
					<i class="fa fa-globe"></i>
				</div>
			</div>
			<div class="portlet-body d-flex justify-content-center">
				<div class="table-toolbar">
					<!-- Hiển thị thông báo -->
					<%@include file="/common/info.jsp"%>
					<!-- Kết thúc hiển thị thông báo -->
					<div class="row" style="margin: 0px;">
						<div class="">
							<div class="row" style="margin: 0px;">
								<div class="">
									<form action="<c:url value="/admin/saveofUpdate"/>"
										method="post" enctype="multipart/form-data">
										<br />
										<div class="form-group">
											<input type="text" name="id" value="${admin.id}" id="id"
												class="form-control" />
										</div>
										<div class="form-group">
											<label for="UserID">Tên đăng nhập:</label> <input type="text"
												name="username" value="${admin.username}" id="username"
												class="form-control" />
										</div>
										<div class="form-group">
											<label for="categoryName">Họ và tên:</label> <input
												type="text" class="form-control" name="name" id="name"
												value="${admin.name}" />
										</div>
										<div class="form-group">
											<label for="images">Images:</label> <input type="file"
												class="form-control" name="imageFile" id="imageFile" />
										</div>
										<input type="text" class="form-control" name="image"
											id="image" value="${admin.image}" hidden="true" />
										<div class="form-group">
											<label for="deparment">Điện thoại :</label> <input
												type="text" class="form-control" name="phone" id="deparment"
												value="${admin.phone}" />
										</div>

										<div class="form-check form-check-inline">
											<label for="status">Status:</label> <input id="statuson"
												class="form-check-input" type="radio" name="deleted"
												${admin.deleted == 1 ?'checked':''} value="true"> <label
												for="statuson" class="form-check-label">Hoạt động</label> <input
												id="statusoff" class="form-check-input" type="radio"
												name="deleted" ${admin.deleted == 0?'checked':''}
												value="false"> <label for="statusoff"
												class="form-check-label">Khóa</label>
										</div>
										<br />
										<hr>
										<div class="form-group">
											<button class="btn green">
												Save <i class="fa fa-plus"></i>
											</button>

										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- END EXAMPLE TABLE PORTLET-->
	</div>
</div>

<%-- <div class="" style="">
	<h2>${admin.isEdit ? 'Edit admin' : 'Add New admin' }</h2>
	<form:form action="/admin/admin/saveofUpdate" method="POST"
		modelAttribute="admin" enctype="multipart/form-data">
	
	Mã số sinh viên: <form:input path="mssv" />
		<br />
	Họ tên :<form:input path="name" />
		<br />
	Email : <form:input path="email" />
		<br />
	Ngày sinh : <form:input path="dateofbirth" />
		<br />
	Chuyên ngành : <form:input path="faculty" />
		<br />
		<form:hidden path="image" />
		<input type="file" name="imageFile" />
		<br />
		<form:radiobutton path="is_active" value="false" />Khóa <form:radiobutton
			path="is_active" value="true" />Hoạt động 
		<br />
		<button>Save</button>
	</form:form>
</div> --%>