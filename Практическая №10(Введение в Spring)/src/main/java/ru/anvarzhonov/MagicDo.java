package ru.anvarzhonov;

public class MagicDo {
    private Magican magican;


    public MagicDo(Magican magican) {
        this.magican = magican;
    }

    public void DoingMagic(){
        System.out.println("Magic: "+ magican.fight());
    }
}
