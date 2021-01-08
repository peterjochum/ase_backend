package org.steambuddy.app.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.steambuddy.api.dto.GenreDTO;
import org.steambuddy.app.entity.GenreEntity;

@Service
public class GenreMapper {

	public List<GenreDTO> mapEntityToDTO(List<GenreEntity> from) {
		return from.stream().map(g -> entityToDTO(g)).collect(Collectors.toList());
	}

	private GenreDTO entityToDTO(GenreEntity from) {
		GenreDTO to = new GenreDTO();
		to.setId(from.getId());
		to.setName(from.getName());
		return to;
	}

}