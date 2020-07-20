------------------------------------------------------Angullar---------------------------------------------------------
 * to cheack Angullar version :-  ng --version
 * to create new Angullar app :-  ng new AngullarProject  (dont use uderscore,number special character).
 * npn install (for node module)

 * ng g c componantname
Main.ts:-
		* it is use for bootstrap Loading.
          * 
		import { enableProdMode } from '@angular/core';
		import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

		import { AppModule } from './app/app.module';    //import the AppModule 
		import { environment } from './environments/environment';

		if (environment.production) {
		  enableProdMode();
		}

		platformBrowserDynamic().bootstrapModule(AppModule)//then it bootstrap it
		  .catch(err => console.log(err));

-----------------------------------------------------------------------------------------------------------------------
app.Module.ts:-
		



-----------------------------------------------------------------------------------------------------------------------
