/****************************************************************************************************
 * @author Travis R. Dewitt
 * @version 1.0
 * Date: June 15, 2015
 * <p>
 * <p>
 * Title: Event
 * Description: Think of every time a cutscene starts or a chest is opened or a tree collapses,
 * these actions are happening because of a trigger, this class is that trigger as well as it
 * contains what the trigger starts.
 * <p>
 * Currently the Events that are available are warping and item obtaining, edit this class in the future
 * to allow for additional events.
 * <p>
 * This work is licensed under a Attribution-NonCommercial 4.0 International
 * CC BY-NC-ND license. http://creativecommons.org/licenses/by-nc/4.0/
 ****************************************************************************************************/
//Package
package axohEngine2.map;

import axohEngine2.Judgement;

//Imports

import axohEngine2.project.Item;
import axohEngine2.project.TYPE;

public class Event {

    //Warping variables
	private int eventX, eventY;
    private int newX, newY;
    private Map _mapName;
    private Map _overlayName;

    //Item getting variables
    private String _name;
    private Item _item;

    //Event Type
    private TYPE type;
    private Judgement _judge;

    /**********************************************************
     * Constructor
     *
     * @param name - A String detailing an events name
     * @param type - An Enum detailing the type of event
     **********************************************************/
    public Event(String name, TYPE type) {
        _name = name;
        this.type = type;
    }

    /************************************************************
     * Set up a warp event
     *
     * @param mapName     - A String detailing the name of the map which was set in the map Database
     * @param overlayName - Same as mapName
     * @param x           - player x Int
     * @param y           - player y Int
     *************************************************************/
    
    //warp event specific methods
    //used to find distance between player and 
    public void setWarp(Judgement frame, Map mapName, Map overlayName, int x, int y) {
        _mapName = mapName;
        _overlayName = overlayName;
        newX = x;
        newY = y;
        _judge = frame;
    }
    
    public void setWarpLoc(int x ,int y){
    	eventX = x;
    	eventY = y;
    }
    
    public int getWarpX(){
    	return eventX;
    }
    public int getWarpY(){
    	return eventY;
    }
    
    public void updateEvents(){
    	if (Math.sqrt((Math.pow(this.getWarpX() - _judge.getPlayerX(), 2) + Math.pow((this.getWarpY() - _judge.getPlayerY()),2)))  <= 200 ) {
			_judge.setCurrentMap(_mapName);
			_judge.setCurrentOverlay(_overlayName);
		}
    }

    /**************************************************
     * All of these are getters, they take no paramter, but return what you ask for
     **************************************************/
    public Map getMapName() {
        return _mapName;
    }

    public Map getOverlayName() {
        return _overlayName;
    }

    public int getNewX() {
        return newX;
    }

    public int getNewY() {
        return newY;
    }

    public TYPE getEventType() {
        return type;
    }

    public String getname() {
        return _name;
    }

    public Item getItem() {
        return _item;
    }

    /************************************************
     * Set an Item to this event
     *
     * @param item - Of type Item
     ************************************************/
    public void setItem(Item item) {
        _item = item;
    }
}
