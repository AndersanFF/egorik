package Charecters;

import java.util.Objects;

import EnumAndInterfaces.Jump;
import EnumAndInterfaces.Ostavil;
import EnumAndInterfaces.See;
import EnumAndInterfaces.Sledoval;
import EnumAndInterfaces.Stay;
import EnumAndInterfaces.Talk;
import EnumAndInterfaces.Undressed;
import EnumAndInterfaces.Wakeup;

public abstract class Char implements See, Talk, Undressed, Jump, Wakeup, Ostavil, Sledoval, Stay{
    protected String name;
    public Char(String name){
        this.name = name;
    }
    public abstract void action();
    public abstract void setName(String name);
    public abstract String getName();
    @Override
    public void see(){}
    @Override
    public void talk(){}
    @Override
    public void undressed(){}
    @Override
    public void jump(){}
    @Override
    public void wakeUp(){}
    @Override
    public void ostavil(){}
    @Override
    public void sledoval(){}
    @Override
    public void stay(){}
    @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Char entity = (Char) o;
            return name == entity.name;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
}
