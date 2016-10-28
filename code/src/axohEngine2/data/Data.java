/**********************************************************************
 * @author Travis R. Dewitt
 * @version 1.0
 * Date: June 15, 2015
 * Test
 * Title: Data
 * Description: Hold data from a game in variables for serializing later
 * <p>
 * <p>
 * This work is licensed under a Attribution-NonCommercial 4.0 International
 * CC BY-NC-ND license. http://creativecommons.org/licenses/by-nc/4.0/
 *********************************************************************/
//Package
package axohEngine2.data;

import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = -4668422157233446222L;

    //Variables to be updated and saved or accessed at some point
    private int _playerX, _playerY, mapX, mapY;
    private String name;
    private int width, height;
	private int playerHealth, playerMagic;
// gets the health
    public int getPlayerHealth() {
		return playerHealth;
	}
//sets player health
	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}
//gets player magic
	public int getPlayerMagic() {
		return playerMagic;
	}
//sets player magic
	public void setPlayerMagic(int playerMagic) {
		this.playerMagic = playerMagic;
	}
// sets the width to i
    public void setWidth(int i){
    	width = i;
    }
  //sets height to i
    public void setHeight(int i){
    	height = i;
    }
    //get the width  of the game
    public int getWidth(){
    	return width;
    }
    // returns the height of the game
    public int getHeight(){
    	return height;
    }
//gets player x position
    public int getPlayerX() {
        return _playerX;
    }
//get player y position
    public int getPlayerY() {
        return _playerY;
    }
//gets the name of player
    public String getName() {
        return name;
    }
//sets the name of the player(the beginning of the game)
    public void setName(String n) {
        name = n;
    }
//sets the player location at the start
    public void setPlayerLocation(int x, int y) {
        _playerX = x;
        _playerY = y;
    }
    //sets the location of where the map is
    public void setMapLocation(int x, int y){
    	mapX = x;
    	mapY = y;
    }
    //gets the map x direction
    public int getMapX(){
    	return mapX;
    }
    //gets map y direction
    public int getMapY(){
    	return mapY;
    }
    
}
