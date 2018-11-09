var firstLoad = true;

var cars = [
    {vnum: "D12345", make: "BMW 1 series", model: "116i"},
    {vnum: "ET12345", make: "Fiat 1500", model: "116i766"},
];

    var x = document.createElement("TABLE");
    x.setAttribute("id", "myTable");
    document.body.appendChild(x);

    /*var y = document.createElement("TR");
    y.setAttribute("id" , "myTr");
    document.getElementById("myTable").appendChild(y);*/

    /*var z = document.createElement("TD");
    z.setAttribute("id", "mycell");
    document.getElementById("myTr").appendChild(z);*/

function listCars(){
    alert(cars.length + " are being loaded");
    var eachcarplace = "";


    for(var i = 0; i <= cars.length ; i++){
        var y = document.createElement("TR");
        y.setAttribute("id" , "myTr");
        document.getElementById("myTable").appendChild(y);

        var carmake = cars[i].make;
        y.textContent = carmake;

/*
        document.getElementById("myTr").appendChild(y);
*/

        /*
                eachcarplace += cars[i].make + "<br/>";
        */
    }
     // document.getElementById("listsplace").innerHTML = eachcarplace ;

}

function addCar(){

}