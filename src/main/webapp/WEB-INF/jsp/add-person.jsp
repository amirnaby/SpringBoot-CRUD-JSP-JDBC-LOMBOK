<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Person</div>
				<div class="panel-body">
					<form method="get" action="/add-person/save">
						<fieldset class="form-group">
							<label>Name: </label>
							<input type="text" name="name" value="${requestScope.x.name}"/>
						</fieldset>

						<fieldset class="form-group">
							<label>Family: </label>
							<input type="text" name="family" value="${requestScope.x.family}"/>
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
