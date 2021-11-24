import { Component, OnInit, HostBinding  } from '@angular/core';
import { CakeService } from '../../services/cake.service';


@Component({
  selector: 'app-cake-list',
  templateUrl: './cake-list.component.html',
  styleUrls: ['./cake-list.component.css']
})
export class CakeListComponent implements OnInit {

  @HostBinding('class') classes = 'row';

  cake: any = [];

  constructor(private cakeService: CakeService) { }

  ngOnInit(): void {
    this.getCake();
  }

  getCake() {
    this.cakeService.getCakes().subscribe (
      (      res: any) => {
        this.cake = res;
      },
      (      err: any) => console.error(err)
    );
  }

  deleteCake(id: string) {
    this.cakeService.deleteCake(id).subscribe(
      (      res: any) => {
          console.log(res);
          this.getCake(); 
      },
      (      err: any) => console.log(err)
    );
  }

  

}
