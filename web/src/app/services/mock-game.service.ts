import { Injectable } from '@angular/core';
import { Game } from '../interfaces/game';
import { Observable, of } from 'rxjs';
import { IGameService } from '../interfaces/gameservice';

@Injectable({
  providedIn: 'root',
})
export class MockGameService implements IGameService {
  constructor() {}

  FakeGames: Game[] = [
    {
      id: 1,
      name: 'Cyberpunk 2077',
      year: 2020,
      image: 'https://images.igdb.com/igdb/image/upload/t_cover_big/co2mjs.jpg',
      text:
        'Cyberpunk 2077 is a role-playing video game developed and published by CD Projekt. Adapted from the Cyberpunk franchise, the game is an open world, non-linear RPG with an FPS style in which players are able to heavily customize their character to suit their play style. Gun play, exploration, player choice and activities such as hacking are to feature heavily throughout the game with missions, quests and objectives being completed in a variety of different ways. The world will have dynamic weather and a day/night cycle to make it truly immersive.',
    },
    {
      id: 2,
      name: 'The Witcher 3: Wild Hunt',
      year: 2015,
      image: 'https://images.igdb.com/igdb/image/upload/t_cover_big/co1wyy.jpg',
      text:
        'RPG and sequel to The Witcher 2 (2011), The Witcher 3 follows witcher Geralt of Rivia as he seeks out his former lover and his young subject while intermingling with the political workings of the wartorn Northern Kingdoms. Geralt has to fight monsters and deal with people of all sorts in order to solve complex problems and settle contentious disputes, each ranging from the personal to the world-changing.',
    },
    {
      id: 3,
      name: 'The Elderscrolls VI',
      year: 2220,
      image: 'https://images.igdb.com/igdb/image/upload/t_cover_big/co1ycv.jpg',
      text: 'The long awaited next installment in the Elder Scrolls franchise.',
    },
  ];

  getGames(): Observable<Game[]> {
    return of(this.FakeGames);
  }
}