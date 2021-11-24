import { Router } from 'express'; 

class EmployeeRoutes{
    public router: Router = Router();

    constructor() {

    }

    config():void {
        this.router.get('/', (requ,res) => res.send('Employee'));  
    }
}

const employeeRoutes = new EmployeeRoutes();
export default employeeRoutes.router;