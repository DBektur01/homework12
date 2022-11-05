public class University {
    private int id;
    private String name;
    private String address;
    private int FoundationDate;
    private String Website;

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
    void setAddress(String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }
    void setFoundationDate( int FoundationDate){
        this.FoundationDate=FoundationDate;
    }
    int getFoundationDate(){

        return FoundationDate;
    }
    void setWebsite(String Website){
        this.Website=Website;
    }
    String getWebsite(){
        return Website;
    }
}
