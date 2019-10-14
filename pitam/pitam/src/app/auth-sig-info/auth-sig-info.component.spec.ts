import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthSigInfoComponent } from './auth-sig-info.component';

describe('AuthSigInfoComponent', () => {
  let component: AuthSigInfoComponent;
  let fixture: ComponentFixture<AuthSigInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AuthSigInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AuthSigInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
