import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dropdown',
  templateUrl: './dropdown.component.html',
  styleUrls: ['./dropdown.component.css']
})
export class DropdownComponent implements OnInit {
  k:number=0
  countries=[
    {Id:1,Country:"India"},
    {Id:2,Country:"US"},
    {Id:3,Country:"UK"},
  ]


  constructor() { }

  ngOnInit(): void {
  }

}
