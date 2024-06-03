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
public class Wall extends Component {

    public Wall(String material) {
        this.name = "Wall made out of " + material;
    }
}
