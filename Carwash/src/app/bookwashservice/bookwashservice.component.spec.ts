import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookwashserviceComponent } from './bookwashservice.component';

describe('BookwashserviceComponent', () => {
  let component: BookwashserviceComponent;
  let fixture: ComponentFixture<BookwashserviceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookwashserviceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookwashserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
