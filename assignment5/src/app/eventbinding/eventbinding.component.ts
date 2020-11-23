import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {
  name:any='';
  onkey(event:any){
    this.name=event.target.value;
  }

  value:any='';
  onenter(value:string){
    this.value=value;
  }
  
  val:any='';
  onenter1(key:string){
    this.val=key;
  }

  User:any;
  Clicked(){
    this.User='Button clicked';
  }

  constructor() { }

  ngOnInit(): void {
  }

}
