package org.steambuddy.app.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class GenreEntity extends AbstractEntity {

	@Column(name = "name")
	private String name;

	@ManyToMany(targetEntity = GameEntity.class, mappedBy = "genres")
	private Set<GameEntity> games;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenreEntity(String name) {
		this.name = name;
	}

	public Set<GameEntity> getGames() {
		return games;
	}

	public void setGames(Set<GameEntity> games) {
		this.games = games;
	}

	public GenreEntity() {
	}

}
