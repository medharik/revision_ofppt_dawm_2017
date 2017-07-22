<?php 
extract($_GET);
$l=mysqli_connect("localhost","root","","ci");
$r=mysqli_query($l,"select * from users order by id desc") or die("erreur d'execution ");

$js=array();
while($rr=mysqli_fetch_assoc($r)){

$js[]=array('id'=>$rr['id'],'nom'=>$rr['nom'],'loc'=>$rr['loc']);
}

$str= json_encode(array('result'=>$js));
//$str=preg_replace('/"/', "'", $str);

echo $str;
//jsonObject => jsonArray=>form ja.getJSONObject(i)
//jsonobject jo=new jdonObjet(chainejson)
//jsonArray ja=jo.getJsonArray('resl');

 ?>