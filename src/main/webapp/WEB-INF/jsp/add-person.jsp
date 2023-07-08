<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Person</div>
				<div class="panel-body">
					<form method="get" action="/add-person/save">
						<table class="table table-striped">
							<tr>
								<th width="20%"><label>Name: </label></th>
								<td><input type="text" name="name" value="${requestScope.name}"/></td>
							</tr>
							<tr>
								<th><label>Family: </label></th>
								<td><input type="text" name="family" value="${requestScope.family}"/></td>
							</tr>
						</table>
						<button type="submit" class="btn btn-success">Save</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>