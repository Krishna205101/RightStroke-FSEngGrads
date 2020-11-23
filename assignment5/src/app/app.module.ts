import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { EventbindingComponent } from './eventbinding/eventbinding.component';
import { TemplatereferenceComponent } from './templatereference/templatereference.component';
import { GridComponent } from './grid/grid.component';
import { DropdownComponent } from './dropdown/dropdown.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';

const ROUTES: Routes = [
  { path: "", component: DatabindingComponent },
  { path: "event", component: EventbindingComponent },
  { path: "template", component: TemplatereferenceComponent },
  { path: "parent-child", component: ParentComponent },
  { path: "grid", component: GridComponent },
  { path: "dropdown", component: DropdownComponent }
]


@NgModule({
  declarations: [
    AppComponent,
    DatabindingComponent,
    EventbindingComponent,
    TemplatereferenceComponent,
    GridComponent,
    DropdownComponent,
    ParentComponent,
    ChildComponent],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
