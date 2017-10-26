$('#modal-dialog').on('show', function () {
  var link = $(this).data('link'),
    confirmBtn = $(this).find('.confirm');

});


$('#btnYes').click(function () {

  console.log('btn yes was clicked');

  var lastName = document.getElementsByName("nom")[0].value;
  var firstName = document.getElementsByName("prenom")[0].value;
  var birthday = document.getElementsByName("date2naissance")[0].value;
  var adress = document.getElementsByName("commune")[0].value;

  var collaborateur = {
    'lastname': lastName,
    'firstname': firstName,
    'age': birthday,
    'adress': adress
  };
  localStorage.setItem('collaborateur' + localStorage.length, JSON.stringify(collaborateur));

  //alert("Collaborateur bien ajouté ! " + JSON.stringify(collaborateur));


  // alert('submit form');
  // $('form').submit();
  console.log('btn yes was clicked');

});



function add(event) {
  event.preventDefault();
 console.log('Add');
  var toutEstRempli = true;

  if ($("[name='nom']").val().length > 0) {
    jQuery("[name='nom']").removeClass();
    jQuery("[name='nom']").addClass("form-control is-valid");
  } else {
    jQuery("[name='nom']").removeClass();
    jQuery("[name='nom']").addClass("form-control is-invalid");
    toutEstRempli = false;
  }

  if ($("[name='prenom']").val().length > 0) {
    jQuery("[name='prenom']").removeClass();
    jQuery("[name='prenom']").addClass("form-control is-valid");
  } else {
    jQuery("[name='prenom']").removeClass();
    jQuery("[name='prenom']").addClass("form-control is-invalid");
    toutEstRempli = false;
  }

  if ($("[name='date2naissance']").val().length > 0) {
    jQuery("[name='date2naissance']").removeClass();
    jQuery("[name='date2naissance']").addClass("form-control is-valid");
  } else {
    jQuery("[name='date2naissance']").removeClass();
    jQuery("[name='date2naissance']").addClass("form-control is-invalid");
    toutEstRempli = false;

  }
  if ($("[name='commune']").val().length > 0) {
    jQuery("[name='commune']").removeClass();
    jQuery("[name='commune']").addClass("form-control is-valid");
  } else {
    jQuery("[name='commune']").removeClass();
    jQuery("[name='commune']").addClass("form-control is-invalid");
    toutEstRempli = false;

  }
  if (toutEstRempli) {
    $("#modal-dialog").modal(); // confirmation

    var lastName = document.getElementsByName("nom")[0].value;
    var firstName = document.getElementsByName("prenom")[0].value;
    var birthday = document.getElementsByName("date2naissance")[0].value;
    var adress = document.getElementsByName("commune")[0].value;
    var num2sec = document.getElementsByName("num2secu")[0].value;


    $("[name='nomConfirmation']").text(lastName);
    $("[name='prenomConfirmation']").text(firstName);
    $("[name='date2naissanceConfirmation']").text(birthday);
    $("[name='adresseConfirmation']").text(adress);
  }
}

