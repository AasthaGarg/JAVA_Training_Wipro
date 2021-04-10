package com.bean;

public class Player {
	public String playerId;
	public String playerName;
	public Country country;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String playerId, String playerName, Country country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
	}
	
	

}
