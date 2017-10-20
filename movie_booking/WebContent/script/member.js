/**
 * 
 */

function loginCheck() {
	if (document.frm.userid.value.length == 0) {
		alert("아이디를 입력해 주세요.");
		document.frm.userid.focus();
		return false;
	}
	
	if (document.frm.pwd.value.length == 0) {
		alert("암호를 입력해 주세요.");
		document.frm.pwd.focus();
		return false;
	}
	
	return true;
}

function idok(){
	  opener.frm.userid.value=document.frm.userid.value;
	  opener.frm.reid.value=document.frm.userid.value;
	  self.close();
	}


function idcancel(){
	  opener.frm.userid.value=""; 
	  opener.frm.reid.value="";
	  self.close();
	}

function idCheck() {
	if (document.frm.userid.value.length == 0) {
		alert("아이디를 입력해 주세요.");
		document.frm.userid.focuse();
		return;
	}
	
	if (document.frm.userid.value.length < 4) {
		alert("아이디는 4자 이상 입력해 주세요");
		document.frm.userid.focus();
		return false;
	}
	
	var url = "MemberFC?command=id_check_form&userid=" + document.frm.userid.value;
	window.open(url, "_blank_1",
	"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
	
}
function find_email_Check(){
	if (document.frm.email.value.length == 0) {
		alert("이메일을 입력해 주세요.");
		document.frm.email.focuse();
		return;
	}
	
	var url = "MemberFC?command=find_id_check_form&email=" + document.frm.email.value;
	window.open(url, "_blank_1",
	"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}
function find_id_Check(){
	if (document.frm.userid.value.length == 0) {
		alert("ID을 입력해 주세요.");
		document.frm.userid.focuse();
		return;
	}
	
	var url = "MemberFC?command=find_pwd_check_form&userid=" + document.frm.userid.value;
	window.open(url, "_blank_2",
	"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}


function joinCheck() {
	if (document.frm.userid.value.length < 4) {
		alert("아이디는 4자 이상 입력해 주세요");
		document.frm.userid.focus();
		return false;
	}
	
	if (document.frm.pwd.value.length == 0) {
		alert("암호를 입력해 주세요");
		document.frm.pwd.focus();
		return false;
	}
	
	if (document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("암호가 일치하지 않습니다.");
		document.frm.pwd.focus();
		return false;
	}
	
	if (document.frm.name.value.length == 0) {
		alert("이름을 입력해 주세요");
		document.frm.name.focus();
		return false;
	}
	
	if (document.frm.reid.value.length == 0) {
		alert("아이디 중복 체크를 하지 않았습니다.");
		document.frm.userid.focus();
		return false;
	}
	
	return true;
}

function open_win(url, name) {
	window.open(url, name, "width=500, height=230");
}
