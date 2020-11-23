import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
    
    Users=[
      {id:1,fname:"Krishna"},
      {id:2,fname:"Naga"},
      {id:2,fname:"Raju"}
    ];

  constructor() { }

  ngOnInit(): void {
  }

}
