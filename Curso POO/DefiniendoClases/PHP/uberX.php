<?php
    
    require_once('car.php');

    class UberX extends Car{

        public $brand;
        public $model;

        public function __construct($license, $driver, $brand, $model){
            parent::__construct($license,$driver); //Así se envía los parametros a la clase padre
            $this->brand=$brand;           
            $this->model=$model;        
        }

    }
?>