package com.wangkakyi.集合.实验十四集合;

import java.util.ArrayList;
import java.util.Comparator;

class Poker{
    private int point;
    private String color;

    public Poker(int point, String color) {
        this.point = point;
        this.color = color;
    }

    public Poker() {
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "point=" + point +
                ", color='" + color + '\'' +
                '}';
    }
}
class PokerComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Poker p1 = (Poker) o1;
        Poker p2 = (Poker) o2;
        if(p1.getColor().compareTo(p2.getColor())==0){
            if(p1.getPoint()>p1.getPoint())
            {
                return 1;
            }else if(p1.getPoint()==p1.getPoint()){
                return 0;
            }else
                return -1;
        }else if(p1.getColor().compareTo(p2.getColor())<0){
              return -1;
        }else
            return 1;
    }
}
class Game{
    private ArrayList<Poker> list;

    public Game(ArrayList<Poker> list) {
        this.list = list;
    }

    public Game() {
    }

    public ArrayList<Poker> getList() {
        return list;
    }

    public void setList(ArrayList<Poker> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Game{" +
                "list=" + list +
                '}';
    }
    public void showAll(){
        System.out.println("Game{" +
                "list=" + list +
                '}');
    }
    public void sort(){
        this.list.sort(new PokerComparator());
    }
}
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Poker> list = new ArrayList<>();
        list.add(new Poker(7, "红桃"));
        list.add(new Poker(6, "黑桃"));
        list.add(new Poker(8, "红桃"));
        list.add(new Poker(4, "红桃"));
        list.add(new Poker(3, "黑桃"));
        Game game = new Game(list);
        list.sort(new PokerComparator());
        game.showAll();
    }
}
