//입력하는 input
let idText = document.querySelector("#idText");
let pwText = document.querySelector("#pwText");
let pw_text = document.querySelector("#pw_text");
let n_text = document.querySelector("#n_text");
let e_text = document.querySelector("#e_text");
//버튼
//중복확인
let idBtn = document.querySelector("#idBtn");
let mamberBtn = document.querySelector("#mamberBtn");
//출력할 input
let idDisp = document.querySelector("#idDisp");
let pwDisp = document.querySelector("#pwDisp");
let pw_disp = document.querySelector("#pw_disp");
let nameDisp = document.querySelector("#n_text");
let emailDisp = document.querySelector("#emailDisp");

//ID
let id_data = document.querySelector("#idText").value;

let idInput = () => {
    if(id_data == ""){
        idDisp.innerHTML = '아이디를 입력하세요';
    }

    
}
