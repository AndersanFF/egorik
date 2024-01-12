package EnumAndInterfaces;

public enum Items{
    odezhda(" одежда на полке"),
    niz(" вниз"),
    pol(" на полу"),
    polki(" между полками голышом");


    private String title;

    Items(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }

}

