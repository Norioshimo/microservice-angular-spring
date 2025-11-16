import { Injectable } from '@angular/core';
import { CommonService } from './common.service';
import { Curso } from '../models';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CursoService  extends CommonService<Curso> {

  protected baseEndpoint = `http://localhost:8080/api/curso`;

  constructor(http: HttpClient) {
      super(http);
    }
}