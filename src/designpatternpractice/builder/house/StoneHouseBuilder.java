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
public class StoneHouseBuilder extends HouseBuilder {

    int numWalls = 5;
    int numWindows = 20;
    String windowMaterial = "Antique glass";
    String wallMaterial = "Stone, 2 feet thick";
    String interiorWallMaterial = "Stone, 1 foot thick";
    String roofMaterial = "Tile";

    public StoneHouseBuilder() {
        this.builderName = "Stone House Builder";
        setHouseType(HouseType.STONE);
    }

    @Override
    public HouseBuilder addWalls() {
        for (int i = 0; i < numWalls - 1; i++) {
            house.addWall(new Wall(interiorWallMaterial));
        }
        
        house.addWall(new InteriorWall(wallMaterial));
        return this;
    }

    @Override
    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows; i++) {
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
        System.out.println("Stick everything together with mortar");
        return house;
    }
}
