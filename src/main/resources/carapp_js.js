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

function listCars(cars){
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

function getCars(){
     var HttpObject = new XMLHttpRequest();
     var url = "http://localhost:8080/";

     HttpObject.responseType = 'json';
     HttpObject.open('GET', url);
     HttpObject.send();

     HttpObject.onreadystatechange = function(){
         if(this.readyState==1){
             console.log("Connection established");
         }
         if(this.readyState==3){
             console.log("Loading Data");
         }
         if(this.readyState ==4){
             console.log("Done");
             if(this.status==200){
                 console.log("Result successful. Check your page");
                 theResponse = this.response;
                 listCars(theResponse);
                 console.log(theResponse.cars);
             }
             else{
                 console.log("Something is wrong. Check below for details");
                 console.log(this.statusText);
             }
         }
     }

}

function addCarText(){
    var uservnumber= document.getElementById("uservnumber").value;
    var usermake= document.getElementById("usermake").value;
    var usermodel= document.getElementById("usermodel").value;
    var useryear= document.getElementById("useryear").value;

    var newCar = JSON.stringify({"vnum": uservnumber, "make": usermake, "model": usermodel, "year": useryear})
    return newCar;
}


function addCar(){
    var obj = new XMLHttpRequest();
    obj.open("POST", "http://localhost:8080/addcar")
    obj.setRequestHeader("Content-Type", "application/json");
    var newCar = addCarText();
    obj.send(newCar);
    alert("The car you entered has been added");

}

function getCarsList(){
    var HttpObject = new XMLHttpRequest();
    var url = "http://localhost:8080/";

    HttpObject.responseType = 'json';
    HttpObject.open('GET', url);
    HttpObject.send();

    HttpObject.onreadystatechange = function(){
        if(this.readyState==1){
            console.log("Connection established");
        }
        if(this.readyState==3){
            console.log("Loading Data");
        }
        if(this.readyState ==4){
            console.log("Done");
            if(this.status==200){
                console.log("Result successful. Check your page");
                theResponse = this.response;
/*
                console.log(theResponse.cars);
*/
                return theResponse;

            }
            else{
                console.log("Something is wrong. Check below for details");
                console.log(this.statusText);
            }
        }
    }

}


    function deleteCar(){

        var deletevnum = document.getElementById("deletevnum").value;

       var obj = new XMLHttpRequest();
        obj.open("GET", "http://localhost:8080/deletecar?vnum="+deletevnum);
        obj.send();
        alert("The car you entered has been deleted");
    }