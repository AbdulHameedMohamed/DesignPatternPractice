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
public class WoodHouseBuilder extends HouseBuilder {

    int numWalls = 6;
    int numWindows = 10;
    String windowMaterial = "Tempered glass";
    String wallMaterial = "Wood, 4x6";
    String interiorWallMaterial = "Wood, 2x4";
    String roofMaterial = "Metal";

    public WoodHouseBuilder() {
        this.builderName = "Wood House Builder";
        setHouseType(HouseType.WOOD);
    }

    @Override
    public HouseBuilder addWalls() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Nailing wood for wall made out of " + wallMaterial);
            house.addWall(new Wall(wallMaterial));
        }
        
        for (int i = 0; i < numWalls - 4; i++) {
            System.out.println("Nailing wood for interior wall made out of " + interiorWallMaterial);
            house.addWall(new InteriorWall(interiorWallMaterial));
        }
        return this;
    }

    public HouseBuilder addWindows() {
        for (int i = 0; i < numWindows; i++) {
            System.out.println("Adding window made out of " + windowMaterial);
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }

    public HouseBuilder addRoof() {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    public House build() {
        System.out.println("Nail everything together");
        return house;
    }
}
