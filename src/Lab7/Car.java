
class Car{
    private String brand;
    private String model;
    
    public Car(String brand,String model){
        this.brand=brand;
        this.model=model;
    
    } 
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setmodel(String model){
        this.model=model;
    
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getModel(){
        return model;
    }
     
}
