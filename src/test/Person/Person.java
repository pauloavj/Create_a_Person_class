package test.Person;

/**This class define a person's attributes like name, height, gender and hometown*/
public class Person {
    private String personName;
    private int personHeight;
    private String personGender;
    private String personHometown;

    /**constructor values to be assigned on creation, pass 5 arguments like name, height, gender and hometown*/
    public Person(String personName, int personHeight, String personGender, String personHometown) {
        this.personName = personName;
        this.personHeight = personHeight;
        this.personGender = personGender;
        this.personHometown = personHometown;
    }

    /**This function will give a brief introduction from person*/
    public String introducePerson(){
        return "Hello my name is " + personName + " and I am from " + personHometown;
    }
    /**This function will check if both people are from the same hometown,
     * if not it will introduce himself*/
    public String introducePerson(String otherPersonHometown){
        if (otherPersonHometown.equals(personHometown)) {
            return "I know you";
        }else{
            return introducePerson();
        }
    }
    /**This function allows you to get the person's hometown*/
    public String getPersonHometown(){
        return personHometown;
    }
    /**This function will convert the Person's height from centimeters to inches*/
    public double getHeightInches() {
        double heightInches = Math.round(personHeight * 0.393701 * 100.0)/100.0;
        return heightInches;
    }
}
