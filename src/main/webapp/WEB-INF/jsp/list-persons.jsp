<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-person">Add Person</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Persons</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">ID</th>
						<th width="30%">Name</th>
						<th width="30%">Family</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${requestScope.list}" var="person">
						<tr>
							<form action="/add-person/update">
								<td><input type="text" readonly name="id" value="${person.id}"/></td>
								<td><input type="text" name="name" value="${person.name}"/></td>
								<td><input type="text" name="family" value="${person.family}"/></td>
								<td><input class="btn btn-success" type="submit" value="update"/><input class="btn btn-warning" type="button" onclick="deletePerson(${person.id})" value="delete"></td>
							</form>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>