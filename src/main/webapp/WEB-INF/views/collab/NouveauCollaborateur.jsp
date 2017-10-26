<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/script.js"></script>

<!-- Required meta tags -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
</head>
<body>


<body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">


    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <a class="nav-link" href="nouveau.html">Collaborateur</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="statistiques.html">Statistique</a>
          </li>
        <li class="nav-item">
          <a class="nav-link" href="activites.html">Activités</a>
        </li>
      </ul>

    </div>
  </nav>

  <h1>Nouveau Collaborateur</h1>
  <a href="./list.html">
    << Retour à la liste</a>
      <br />
      <br />
      <form>

        <div class="row">
          <div class="col-md-6 mb-3">
            <label>Nom</label>
            <input type="text" class="form-control" name="nom" placeholder="Nom" />
            <div class="invalid-feedback">
              Le nom est obligatoire.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label>Prénom</label>
            <input type="text" class="form-control" name="prenom" placeholder="Prenom" />
            <div class="invalid-feedback">
              Le prénom est obligatoire.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label>Date de naissance</label>
            <input type="date" class="form-control" name="date2naissance" />
            <div class="invalid-feedback">
              La date de naissance est obligatoire.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label>Numéro de sécurité sociale</label>
            <input type="text" class="form-control" name="num2secu" maxlength="15"/>
            <div class="invalid-feedback">
              Le numéro de sécurité sociale est obligatoire.
            </div>
          </div>

        </div>

        <div class="row">
          <div class="col-md-6 mb-3">
            <label>Commune</label>
            <input type="text" class="form-control" name="commune" placeholder="Commune" />
          </div>
          <div class="col-md-3 mb-3">
            <label>Région</label>
            <input type="text" class="form-control" name="region" placeholder="region" />
          </div>
          <div class="col-md-3 mb-3">
            <label>Code postal</label>
            <input type="text" class="form-control" name="codePostal" placeholder="code postal" />

          </div>
        </div>

        <button class="btn btn-primary" data-toggle="modal" type="submit" onclick="add(event);">Ajouter</button>
      </form>

      <div class="modal" id="modal-dialog">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <a class="close" aria-hidden="true" href="#" data-dismiss="modal">×</a>
              <h3>Création d'un collaborateur</h3>
            </div>
            <div class="modal-body">
              <p>Vous êtes sur le point de creer un nouveau collaborateur : </p>
              <label id="left">Nom</label>
              <label id="right" name="nomConfirmation">

              </label>
              <label id="left">Prénom</label>
              <label id="right" name="prenomConfirmation">

              </label>
              <label id="left">Date de naissance</label>
              <label id="right" name="date2naissanceConfirmation">
              </label>
              <label id="left">Adresse</label>
              <label id="right" name="adresseConfirmation">

              </label>
              <label id="left">Numéro de sécurité sociale</label>
              <label id="right" name="num2secuConfirmation">

              </label>
            </div>
            <div class="modal-footer">
              <a class="btn confirm" id="btnYes" href="list.html">Confirmer</a>
              <a class="btn secondary" aria-hidden="true" href="#" data-dismiss="modal">Annuler</a>
            </div>
          </div>
        </div>
      </div>

      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
        crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
        crossorigin="anonymous"></script>
</body>
</html>