public class Motocycle {

    private String model;
    private String make;
    private int year;

    Motocycle(String model, String make, int year){
        this.setModel(model);
        this.setMake(make);
        this.setYear(year);

    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setMake(String make){
        this.make=make;
    }

    public void setYear(int year){
        this.year=year;
    }
}
