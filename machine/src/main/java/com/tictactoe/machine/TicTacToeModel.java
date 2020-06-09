package com.tictactoe.machine;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TicTacToeModel {

    @Id
    private String boardstate;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;
    private String six;
    private String seven;
    private String eight;
    private String nine;

    public TicTacToeModel(String boardstate) {
        this.boardstate = boardstate;
    }

    public String getBoardstate() {
        return this.boardstate;
    }

    public void setBoardstate(String boardstate) {
        this.boardstate = boardstate;
    }

    public String getOne() {
        return this.one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return this.two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return this.three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return this.four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return this.five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public String getSix() {
        return this.six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getSeven() {
        return this.seven;
    }

    public void setSeven(String seven) {
        this.seven = seven;
    }

    public String getEight() {
        return this.eight;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }

    public String getNine() {
        return this.nine;
    }

    public void setNine(String nine) {
        this.nine = nine;
    }

}