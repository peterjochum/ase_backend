package org.steambuddy.api;

import static org.steambuddy.api.ModuleConfigurationConstants.INTERNAL_PATH_PREFIX;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.steambuddy.api.dto.GenreDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "GenreResource")
@RequestMapping(value = INTERNAL_PATH_PREFIX + "/api/genres")
public interface GenreResource {

	@ApiOperation(value = "Get the list of all genres.", nickname = "getGenres", notes = "Returns all genres.", tags = "GenreResource", response = GenreDTO.class, responseContainer = "List")
	@ResponseBody
	@GetMapping("/")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
	            value = "Results page you want to retrieve (0..N)")})
	List<GenreDTO> getGenres(Pageable pageable);

	@ApiOperation(value = "Get publisher which contain the given name", nickname = "getGenreByName", notes = "Returns found genres.", tags = "GenreResource", response = GenreDTO.class, responseContainer = "List")
	@ResponseBody
	@GetMapping(path = "/{name}")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
	            value = "Results page you want to retrieve (0..N)")})
	List<GenreDTO> getGenres(@PathVariable("name") String name, Pageable pageable);

	@ApiOperation(value = "Get genre by id.", nickname = "getGenre", notes = "Returns genre or null.", tags = "GenreResource", response = GenreDTO.class)
	@ResponseBody
	@GetMapping(path = "/{id}")
	GenreDTO getGenre(@PathVariable("id") Long id);
}
