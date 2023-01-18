import { Component, OnInit } from '@angular/core';
import {Book} from "../common/book";
import {BookService} from "../services/book.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-view-book-details',
  templateUrl: './view-book-details.component.html',
  styleUrls: ['./view-book-details.component.css']
})
export class ViewBookDetailsComponent implements OnInit {

  id!: number
  book!: Book
  baseUrl: string = "http://localhost:8080/books/getFile/";
  constructor(private route: ActivatedRoute, private bookService: BookService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.book = new Book();
    this.bookService.getBookById(this.id).subscribe( data => {
      this.book = data;
    });
  }
}
