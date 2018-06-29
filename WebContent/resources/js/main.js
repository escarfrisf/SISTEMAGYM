;

(function ($) {
	var boton=$(".login100-form-btn").onClick 
	
	var usuario= $("#usuariotxt").val();
	var pass=$("#passtxt").val();
	   
	    $.ajax({
	      dataType: "json",
	      url: "/HomeController/op?=1",
	      data: {user:usuaario, pass:pass},
	      success: success
	    });

    
    /*==================================================================
    [ Validate ]*/
 

})(jQuery);