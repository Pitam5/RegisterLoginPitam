import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BusiInfoComponent } from './busi-info.component';

describe('BusiInfoComponent', () => {
  let component: BusiInfoComponent;
  let fixture: ComponentFixture<BusiInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BusiInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BusiInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
