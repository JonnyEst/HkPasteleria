import { Router } from 'express'; 

class IndexRoutes{
    public router: Router = Router();

    constructor() {

    }

    config():void {
        this.router.get('/', (requ,res) => res.send('hello'));  
    }
}

const indexRoutes = new IndexRoutes();
export default indexRoutes.router;