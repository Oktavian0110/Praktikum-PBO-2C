<?php
session_start();
$_SESSION['sesi'] = NULL;

include "koneksi.php";
	if( isset($_POST['submit']))
	{
			$user	= isset($_POST['user']) ? $_POST['user'] : "";
			$pass	= isset($_POST['pass']) ? $_POST['pass'] : "";
			$qry	= mysqli_query($db,"SELECT * FROM tbuser WHERE username = '$user' AND password = '$pass'");
			$sesi	= mysqli_num_rows($qry);

			if ($sesi == 1)
			{
				$data_admin	= mysqli_fetch_array($qry);
				$_SESSION['id_user'] = $data_admin['id_user'];
				$_SESSION['sesi'] = $data_admin['username'];
				
				echo "<script>alert('Anda berhasil Log In');</script>";
				if($user == "admin"){
					header('location:index_admin.php');
				}else{
					echo "<meta http-equiv='refresh' content='0; url=index.php?user=$sesi'>";
				}
			}
			else
			{
				echo "<meta http-equiv='refresh' content='0; url=login.php'>";
				echo "<script>alert('Anda Gagal Log In');</script>";
			}
		
		
	}
	else
	{
	  include "login.php";
	}
?>
