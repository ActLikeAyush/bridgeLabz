package optionals;

import java.util.Optional;

public class person {
    private String name =null;
    person(String name){
        this.name=name;
    }
    person(){

    }
    public Optional<String> getName(){
        return Optional.ofNullable(name);
    }
}
