public class Car {
    private int id;
    private String name;
    private String model;
    private int year;

    void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    void setName( String name){
        this.name=name;
    }
    String getName(){

        return name;
    }

    void setModel( String model){

        this.model=model;
    }
    String getModel(){

        return model;
    }
    void setYear(int year){
        this.year=year;
    }
    int getYear(){
        return year;
    }
}
