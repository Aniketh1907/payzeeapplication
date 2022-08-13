import { Component, OnInit } from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { DialogComponent } from 'src/app/dialog/dialog.component';
@Component({
  selector: 'app-transferamount',
  templateUrl: './transferamount.component.html',
  styleUrls: ['./transferamount.component.css']
})
export class TransferamountComponent implements OnInit {

  constructor(private dialog:MatDialog) { }
  openDialog() {
    this.dialog.open(DialogComponent, {
     width:"60%"
    });}
  ngOnInit(): void {
  }

}
