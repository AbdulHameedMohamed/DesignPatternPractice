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
public class HouseDirector {

    public static void main(String[] args) {

        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(woodHouse);
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        House clayHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(clayHouse);

        HouseBuilder gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
        House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(gingerbreadHouse);

    }
}
