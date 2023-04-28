public class Item {

    protected String name;
    protected String des;
    protected int value;

    public Item(String name, int value){
        this.name = name;
        this.value= value;
    }

    public Item(String name,String des, int value){
        this.name = name;
        this.des = des;
        this.value= value;
    }

    public Item() {

    }

    public String toString(){
        return String.format("%s \n=====\n %S \nValue= %d \n", this.name,this.des, this.value);
    }
}
