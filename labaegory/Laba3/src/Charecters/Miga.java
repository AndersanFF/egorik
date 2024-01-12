package Charecters;

import EnumAndInterfaces.Items;

public class Miga extends Char {
    public Miga(){
    super("Мига");
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
    public void see(){
        System.out.println(this.name + " увидел");
    }
    @Override
    public void talk(){
        System.out.println(this.name +" сказав");
    }
    @Override
    public void undressed(){
        System.out.println(this.name +" разделся");
    }
    @Override
    public void jump(){
        System.out.println(this.name +" спрыгнул" + Items.niz);
    }
    @Override
    public void ostavil(){
        System.out.println(this.name +" оставил" + Items.odezhda);
    }
}
