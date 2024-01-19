import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Clint } from '../Entity/Clint';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class RoomService {

  addEmpURL : string;
  getEmpURL : string;
  updateEmpUrl : string;
  deleteEmpUrl : string;
  constructor(private http : HttpClient) {
    this.addEmpURL = 'http://localhost:8086/postClint';
    this.getEmpURL = 'http://localhost:8086/Clint';
    this.updateEmpUrl = 'http://localhost:8086/updateClint';
    this.deleteEmpUrl = 'http://localhost:8086/deleteClint';

   }

   addClint(Clint : Clint): Observable<Clint> {
     return this.http.post<Clint>(this.addEmpURL,Clint);
   }

   getAllClint(): Observable<Clint[]>{
     return this.http.get<Clint[]>(this.getEmpURL);
   }

   updateClint(Clint :Clint) : Observable<Clint>{
     return this.http.put<Clint>(this.updateEmpUrl, Clint);
   }

  findAll(): Observable<any> {
    console.log(Clint)
    return this.http.get('http://localhost:8086/Clint');
  }

   deleteClint(Clint : Clint) : Observable<Clint> {
     return this.http.delete<Clint>(this.deleteEmpUrl+'/'+Clint.ClintId);
   }


}