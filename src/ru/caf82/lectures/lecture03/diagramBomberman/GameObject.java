/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.caf82.lectures.lecture03.diagramBomberman;

/**
 *
 * @author kasuc
 */
public interface GameObject {
    void move();
    void start();
    void finish(); //создали интерфейс, от которого все наследуется
}
