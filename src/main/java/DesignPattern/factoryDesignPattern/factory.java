package DesignPattern.factoryDesignPattern;

public class factory {
        public static Employee getEmployee(String empType){

            if(empType.trim().equalsIgnoreCase("Web Developer")){
                return new WebDeveloper();
            } else if (empType.trim().equalsIgnoreCase("Android Developer")) {
                return new AndroidDeveloper();
            }
            else{
                return null;
            }

        }
}
