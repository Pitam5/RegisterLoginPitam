import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { VerifyComponent } from './verify/verify.component';
import { BusiInfoComponent } from './busi-info/busi-info.component';
import { AuthSigInfoComponent } from './auth-sig-info/auth-sig-info.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProgBarComponent } from './prog-bar/prog-bar.component';

const routes: Routes = [
  {path:'',component: LoginComponent},
  {path:'login',component: LoginComponent},
  {path:'registration',component: RegistrationComponent},
  {path:'verify',component: VerifyComponent},
  {path:'busiinfo',component: BusiInfoComponent},
  {path:'authsiginfo',component: AuthSigInfoComponent},
  {path:'welcome',component: WelcomeComponent},
  {path:'progbar',component: ProgBarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
