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
public class Roof extends Component {

    public Roof(String material) {
        this.name = "Roof made out of " + material;
    }
}
