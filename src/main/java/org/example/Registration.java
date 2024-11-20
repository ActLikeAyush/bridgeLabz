package org.example;



public class Registration {

    public boolean validateName(String Fname,String LName){
        if(Fname.length()>3&&LName.length()>3){
            if(Character.isUpperCase(Fname.charAt(0))&&Character.isUpperCase(LName.charAt(0))){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }

    }

    public boolean validateEmail(String Email) {
        int indexAt = Email.indexOf('@');
        int dotIndex = Email.lastIndexOf('.');

        if (indexAt <= 0 || indexAt == Email.length() - 1) {
            return false;
        }
        if (dotIndex <= indexAt + 1 || dotIndex == Email.length() - 1) {
            return false;
        }

        String localPart = Email.substring(0, indexAt);
        String domainPart = Email.substring(indexAt + 1, dotIndex);
        String topLevelDomain = Email.substring(dotIndex + 1);

        if (localPart.isEmpty() || !Character.isLetter(localPart.charAt(0))
                || !Character.isLetterOrDigit(localPart.charAt(localPart.length() - 1))) {
            return false;
        }

        if (domainPart.isEmpty() || !Character.isLetter(domainPart.charAt(0))
                || !Character.isLetterOrDigit(domainPart.charAt(domainPart.length() - 1))) {
            return false;
        }

        return topLevelDomain.length() >= 2;
    }

    public boolean validatePhone(String Phone_Num){

        if(Phone_Num.indexOf(' ')!=2){
            return false;
        }

        return true;

    }


    public boolean validatePassword(String password){
        if(password.length()<8){
            return false;
        }
        boolean hasUppercase=false;
        for(int i=0;i<password.length();i++){
            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
                break;
            }
        }

        boolean hasNumeric=false;
        for(int i=0;i<password.length();i++){
            if (Character.isDigit(password.charAt(i))) {
                hasNumeric = true;
                break;
            }
        }

        return  (hasUppercase==true && hasNumeric == true) ? true: false;
    }
}


