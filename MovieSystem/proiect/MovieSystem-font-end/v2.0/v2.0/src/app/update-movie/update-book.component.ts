import { Component, OnInit } from '@angular/core';
import {Book} from "../common/book";
import {ActivatedRoute, Router} from "@angular/router";
import {BookService} from "../services/book.service";

@Component({
  selector: 'app-update-book',
  templateUrl: './update-book.component.html',
  styleUrls: ['./update-book.component.css']
})
export class UpdateBookComponent implements OnInit {

  id!: number;
  book: Book = new Book();
  constructor(private bookService: BookService,
              private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.bookService.getBookById(this.id).subscribe(data => {
      this.book = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.bookService.updateBook(this.id, this.book).subscribe( data =>{
        this.goToBookList();
      }
      , error => console.log(error));
  }

  goToBookList(){
    this.router.navigate(['/getAllBooks']);
  }

}
