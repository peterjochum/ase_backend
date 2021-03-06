package org.steambuddy.api.dto;

import java.util.List;

public class GameDTO {

	private Long id;
	private String name;
	private Integer year;
	private String image;
	private String text;
	private List<GenreDTO> genres;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<GenreDTO> getGenres() {
		return genres;
	}

	public void setGenres(List<GenreDTO> genres) {
		this.genres = genres;
	}

	public static GameDTO getInstance(String name, Integer year, String image, String text) {
		GameDTO instance = new GameDTO();
		instance.setName(name);
		instance.setYear(year);
		instance.setImage(image);
		instance.setText(text);
		return instance;
	}

}
