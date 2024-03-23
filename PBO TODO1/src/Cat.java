public class Cat {

    private String catName;
    private double weight;
    private String age;
    private String furColor;
    private String type;

    public Cat (String catName, double weight, String age, String furColor, String type) {
        this.catName = catName;
        this.weight = weight;
        this.age = age;
        this.furColor= furColor;
        this.type = type;
    }

    public void eat(){
        weight++;
    }

    public void meowing(){
        System.out.println(catName + "Meow Meowwww");
    }

    public void sleep(){
        weight--;
    }

    public String getCatName(){
        return this.catName;
    }

    public void setCatName (String catName){
        this.catName = catName;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight (double weight){
        this.weight = weight;
    }

    public String getAge(){
        return this.age;
    }

    public void setAge (String age){
        this.age = age;
    }

    public String getFurColor(){
        return this.furColor;
    }

    public void setFurColor (String furColor){
        this.furColor = furColor;
    }

    public String getType(){
        return this.type;
    }

    public void setType (String type){
        this.type = type;
    }
}

