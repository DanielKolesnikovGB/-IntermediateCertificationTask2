package methods;

class addToy{
    private int toyId;
    private String toyName;
    private int toyAmount;
    private float toyProbability;
    /**
     * @param id - id игрушки
     * @param name - текстовое название
     * @param amount - количество
     * @param probability - частота выпадения в процентах
     */
    protected addToy(int id, String name, int amount, float probability){
        this.toyId = id;
        this.toyName = name;  
        this.toyAmount = amount;
        this.toyProbability = probability;
    }
}