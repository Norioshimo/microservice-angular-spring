
import { Injectable } from '@angular/core';
import { Alumno } from '../models';
import { CommonService } from './common.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AlumnoService extends CommonService<Alumno> {

  protected baseEndpoint = `http://localhost:8080/api/usuario`;

  constructor(http: HttpClient) {
    super(http);
  }
}
