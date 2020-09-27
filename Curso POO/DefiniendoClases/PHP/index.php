<?php
    require_once('car.php');
    require_once('uberX.php');
    require_once('uberPool.php');
    require_once('account.php');

    $uberX = new UberX("QWE789", new Account("Sandra Higuita","457801"),"Renault","Logan");
    $uberX->printDataCar();

    $uberPool = new UberPool("POI789", new Account("Andres Higuita","123801"),"Renault","Sandero");
    $uberPool->printDataCar();
?>