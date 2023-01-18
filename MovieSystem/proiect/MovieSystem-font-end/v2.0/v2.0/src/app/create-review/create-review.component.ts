import { Component, OnInit } from '@angular/core';
import {Review} from "../common/review";
import {Book} from "../common/book";
import {BookService} from "../services/book.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-review',
  templateUrl: './create-review.component.html',
  styleUrls: ['./create-review.component.css']
})
export class CreateReviewComponent implements OnInit {

  review: Review = new Review();
  reviews: Review[];

  constructor(private bookService: BookService) { }

  ngOnInit(): void {
    this.getReviews()
  }

  private getReviews(){
    this.bookService.getReviewsList().subscribe(data => {
      console.log(data)
      this.reviews = data;
    });
  }

  saveReview(){
    this.bookService.addReview(this.review).subscribe( data =>{
        console.log(data);
        alert("Thank you for the review!")
      },
      error => console.log(error));
    alert("Thank you for the review!")
    this.reviews.push(this.review)
  }

  onSubmit(){
    console.log(this.review);
    this.saveReview();
  }

}
