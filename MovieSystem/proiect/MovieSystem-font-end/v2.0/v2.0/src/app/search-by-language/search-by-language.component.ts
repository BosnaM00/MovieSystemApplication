import { Component, OnInit } from '@angular/core';
import {Book} from "../common/book";
import {BookService} from "../services/book.service";

@Component({
  selector: 'app-search-by-language',
  templateUrl: './search-by-language.component.html',
  styleUrls: ['./search-by-language.component.css']
})
export class SearchByLanguageComponent implements OnInit {

  bookLanguage!: Object;

  constructor(private bookService: BookService) {
  }

  ngOnInit(): void {
    this.getBooksByLanguages();
  }

  getBooksByLanguages() {
        /*this.bookService.getBooksByLanguages().subscribe(
          data => {
            console.log("Book language" + JSON.stringify(data));
            this.bookLanguage = data;
          }
        )*/
  }
}
