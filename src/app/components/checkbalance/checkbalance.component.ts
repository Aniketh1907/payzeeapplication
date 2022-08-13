import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SenderService } from 'src/app/sender.service';
import { Senderdetails } from 'src/app/senderdetails';

@Component({
  selector: 'app-checkbalance',
  templateUrl: './checkbalance.component.html',
  styleUrls: ['./checkbalance.component.css']
})
export class CheckbalanceComponent implements OnInit {
  senders:any;
  customerId!: number;
// credential={
//     id:number,
      
//   }
  // credential={
  //     id:number,
  //   }
  // customerId!: number;
 // sender:Senderdetails=new Senderdetails();
  constructor( private senderService:SenderService,
    ) { }
    // private senderService:SenderService,
    // private route: ActivatedRoute
    public getCustomer(){
          let resp=this.senderService.getSenderId(this.customerId);
    resp.subscribe((data)=>this.senders=data);
    console.log(resp);
    console.log();
    }
  ngOnInit(): void {
    // this.customerId=this.route.snapshot.params['customerId'];
    // this.senderService.getSenderById(this.customerId).subscribe(
    //   data=>{
    //     this.sender=data;
        
    //   },error=>console.log(error)
    // );
    // let resp=this.senderService.getUsers();
    // resp.subscribe((data)=>this.senders=data);
  }
 

}
