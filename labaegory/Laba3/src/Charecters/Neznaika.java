package Charecters;

public class Neznaika extends Char{
    public Neznaika(){
        super("Незнайка");
    }
    @Override
    public void action(){

    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void talk(){
        System.out.println(this.name + " сказал");
    }
    @Override
    public void wakeUp(){
        System.out.println(this.name + " проснулся");
    }
    @Override
    public void sledoval(){
        System.out.println(this.name + " последовал его примеру");
    }
    @Override
    public void see(){
        System.out.println("Он увидел");
    }
    
}
