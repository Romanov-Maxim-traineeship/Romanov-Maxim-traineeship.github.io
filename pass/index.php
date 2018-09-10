<!DOCTYPE html>
<html lang="ru">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="../../../../favicon.ico">

	<title>my_bootsrtam</title>

	<!-- Bootstrap core CSS -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="css/index.css" rel="stylesheet">
</head>

<body>
	<div class="container">
		<?php
        $newWord = "";
        $glas = ["a","e","i","y","o","u"];
        $soglas = ["b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","w","z"];
        $soglasTWO = ["B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","X","W","Z"];
        $sglsTWO = rand(0, count($glas) - 1);
        $wordlen = 12; // TUPOI DAUN VVEL CHISLO

        $remain = 5 - ($wordlen%5);
        $newWord .= $soglasTWO[$sglsTWO];
        for ($i=0; $i <$wordlen + $remain ; $i +=5) {
            $ng = rand(0, count($glas) - 1);
            $nsg = rand(0, count($soglas) - 1);

//            $nsgTWO = rand(0, count($soglasTWO) - 1);
//            СЛОВА
            $newWord .= $glas[$ng].$soglas[$nsg];
            $ng = rand(0, count($glas) - 1);
            $nsg = rand(0, count($soglas) - 1);
            $newWord .= $soglas[$nsg].$glas[$ng];
            $nsg = rand(0, count($soglas) - 1);
            $newWord .= $soglas[$nsg];

        }

        echo mb_strimwidth($newWord, 0, $wordlen);

//        echo $newWord;
        ?>
	</div>
	<script>
		
	</script>
</body>
</html>