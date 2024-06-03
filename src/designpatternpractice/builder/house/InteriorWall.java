/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.builder.house;

/**
 *
 * @author w
 */
public class InteriorWall extends Wall {

    public InteriorWall(String material) {
        super(material);
        this.name = "Interior wall made out of " + material;
    }
}
