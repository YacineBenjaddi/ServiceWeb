<h3> Formulaire de recherche </h3>
<form method="post" action="clientProd_Categ_JDBC.php"> 
    <label> Entrer votre ID :  </label>
    <input type="text" name="id" />
    <button type="submit" value="Service" >Rechercher</button>
</form>





<?php 
//la version finale de client php avec bean produit et categorie pimplex
// la liste des produits avec une categorie donnee

//http://localhost/ClientPhp/clientProd_Categ_JDBC.php
if(isset($_POST['id'])){

  $idRech = $_POST['id'];
  try{

    $clt = new SoapClient(
    'http://localhost:3344/Service?wsdl',
           array(
           'trace' => 1,
           'soap_version' => SOAP_1_1
           )
             );

             $params['id'] = $idRech;
        $res = $clt->__soapCall('recherche', array($params));

       
 
 //$res1 = $clt->__soapCall('get', array($params));

     echo "<select name='idCategorie'>";

   foreach ($res->return as $e) {

       
      echo " <option value='" .$e->idProd."'> " .$e->designationProd." </option>";

     }
     echo "</select>";
  }
 

  catch (Exception $e){
    echo $e;
  }
}

 ?>