import { Component, OnInit } from '@angular/core';
import { stringify } from '@angular/compiler/src/util';

@Component({
  selector: 'app-templatereference',
  templateUrl: './templatereference.component.html',
  styleUrls: ['./templatereference.component.css']
})
export class TemplatereferenceComponent implements OnInit {
  selectedcity:number=0;

  public student:any=[
    {
      id:1,
      name:'Krishna',
      branch:'CSE',
      year : '3'
    },
    {
      id:2,
      name:'Raju',
      branch:'ECE',
      year : '4'
    },
    {
      id:3,
      name:'Naveen',
      branch:'CIVIL',
      year : '3'
    },
    {
      id:4,
      name:'SaiRam',
      branch:'CSE',
      year : '4'
    },
    {
      id:5,
      name:'Gagan',
      branch:'CSE',
      year : '3'
    }
  ];
  Str:String=''
  log(id:number)
  {
    for(var s of this.student)
    {
      if(s.id===+id)
      {
          this.Str=`${s.name} is from ${s.year} year ${s.branch}`;
      }
    }
   }

  constructor() { }

  ngOnInit(): void {
  }

}
