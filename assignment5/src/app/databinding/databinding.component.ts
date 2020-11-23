import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {
  name:String="Krishna";
  Firstname:String="";
  url='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2gu5t6mJLLi7XkiV4K_vzetO6sKp02_65gw&usqp=CAU'

  read(username:String){
      alert(`${username} you have clicked the submit button`);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
