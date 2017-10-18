<jsp:include page="header.jsp" />
<div class="container" style="padding-top: 2%;">
	<div class="jumbotron text-center">
		<fieldset>
			<legend>Dados do Contato</legend>
			<table class="table table-stripped">
				<thead>
					<tr>
						<th class="text-center">#</th>
						<th class="text-center">Nome</th>
						<th class="text-center">Email</th>
						<th class="text-center">Telefone</th>
					</tr>
				</thead>
				<tbody>
					<tr>
<!-- 
	<?php echo $_POST['nome'] ?>
	<?= $_POST['nome'] ?>
 
	Scriptlet - s�o pequenos scripts injetados na p�gina
 	
 	<%-- 
 		<?php // c�digo PHP ?>
 		<% //c�digo Java %>
 		
 		<?= // sa�da em PHP ?>
 		<%= // sa�da em Java %>
 		
 	--%>
 	
 	$_POST - para requisi��es encaminhada via Post
 	$_GET - para requisi��es encaminhada via Get
 	
 	No Java.. um �nico m�todo para ambas requisi��es
 	request.getParameter("");
-->
						<td><%= request.getParameter("id") %></td>
						<td><%= request.getParameter("nome") %></td>
						<td><%= request.getParameter("email") %></td>
						<td><%= request.getParameter("telefone") %></td>
					</tr>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>
<jsp:include page="footer.jsp" />