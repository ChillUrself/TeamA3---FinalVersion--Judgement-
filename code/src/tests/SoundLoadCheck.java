/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import axohEngine2.sound.SoundClip;

/**
 * @author Charles
 * version 1.0
 * last updated: 10.11.2016
 */
public class SoundLoadCheck {

	@Test
	public void SwingLoadtest() {
		SoundClip swing = new SoundClip();
		swing.load("/sounds/SwingSwordMiss.wav");
		assertEquals(true, swing.isLoaded());
	}
	@Test
	public void InteractLoadtest() {
		SoundClip interact = new SoundClip();
		interact.load("/sounds/OpenChest.wav");
		assertEquals(true, interact.isLoaded());
	}
	@Test
	public void TitleLoadtest() {
		SoundClip title = new SoundClip();
		title.load("/sounds/TitleMusic.wav");
		assertEquals(true, title.isLoaded());
	}
	@Test
	public void GameMusictest() {
		SoundClip gamemusic = new SoundClip();
		gamemusic.load("/sounds/GameLoop.wav");
		assertEquals(true, gamemusic.isLoaded());
	}

}
