public class FoodBox extends LootBox {
    public FoodBox(int x, int y, Food food){
        super(x, y, food);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice Yo got a Food.");
        else
            return "";
    }
}
