let num1 = document.getElementById("firstNo");
let num2 = document.getElementById("secondNo");
let operator = document.getElementById("operation");
let btn = document.getElementById("btnCalculate");
let result = document.getElementById("result");
let finalResult;
let numOneError = document.getElementById("numOneError");
let numTwoError = document.getElementById("numTwoError");
let operatorError = document.getElementById("operatorError");
let numOneStatus, numTwoStatus, operatorStatus = false;
numOneError.style.display = "none";
numTwoError.style.display = "none";
operatorError.style.display = "none";

btn.addEventListener("click",function(){

    if(num1.value == "" || num1.value == null || num1.value == undefined){
        numOneError.style.display = "block";
        numOneStatus = false;
    }else{
        numOneError.style.display = "none";
        numOneStatus = true;
    }
    if(num2.value == "" || num2.value == null || num2.value == undefined){
        numTwoError.style.display = "block";
        numTwoStatus = false;
    }else{
        numTwoError.style.display = "none";
        numTwoStatus = true;
    }
    if(operator.value == "empty"){
        operatorError.style.display = "block";
        operatorStatus = false;
    }else{
        operatorError.style.display = "none";
        operatorStatus = true;
    }

    if(numOneStatus == true && numTwoStatus == true && operatorStatus == true){
        switch(operator.value){
            case "plus":
                finalResult = Number(num1.value) + Number(num2.value);
                break;
            case "minus":
                finalResult = num1.value - num2.value;
                break;
            case "multiply":
                finalResult = num1.value * num2.value;
                break;
            case "divide":
                finalResult = num1.value / num2.value;
                break;
            case "default":
                console.log("There is no operator like this!!!")
                break;
        }
        result.innerHTML = finalResult;
    }
    }

    );