import { Injectable } from '@angular/core';
import { CommonService } from './common.service';
import { Examen } from '../models';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ExamenService extends CommonService<Examen> {

  protected baseEndpoint = `http://localhost:8080/api/examen`;

  constructor(http: HttpClient) {
      super(http);
    }
}
