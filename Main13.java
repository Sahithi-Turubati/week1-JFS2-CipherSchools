package Week1;

abstract class Main13 {
    abstract void treatPatient();
}

class Physician extends Main13{

    @Override
    void treatPatient() {
        System.out.println("Hi! I am Physician \nI Treat Patients using Medicines.");
    }
}

class Surgeon extends Main13{

    @Override
    void treatPatient() {
        System.out.println("Hi! I am Surgeon \n I Treat Patients using Surgery!");
    }
}

class Dentist extends Main13{
    void treatPatient(){
        System.out.println("Hi! I am Dentist \nI Treat Patients Teeth");
    }
}

