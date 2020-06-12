package movies;

public class Movie {

    private String name;
    private String category;

    //setter for name
    public void setName(String name){
        this.name = name;
    }

    //getter for name
    public String getName(){
        return name;
    }

    //getter for category
    public String getCategory() {
        return category;
    }

    //setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    //Constructor to set name and category
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }



}
