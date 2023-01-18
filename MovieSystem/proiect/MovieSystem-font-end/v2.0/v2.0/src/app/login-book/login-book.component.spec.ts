import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginBookComponent } from './login-book.component';

describe('LoginBookComponent', () => {
  let component: LoginBookComponent;
  let fixture: ComponentFixture<LoginBookComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginBookComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoginBookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
