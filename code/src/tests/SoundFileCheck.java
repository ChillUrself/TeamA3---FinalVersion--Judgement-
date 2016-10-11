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
public class SoundFileCheck {

	@Test
	public void Swingtest() {
		SoundClip swing = new SoundClip();
		swing.load("/sounds/SwingSwordMiss.wav");
		assertEquals("/sounds/SwingSwordMiss.wav",swing.getFilename());
	}
	@Test
	public void Interacttest(){
		SoundClip interact = new SoundClip();
		interact.load("/sounds/OpenChest.wav");
		assertEquals("/sounds/OpenChest.wav",interact.getFilename());
	}
	@Test
	public void Titletest(){
		SoundClip titlemusic = new SoundClip();
		titlemusic.load("/sounds/TitleMusic.wav");
		assertEquals("/sounds/TitleMusic.wav",titlemusic.getFilename());
	}
	@Test
	public void BGMusictest(){
		SoundClip gamemusic = new SoundClip();
		gamemusic.load("/sounds/GameLoop.wav");
		assertEquals("/sounds/GameLoop.wav",gamemusic.getFilename());
	}

}
