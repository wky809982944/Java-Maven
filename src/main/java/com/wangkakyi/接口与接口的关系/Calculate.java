package com.wangkakyi.接口与接口的关系;
class Animal{
    private Eye eye;
    private Nose nose;
    private Skin skin;
    private Tail tail;
    private Leg  leg;

    public Animal(Eye eye, Nose nose, Skin skin, Tail tail, Leg leg) {
        this.eye = eye;
        this.nose = nose;
        this.skin = skin;
        this.tail = tail;
        this.leg = leg;
    }

    public Eye getEye() {
        return eye;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public Nose getNose() {
        return nose;
    }

    public void setNose(Nose nose) {
        this.nose = nose;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
class Eye implements Action{
    @Override
    public void work() {
        System.out.println("动眼睛");

    }
}
class Nose implements Action{
    public void work() {
        System.out.println("动鼻子");

    }
}
class Skin implements Action{
    public void work() {
        System.out.println("动皮肤");

    }
}
class Tail implements Action{
    public void work() {
        System.out.println("动尾巴");

    }
}
class Leg implements Action{
        public void work() {
            System.out.println("动腿");

        }
}
class Bear extends Animal{
    private String name;

    public Bear(Eye eye, Nose nose, Skin skin, Tail tail, Leg leg, String name) {
        super(eye, nose, skin, tail, leg);
        this.name = name;
    }
    public void work(){
        System.out.println(this.name);
        super.getEye().work();
        super.getNose().work();
        super.getSkin().work();
        super.getTail().work();
        super.getLeg().work();
    };
}
interface Action{
    void work();
}
public class Calculate {
    public static void main(String args[]) {
           Bear b1=new Bear(new Eye(), new Nose(),new Skin() , new Tail() ,new Leg(), "熊大");
           Bear b2=new Bear(new Eye(), new Nose() ,new Skin(), new Tail() ,new Leg(), "熊二");
           b1.work();
           b2.work();
    }
}
