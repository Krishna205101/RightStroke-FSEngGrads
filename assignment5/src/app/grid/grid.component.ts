import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grid',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.css']
})
export class GridComponent implements OnInit {
  persons = [

  ];
 
  Id:number;
  Product: String;
  Description:String;
  Cost:String;
  
  add(Id,Product,Description,Cost){
    this.persons.push({
      "Id":Id,
      "Product": Product,
      "Description":Description,
      "Cost":Cost
      
    });

    // resetting the input field
   
    this.Id = undefined;
    this.Product = "";
    this.Description="";
    this.Cost="";
  }

  constructor() { }

  ngOnInit(): void {
  }

}
