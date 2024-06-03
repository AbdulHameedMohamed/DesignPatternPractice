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
public class GingerbreadHouseBuilder extends HouseBuilder {

    int numWalls = 4;
    int numWindows = 4;
    String windowMaterial = "Sugar";
    String wallMaterial = "Gingerbread and icing";
    String roofMaterial = "Twizzlers";

    public GingerbreadHouseBuilder() {
        this.builderName = "Gingerbread House Builder";
        setHouseType(HouseType.GINGERBREAD);
    }

    @Override
    public HouseBuilder addWalls() {
        for (int i = 0; i < numWalls; i++) {
            System.out.println("Adding wall made out of " + wallMaterial);
            house.addWall(new Wall(wallMaterial));
        }
        return this;
    }

    @Override
    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows; i++) {
            System.out.println("Adding window made out of " + windowMaterial);
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }

    @Override
    public HouseBuilder addRoof() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    @Override
    public House build() {
        System.out.println("Stick everything together with icing");
        return house;
    }
}
