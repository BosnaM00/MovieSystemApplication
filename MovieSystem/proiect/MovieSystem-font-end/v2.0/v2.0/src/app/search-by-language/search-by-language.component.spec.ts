import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchByLanguageComponent } from './search-by-language.component';

describe('SearchByLanguageComponent', () => {
  let component: SearchByLanguageComponent;
  let fixture: ComponentFixture<SearchByLanguageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchByLanguageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchByLanguageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
