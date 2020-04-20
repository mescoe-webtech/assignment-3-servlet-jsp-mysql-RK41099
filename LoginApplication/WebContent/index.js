/**
 * 
 */
function validate() {
	var uname = document.getElementById('uname');
  var name = document.getElementById('fname');
  var lname = document.getElementById('lname');
  var email = document.getElementById('email');
  var pass1 = document.getElementById('password');
  var pass2 = document.getElementById('password2');
  var phn = document.getElementById('phn');
  var dob = document.getElementById('dob');
  var bg = document.getElementById('bg');
  var add = document.getElementById('add');
  var hob = document.getElementById('hob');
  var cb = document.getElementById('cb');

  let countryCode = StudentRegistration.countryCode.selectedIndex;
  let eng = StudentRegistration.eng.selectedIndex;
  let flag=false;
  let str =" ";
  if (uname.value === '' || uname.value == null) {
	    alert('Username is required!');
	    return false;
	  }
  if (name.value === '' || name.value == null) {
    alert('First Name is required!');
    return false;
  }
  if (lname.value === '' || lname.value == null) {
    alert('Last Name is required!');
    return false;
  }

  if (pass1.value === '' || pass1.value == null) {
    alert('Password is required!');
    return false;
  }
  if (pass2.value === '' || pass2.value == null) {
    alert('Confirm your Password!');
    return false;
  }

  if (pass1.value != "" && pass1.value == pass2.value) {
    if (pass1.value.length < 6) {
      alert("Password must contain at least six characters!");
      pass1.focus();
      return false;
    }

    re = /[0-9]/;
    if (!re.test(pass1.value)) {
      alert("Password must contain at least one number!");
      pass1.focus();
      return false;
    }
    re = /[a-z]/;
    if (!re.test(pass1.value)) {
      alert("Password must contain at least one lowercase letter!");
      pass1.focus();
      return false;
    }
    re = /[A-Z]/;
    if (!re.test(pass1.value)) {
      alert("Password must contain at least one uppercase letter!");
      pass1.focus();
      return false;
    }
  } else {
    alert("Your Password do not Match!");
    pass1.focus();
    return false;
  }
  if (email.value === '' || email.value == null) {
    alert("Email-Id is required!");
    return false;
  }
  var reg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if (!reg.test(email.value)) {
    alert("You have entered an invalid email address!");
    // return false;
  }

  if (phn.value === '' || phn.value == null) {
    alert("Mobile Number is required!");
    return false;
  }
  var phnn = /^\d{10}$/;
  if (!phnn.test(phn.value)) {
    alert("Enter a valid Mobile Number of 10 Digits only!");
    phn.focus();
    return false;
  }
  if(countryCode==0) {
    flag=true;
    str +="Select your Country Code!!\n";
  }
  if (dob.value === '' || dob.value == null) {
    alert('Date of Birth is required!');
    return false;
  }
  if (StudentRegistration.gender[0].checked == false && StudentRegistration.gender[1].checked == false)
  {
    flag=true;
    str +="Select a Gender!!\n";
  }
  if (bg.value === '' || bg.value == null) {
    alert('Blood Group is required!');
    return false;
  }
  if (add.value === '' || add.value == null) {
    alert("Address is required!");
    return false;
  }
  if (hob.value === '' || hob.value == null) {
    alert('Hobbies are required!');
    return false;
  }
  if(eng==0) {
    flag=true;
    str +="Select your Branch!!";
  }
  if(flag){
         alert("Warning!!\n"+str);
         return false;
     }
     else{
         return true;
     }
}
