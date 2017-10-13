<jsp:include page="header.jsp" />
<div class="container" style="padding-top: 2%;">
	<div class="jumbotron text-center">
		<fieldset>
				<legend>Formul�rio Contato</legend>
			<form action="cadastrar" method="post">
				<div class="form-group">
					<label for="id_name">Nome</label> <input type="text" id="id_name"
						class="form-control" placeholder="Nome" name="nome">
				</div>
				<div class="form-group">
					<label for="id_mail">Email</label> <input type="email" id="id_mail"
						class="form-control" placeholder="E-mail" name="email">
				</div>
				<div class="form-group">
					<label for="id_tel">Telefone</label> <input type="tel" id="id_tel"
						class="form-control" placeholder="Telefone" name="telefone">
				</div>
				<button class="btn btn-default btn-block">Enviar</button>
			</form>
		</fieldset>
	</div>
</div>
<jsp:include page="footer.jsp" />